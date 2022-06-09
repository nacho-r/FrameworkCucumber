package automation.testcreation.ultimateQA.steps;

import automation.engine.selenium.DriverFactory;
import automation.testcreation.ultimateQA.pages.LoginPage;
import io.cucumber.java.en.*;

public class LoginFallidoSteps {
    protected LoginPage login = new LoginPage(DriverFactory.getDriver());

    @Given("el usuario se inicia sesion con las credeciales incorrectas se debe mostrar el texto {string}")
    public void el_usuario_se_inicia_sesion_con_las_credeciales_incorrectas_se_debe_mostrar_el_texto(String string) throws Exception {
        login.validateTitle(string);
    }

    @When("el usuario ingresa el {string} y la {string}")
    public void el_usuario_ingresa_el_y_la(String string, String string2) throws Exception {
        login.login(string, string2);
    }

    @Then("al presionar el boton Sign In mostrara mensaje de {string}")
    public void al_presionar_el_boton_sign_in_mostrara_mensaje_de(String string) throws Exception {
        login.mensjError(string);
    }

}
