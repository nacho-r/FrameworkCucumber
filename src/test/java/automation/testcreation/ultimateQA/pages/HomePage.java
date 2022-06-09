package automation.testcreation.ultimateQA.pages;

import automation.engine.selenium.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage extends SeleniumBase {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    By signIn = By.xpath("//section/descendant::a[contains(text(), \"Sign In\")]");
    By name;
    By section;
    public void validacionUrl(String url){
        goToUrl(url);
    }

    public void inicioSesion() throws Exception {
        if (!isDisplayed(signIn)){
            throw new Exception("Elemento no Encontrado");
        }
        click(signIn);
    }

    public void validacionNombre(String text){

        String user = getText(name);
        Assert.assertEquals(text, user);

    }

    public void ingresoCurso(String curso) throws Exception {
        section  = By.xpath("//div/descendant::h3[contains(text(),\""+curso+"\")]");
        if (!isDisplayed(section)){
            throw new Exception("Elemento no Encontrado");
        }

        click(section);
    }

}
