import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    String HomeURL = "https://www.mvideo.ru/";

    SelenideElement inputSearch = $(By.xpath("//input[contains(@class, 'input__field')]"));
    SelenideElement buttonSearch = $(By.xpath("//div[contains(@class, 'search-icon-wrap')]"));
    SelenideElement resultSearch = $(By.xpath("//p[contains(text(),'Найдено')]"));
}
