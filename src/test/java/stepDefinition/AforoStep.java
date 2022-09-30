package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.aforo.ConsultarAforo;
import pages.aforo.CrearAforo;
import pages.login.Login;
import pages.menu.Menu;
import util.Xls_Reader;

public class AforoStep {

    Xls_Reader reader = new Xls_Reader("src/test/resources/datos/aforo.xlsx");
    Login login;
    Menu menu;
    ConsultarAforo consultarAforo;
    CrearAforo crearAforo;

    @Given("^Ingresar a la url de acueducto$")
    public void ingresarALaUrlDeAcueducto() throws InterruptedException {
        login.ingresarAcueducto();
        String sheetName = "login";
        int rowNum = 2;
        //int rowCount = reader.getRowCount(sheetName);
        //for (int rowNum = 2; rowNum <= rowCount; rowNum++) {}

        String usuario = reader.getCellData(sheetName, "usuario", rowNum);
        String contraseña = reader.getCellData(sheetName, "contraseña", rowNum);
        login.ingresarUsuarioContrasena(usuario,contraseña);


    }

    @When("^El usuario ingresa los datos del aforo$")
    public void elUsuarioIngresaLosDatosDelAforo() throws InterruptedException {
        menu.munu();
        consultarAforo.consultarAforo();
        crearAforo.datosAforo();
    }

    @Then("^Se crea el aforo exito$")
    public void seCreaElAforoExito() {

    }

}
