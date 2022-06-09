package automation.testcreation.ultimateQA.pages;

import automation.engine.selenium.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MensajeRecuperarPage extends SeleniumBase {
    public MensajeRecuperarPage(WebDriver driver) {
        super(driver);
    }


    By msj = By.xpath("//div/descendant::h1");

    public void mensajeEnviado(String mensaje) throws Exception {

        String enviado = getText(msj);
        Assert.assertEquals(mensaje, enviado);
    }
}
