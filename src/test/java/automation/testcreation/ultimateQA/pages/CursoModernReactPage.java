package automation.testcreation.ultimateQA.pages;

import automation.engine.selenium.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class CursoModernReactPage extends SeleniumBase {
    public CursoModernReactPage(WebDriver driver) {
        super(driver);
    }

    By video = By.xpath("//div/descendant::button[contains(@class,\"play-button \")]");

    public void startVideo() throws Exception {
        if (!isDisplayed(video)){
            throw new Exception("Elemento no Encontrado");
        }

        click(video);
    }
}
