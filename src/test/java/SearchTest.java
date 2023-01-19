import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class SearchTest extends SetUp{
    private HomePage homePage = new HomePage();

    @Epic(value = "Home page.")
    @Feature("Home")
    @Story("Home Search")
    @Description(value = "Search iphone 13.")
    @Test
    public void searchTest() throws InterruptedException{
        open(homePage.HomeURL);
        homePage.inputSearch.click();
        homePage.inputSearch.sendKeys("iphone 13");
        homePage.buttonSearch.click();
        Thread.sleep(5000);
        homePage.resultSearch.click();
        String resultSearch = homePage.resultSearch.getText();
        Assert.assertTrue(resultSearch.contains("Найдено 626 товаров в 5 категориях"));
    }
}
