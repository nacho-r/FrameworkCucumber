package automation.testcreation.ultimateQA.steps;

import automation.engine.selenium.DriverFactory;
import automation.testcreation.ultimateQA.pages.HomePage;
import automation.testcreation.ultimateQA.pages.LoginPage;
import automation.testcreation.ultimateQA.pages.RegistroPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistroNuevoUsuarioSteps {
    protected HomePage home = new HomePage(DriverFactory.getDriver());
    protected LoginPage login = new LoginPage(DriverFactory.getDriver());
    protected RegistroPage registro = new RegistroPage(DriverFactory.getDriver());

    @Given("que se esta en la url {string}")
    public void que_se_esta_en_la_url(String string) {
        home.validacionUrl(string);
    }

    @When("presiona el boton Sign In")
    public void presiona_el_boton_sign_in() throws Exception {
        home.inicioSesion();
    }

    @When("que el usuario presiona el boton {string}")
    public void que_el_usuario_presiona_el_boton(String string) throws Exception {
        login.createNewAccount(string);
    }

    @When("el usuario ingresa los datos {string}, {string}, {string}, {string}")
    public void el_usuario_ingresa_los_datos(String string, String string2, String string3, String string4) throws Exception {
        registro.llenarFormulario(string, string2, string3, string4);
    }

    @When("presiona el boton de aceptar terminos y condiciones")
    public void presiona_el_boton_de_aceptar_terminos_y_condiciones() throws InterruptedException {
        registro.clickRegistro();
    }

    @Then("al presionar el boton Sign Up mostrara {string} en Inicio.")
    public void al_presionar_el_boton_sign_up_mostrara_en_inicio(String string) throws InterruptedException {
        home.validacionNombre(string);
    }

}
