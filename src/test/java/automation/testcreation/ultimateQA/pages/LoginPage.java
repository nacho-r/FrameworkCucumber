package automation.testcreation.ultimateQA.pages;

import automation.engine.selenium.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage extends SeleniumBase{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By newAccount = By.xpath("//a[contains(text(),\"new account\")]");
    By title = By.xpath("//article/h1");
    By email = By.xpath("//div/descendant::input[contains(@id,\"email\")]");
    By password = By.xpath("//div/descendant::input[contains(@id,\"password\")]");
    By btnSign = By.xpath("//div/descendant::input[contains(@value,\"Sign in\")]");
    By msjError = By.xpath("//div/descendant::li[contains(text(),\"Invalid\")]");
    By forgotPass = By.xpath("//div/descendant::a[contains(text(),\"Forgot Password\")]");

    public void createNewAccount(String text) throws Exception {

        String account = getText(newAccount);
        Assert.assertEquals(text, account);
        click(newAccount);
    }
    public void validateTitle(String text) throws Exception {
        String account = getText(title);
        Assert.assertEquals(text, account);
        click(title);
    }

    public void login(String mail, String pass) throws Exception {
        if (!isDisplayed(email)){
            throw new Exception("Elemento no Encontrado");
        }
        type(mail,email);
        type(pass, password);
        click(btnSign);

    }

    public void mensjError(String msj) throws Exception {
        Thread.sleep(5000);
        String error = getText(msjError);
        Assert.assertEquals(msj, error);
    }

    public void RecuperarContraseña() throws Exception {
        if (!isDisplayed(forgotPass)){
            throw new Exception("Elemento no Encontrado");
        }

        click(forgotPass);
    }

}
