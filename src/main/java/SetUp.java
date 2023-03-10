import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class SetUp {
    @BeforeAll
    public static void setUpAllure() {
        SelenideLogger.addListener("allure", new AllureSelenide().screenshots(true).savePageSource(false));
    }

    @BeforeEach
    public void setUp() {
        //Configuration.startMaximized = true;
        Configuration.timeout = 1000;
        Configuration.browser = "chrome";
        Configuration.headless = false;
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
    }

    @AfterEach
    public void tearDown() {
        WebDriverRunner.closeWebDriver();
    }
}

