package pages.aforo;

import action.Acciones;
import cucumber.api.java.bs.A;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actions.Switch;
import org.openqa.selenium.By;
import util.CrearAforoMapeo;
import util.Xls_Reader;

import java.rmi.activation.ActivationID;

public class CrearAforo extends PageObject {

    Xls_Reader reader = new Xls_Reader("src/test/resources/datos/aforo.xlsx");
    String sheetName1 = "abscisa";
    String sheetName2 = "datos";

    By opciones;
    String opcion = "//option[contains(text(),' %s ')]";

    public void datosAforo() throws InterruptedException {
        Thread.sleep(3000);
        //Seleccionar tipo de elemento
        Acciones.click(getDriver(), CrearAforoMapeo.tipoElemento);
        Acciones.write(getDriver(), CrearAforoMapeo.buscar, "Estacion");
        Acciones.click(getDriver(), CrearAforoMapeo.primerDato);
        // seleccionar elemento
        Thread.sleep(5000);
        Acciones.click(getDriver(), CrearAforoMapeo.nombreElemento);
        Acciones.write(getDriver(), CrearAforoMapeo.buscar, "Acueducto 11");
        Acciones.click(getDriver(), CrearAforoMapeo.primerDato);
        //nombre corriente
        Acciones.write(getDriver(), CrearAforoMapeo.nombreCorriente, "prueba 100");
        //Datos del Aforo
        Acciones.scroll(getDriver(), "intermedio");
        Acciones.write(getDriver(), CrearAforoMapeo.fecha, "14/08/2022");
        Acciones.write(getDriver(), CrearAforoMapeo.horaInicial, "9:7p");
        Acciones.write(getDriver(), CrearAforoMapeo.nivelInicial, "0,03");
        Acciones.write(getDriver(), CrearAforoMapeo.horaFinal, "10:7p");
        Acciones.write(getDriver(), CrearAforoMapeo.nivelFinal, "0,03");
        Acciones.click(getDriver(), CrearAforoMapeo.aforador);
        Acciones.write(getDriver(), CrearAforoMapeo.buscar, "OSCAR IVAN HERRERA");
        Acciones.click(getDriver(), CrearAforoMapeo.primerDato);
        Acciones.click(getDriver(), CrearAforoMapeo.crearAforo);
        Thread.sleep(2000);
        //Identificacion del punto
        Acciones.click(getDriver(), CrearAforoMapeo.tipoCoordenada);
        Acciones.write(getDriver(), CrearAforoMapeo.buscar, "Geografica");
        Acciones.click(getDriver(), CrearAforoMapeo.primerDato);
        Acciones.write(getDriver(), CrearAforoMapeo.latitud, "78.989865");
        Acciones.write(getDriver(), CrearAforoMapeo.longitud, "-65.989865");
        Thread.sleep(2000);

        //Identificacion del equipo
        Acciones.click(getDriver(), CrearAforoMapeo.tipoCorrentometro);
        Acciones.write(getDriver(), CrearAforoMapeo.buscar, "Micromolinete");
        Acciones.click(getDriver(), CrearAforoMapeo.primerDato);
        Thread.sleep(2000);
        Acciones.click(getDriver(), CrearAforoMapeo.marcaSerie);
        Acciones.write(getDriver(), CrearAforoMapeo.buscar, "SEBA-2061-250-1969");
        Acciones.click(getDriver(), CrearAforoMapeo.primerDato);
        Acciones.click(getDriver(), CrearAforoMapeo.metodoMedicion);
        Acciones.write(getDriver(), CrearAforoMapeo.buscar, "Vadeo");
        Acciones.click(getDriver(), CrearAforoMapeo.primerDato);
        Thread.sleep(2000);

        //Agregar abscisa

        int rowCount1 = reader.getRowCount(sheetName1);
        for (int rowNum1 = 2; rowNum1 <= rowCount1; rowNum1++) {
            String abscisa = reader.getCellData(sheetName1, "seccion", rowNum1);
            String profundidad = reader.getCellData(sheetName1, "profundidad", rowNum1);

            Acciones.click(getDriver(), CrearAforoMapeo.agregarAscisa);
            Acciones.write(getDriver(), CrearAforoMapeo.abscisa, abscisa);
            Thread.sleep(1000);
            Acciones.write(getDriver(), CrearAforoMapeo.profundidad, profundidad);
            Thread.sleep(1000);
            Acciones.click(getDriver(), CrearAforoMapeo.agregar);
            Thread.sleep(2000);
        }

        //Agregar datos de la abscisa
        int rowCount2 = reader.getRowCount(sheetName2);
        for (int rowNum2 = 2; rowNum2 <= rowCount2; rowNum2++) {
            String datoAbscisa = reader.getCellData(sheetName2, "datoAbscisa", rowNum2);
            String profundidadParcial = reader.getCellData(sheetName2, "profundidadParcial", rowNum2);
            System.out.println("+++++++++++++++++++++++++------------" + datoAbscisa);
            System.out.println("+++++++++++++++++++++++++------------" + profundidadParcial);
            Acciones.click(getDriver(), CrearAforoMapeo.agregardatos);
            Thread.sleep(2000);
            Acciones.click(getDriver(), CrearAforoMapeo.seleccionarAbscisa);
            Thread.sleep(2000);
            opciones = By.xpath(String.format(opcion, datoAbscisa));
            Acciones.click(getDriver(), opciones);
            Thread.sleep(2000);
            Acciones.click(getDriver(), CrearAforoMapeo.seleccionarProfundidad);
            Thread.sleep(2000);
            opciones = By.xpath(String.format(opcion, profundidadParcial));
            Acciones.click(getDriver(), opciones);
            Thread.sleep(2000);

        }
    }
}
