package automation.testcreation.ultimateQA.pages;

import automation.engine.selenium.SeleniumBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class RecuperarPage extends SeleniumBase {
    public RecuperarPage(WebDriver driver) {
        super(driver);
    }
    By email = By.xpath("//div/descendant::input[contains(@id,\"email\")]");
    By submit = By.xpath("//div/descendant::input[contains(@value,\"Submit\")]");

    public void sendEmail(String mail) throws Exception {
        if (!isDisplayed(email)){
            throw new Exception("Elemento no Encontrado");
        }
        type(mail, email);
        click(submit);
    }


}
