package pages.login;

import action.Acciones;
import net.serenitybdd.core.pages.PageObject;
import util.LoginMapeo;

public class Login extends PageObject {

    public void ingresarAcueducto(){
        Acciones.goTo(getDriver(), "http://3.236.134.149:8080/sish-frontend/#/inicio");
    }

    public void ingresarUsuarioContrasena(String usuario, String contraseña) throws InterruptedException {
        Acciones.write(getDriver(), LoginMapeo.usuario, usuario);
        Acciones.write(getDriver(), LoginMapeo.contraseña, usuario);
        Acciones.click(getDriver(), LoginMapeo.ingresar);
        Thread.sleep(5000);
    }
}
