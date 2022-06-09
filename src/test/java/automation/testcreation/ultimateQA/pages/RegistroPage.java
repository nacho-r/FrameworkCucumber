package automation.testcreation.ultimateQA.pages;

import automation.engine.selenium.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistroPage extends SeleniumBase {
    public RegistroPage(WebDriver driver) {
        super(driver);
    }
    By nombre = By.xpath("//div/descendant::input[contains(@id,\"first_name\")]");
    By apellido = By.xpath("//div/descendant::input[contains(@id,\"last_name\")]");
    By correo = By.xpath("//div/descendant::input[contains(@id,\"email\")]");
    By contraseña = By.xpath("//div/descendant::input[contains(@id,\"password\")]");
    By terms = By.xpath("//div/descendant::input[contains(@id,\"terms\")]");
    By sign = By.xpath("//div/descendant::input[contains(@value,\"Sign\")]");

    public void llenarFormulario(String name, String last, String email, String pass) throws Exception {
        if (!isDisplayed(sign)){
            throw new Exception("Elemento no Encontrado");
        }

        type(name, nombre);
        type(last, apellido);
        type(email, correo);
        type(pass, contraseña);
    }

    public void clickRegistro() throws InterruptedException {
        click(terms);
        click(sign);

    }
}
