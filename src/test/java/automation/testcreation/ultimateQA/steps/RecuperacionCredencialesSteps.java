package automation.testcreation.ultimateQA.steps;

import automation.engine.selenium.DriverFactory;
import automation.testcreation.ultimateQA.pages.LoginPage;
import automation.testcreation.ultimateQA.pages.MensajeRecuperarPage;
import automation.testcreation.ultimateQA.pages.RecuperarPage;
import io.cucumber.java.en.*;

public class RecuperacionCredencialesSteps {
    protected LoginPage login = new LoginPage(DriverFactory.getDriver());
    protected RecuperarPage recuperar = new RecuperarPage(DriverFactory.getDriver());
    protected MensajeRecuperarPage msj = new MensajeRecuperarPage(DriverFactory.getDriver());

    @Given("que el usuario tuvo un login fallido, se presiona el boton Forgot Password?")
    public void que_el_usuario_tuvo_un_login_fallido_se_presiona_el_boton_forgot_password() throws Exception {
        login.RecuperarContraseña();
    }

    @When("el usuario ingresa {string} y presiona el boton Submit")
    public void el_usuario_ingresa_y_presiona_el_boton_submit(String string) throws Exception {
        recuperar.sendEmail(string);
    }

    @Then("se muestra un mensaje {string}")
    public void se_muestra_un_mensaje(String string) throws Exception {
        msj.mensajeEnviado(string);
    }


}
