package automation.testcreation.ultimateQA.steps;

import automation.engine.selenium.DriverFactory;
import automation.testcreation.ultimateQA.pages.CursoModernReactPage;
import automation.testcreation.ultimateQA.pages.HomePage;
import automation.testcreation.ultimateQA.pages.LoginPage;
import io.cucumber.java.en.*;

public class IngresoCursoSteps {
    protected HomePage home = new HomePage(DriverFactory.getDriver());
    protected CursoModernReactPage curso = new CursoModernReactPage(DriverFactory.getDriver());

    @When("en la seccion de cursos presiona el curso {string}")
    public void en_la_seccion_de_cursos_presiona_el_curso(String string) throws Exception {

        home.ingresoCurso(string);
    }

    @Then("presiona el boton para iniciar video")
    public void presiona_el_boton_para_iniciar_video() throws Exception {
        curso.startVideo();
    }

}
