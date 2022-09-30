package pages.menu;

import action.Acciones;
import net.serenitybdd.core.pages.PageObject;
import util.MenuMapeo;

public class Menu extends PageObject {

    public void munu() throws InterruptedException {
        Acciones.wait(getDriver(), MenuMapeo.titulo);
        Acciones.click(getDriver(), MenuMapeo.menu);
        Acciones.click(getDriver(), MenuMapeo.gestionNivelCaudal);
        Acciones.click(getDriver(), MenuMapeo.consultarAforo);
    }
}
