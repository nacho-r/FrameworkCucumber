package automation.testcreation.ultimateQA.steps;

import automation.engine.selenium.DriverFactory;
import automation.testcreation.ultimateQA.pages.HomePage;
import automation.testcreation.ultimateQA.pages.LoginPage;
import io.cucumber.java.en.*;

public class LoginExitosoSteps {
    protected HomePage home = new HomePage(DriverFactory.getDriver());
    protected LoginPage login = new LoginPage(DriverFactory.getDriver());

    @Given("el usuario está registrado, se inicia sesion con las credenciales correctas se debe mostrar el texto {string}")
    public void el_usuario_está_registrado_se_inicia_sesion_con_las_credenciales_correctas_se_debe_mostrar_el_texto(String string) throws Exception {
        login.validateTitle(string);
    }

    @When("el usuario ingresa el {string} y la {string} correspondiente")
    public void el_usuario_ingresa_el_y_la_correspondiente(String string, String string2) throws Exception {
        login.login(string, string2);
    }

    @Then("al presionar el boton Sign In mostrara {string} en Inicio.")
    public void al_presionar_el_boton_sign_in_mostrara_en_inicio(String string) throws InterruptedException {
        home.validacionNombre(string);
    }
}
