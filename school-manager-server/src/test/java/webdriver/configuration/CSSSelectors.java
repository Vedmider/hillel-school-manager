package webdriver.configuration;

import org.openqa.selenium.By;

public class CSSSelectors {
    private static final By LOGIN_SELECTOR = By.cssSelector( "input#username" );
    private static final By PASSWORD_SELECTOR = By.cssSelector( "input#password" );
    private static final By GLOBAL_SEARCH = By.cssSelector(
            "input.search-global-typeahead__input.always-show-placeholder" );
    private static final By SIGN_IN_BUTTON = By.cssSelector( "button.btn__primary--large.from__button--floating" );
    private static final By PEOPLE_ONLY_IN_SEARCH_RESULTS = By.xpath( "//*[@class='search-vertical-filter__filter-item-button artdeco-button artdeco-button--muted artdeco-button--2 artdeco-button--tertiary ember-view'][1]" );
    private static final By AREA_FILTER_BUTTON = By.xpath( "//*[@class='search-s-facet search-s-facet--geoRegion flex-shrink-zero inline-block search-s-facet--is-closed ember-view']/form/button" );
    private static final By SEARCH_INPUT_BOX_IN_SEARCH_AREA = By.cssSelector( "fieldset[class='search-s-facet__values search-s-facet__values--is-floating search-s-facet__values--geoRegion container']");
    private static final By SEARCH_AREA_RESULTS_BOX = By.cssSelector( "div[class='basic-typeahead__triggered-content search-s-add-facet__typeahead-tray']" );

    public static By getSearchInputBoxInSearchArea() {
        return SEARCH_INPUT_BOX_IN_SEARCH_AREA;
    }

    public static By getAreaFilterButton() {
        return AREA_FILTER_BUTTON;
    }

    public static By getSignInButton() {
        return SIGN_IN_BUTTON;
    }

    public static By getLoginSelector() {
        return LOGIN_SELECTOR;
    }

    public static By getPasswordSelector() {
        return PASSWORD_SELECTOR;
    }

    public static By getGlobalSearch() {
        return GLOBAL_SEARCH;
    }

    public static By getPeopleOnlyInSearchResults(){
        return PEOPLE_ONLY_IN_SEARCH_RESULTS;
    }
}
