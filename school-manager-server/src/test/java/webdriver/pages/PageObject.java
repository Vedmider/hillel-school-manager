package webdriver.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import webdriver.configuration.CSSSelectors;

import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


@Component
public class PageObject {
    private Logger LOG = LoggerFactory.getLogger(PageObject.class);
    private static final String LINKED_INN_LOGIN_PAGE = "https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin";
    private static final String LOGIN = "login";
    private static final String PASSWORD = "password";
    private static final Condition clickable = Condition.and("clickable", Condition.visible, Condition.enabled);
    private static final List<SelenideElement> contactsToAddInSearchResultsPage = $(
            "div[class^='blended-srp-results-js']")
            .$$("button[data-control-name='srp_profile_actions']");
    private static final SelenideElement invitationDialogElement = $("div[role='dialog']");
    private static final List<SelenideElement> paginationNumbers = $$("li[data-test-pagination-page-btn]");
    private static final SelenideElement nextPageButton = $("button[class*='artdeco-pagination__button--next']");
    private static final SelenideElement previousPageButton = $("button[class*='artdeco-pagination__button--previous']");
    public static final int DEFAULT_VISIBILITY_ELEMENT_TIMEOUT = 10_000;


    public PageObject login() {
        open(LINKED_INN_LOGIN_PAGE);
        typeLogin(LOGIN);
        typePassword(PASSWORD);
        clickSignIn();
        waitForPageLoaded();
        return this;
    }

    private void typeLogin(String login) {

        $(CSSSelectors.getLoginSelector()).shouldBe(Condition.visible).setValue(login);
    }

    private void typePassword(String password) {
        $(CSSSelectors.getPasswordSelector()).shouldBe(Condition.visible).setValue(password);
    }

    private void clickSignIn() {
        $(CSSSelectors.getSignInButton()).shouldBe(Condition.and(
                "clickable",
                Condition.visible,
                Condition.enabled
        )).click();
    }


    private void waitForPageLoaded() {
        new WebDriverWait(WebDriverRunner.getWebDriver(), Duration.ofSeconds(20L))
                .until(driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState")
                        .equals("complete"));
    }

    private int getNumberOfSearchResultsPages() {
        scrollDownSearchResultsPage();
        List<Integer> searchResultsPageNumbers = paginationNumbers.stream()
                .map(element -> Integer.valueOf(element.$$("span")
                        .get(0)
                        .getText()))
                .collect(Collectors.toList());
        scrollToStartOfSearchResultsPage();
        return Collections.max(searchResultsPageNumbers);
    }

    private int getCurrentPageNumber() {
        String currentPageValue = paginationNumbers.stream()
                .map(element -> element.$("button"))
                .filter(element -> element.getAttribute("aria-label")
                        .contains("current"))
                .findFirst().get().$$("span").get(0).getText();
        return Integer.valueOf(currentPageValue);
    }

    private void scrollDownSearchResultsPage() {
        LOG.info("Start to execute java script to scroll down");
        executeJavaScript("window.scrollTo(0, document.body.scrollHeight);");
        waitForPageLoaded();
    }

    private void scrollToStartOfSearchResultsPage() {
        LOG.info("Start to execute java script to scroll up");
        executeJavaScript("window.scrollTo(0, 0);");
    }

}