package webdriver.configuration;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.WebDriver;

public abstract class WebDriverSetup {

    public abstract WebDriver createWebDriver();

}
