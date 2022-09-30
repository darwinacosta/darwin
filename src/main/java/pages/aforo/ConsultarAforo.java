package pages.aforo;

import action.Acciones;
import net.serenitybdd.core.pages.PageObject;
import util.ConsultarAforoMapeo;

public class ConsultarAforo extends PageObject {

    public void consultarAforo() throws InterruptedException {
        Thread.sleep(2000);
        Acciones.wait(getDriver(), ConsultarAforoMapeo.tituloAforo);
        Acciones.scroll(getDriver(), "abajo");
        Thread.sleep(2000);
        Acciones.click(getDriver(), ConsultarAforoMapeo.crear);
        Acciones.scroll(getDriver(), "arriba");

    }
}
