package util;

import org.openqa.selenium.By;

public class MenuMapeo {

    public static final By titulo = By.xpath("//div[@class = 'sish-titulo-portada text-center']");
    public static final By menu = By.xpath("//a[@data-widget = 'pushmenu']");
    public static final By gestionNivelCaudal = By.xpath("//p[contains(text(), ' Gestión Nivel Caudal ')]");
    public static final By consultarAforo = By.xpath("//p[contains(text(), 'Consultar Aforos ')]");
}
