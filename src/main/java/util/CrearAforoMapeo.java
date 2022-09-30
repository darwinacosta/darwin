package util;

import org.openqa.selenium.By;

public class CrearAforoMapeo {

    public static final By tipoElemento = By.xpath("//ng-select2[@name= 'nombreElemento' and @formcontrolname= 'idTipoElemento']");
    public static final By nombreElemento = By.xpath("//ng-select2[@name= 'nombreElemento' and @formcontrolname= 'idElemento']");
    public static final By nombreCorriente = By.xpath("//input[@name= 'nombreCorriente' and @formcontrolname= 'nombreCorriente']");
    //Datos del aforo
    public static final By fecha = By.xpath("//input[@name= 'fecha' and @formcontrolname= 'fecha']");
    public static final By horaInicial = By.xpath("//input[@name= 'horaInicial' and @formcontrolname= 'horaInicial']");
    public static final By nivelInicial = By.xpath("//input[@name= 'nivelInicial' and @formcontrolname= 'nivelInicial']");
    public static final By horaFinal = By.xpath("//input[@name= 'horaFinal' and @formcontrolname= 'horaFinal']");
    public static final By nivelFinal = By.xpath("//input[@name= 'nivelFinal' and @formcontrolname= 'nivelFinal']");
    public static final By aforador = By.xpath("//ng-select2[@name= 'idAforoAforador' and @formcontrolname= 'idAforoAforador']");
    public static final By crearAforo = By.xpath("//button[contains(text(), ' Crear Aforo ')]");

    //Identificador del punto
    public static final By tipoCoordenada = By.xpath("//ng-select2[@name= 'idTipoCoordenadas' and @formcontrolname= 'idTipoCoordenadas']");
    public static final By latitud = By.xpath("//input[@name= 'Latitud' and @formcontrolname= 'latitud']");
    public static final By longitud = By.xpath("//input[@name= 'Norte' and @formcontrolname= 'longitud']");

    //Identifacion del equipo
    public static final By tipoCorrentometro = By.xpath("//ng-select2[@name= 'idMolinete' and @formcontrolname= 'idMolinete']");
    public static final By marcaSerie = By.xpath("//ng-select2[@name= 'idHelice' and @formcontrolname= 'idHelice']");
    public static final By metodoMedicion = By.xpath("//ng-select2[@name= 'idMetodoMedicion' and @formcontrolname= 'idMetodoMedicion']");

    //Agregar abscisa
    public static final By agregarAscisa = By.xpath("//button[contains(text(), ' Agregar Abscisa ')]");
    public static final By abscisa = By.xpath("//input[@name= 'abscisa']");
    public static final By profundidad = By.xpath("//input[@name= 'profundidadTotal']");
    public static final By agregar = By.xpath("//*[@id=\"ModalAdscisa\"]/div/div/div[3]/button[1]");

    //Agregar datos de la abscisa
    public static final By agregardatos = By.xpath("//button[contains(text(), ' Agregar Dato ')]");
    public static final By seleccionarAbscisa = By.xpath("//*[@id=\"ModalElemento\"]/div/div/div[2]/div/div/div[1]/select");
    public static final By seleccionarProfundidad = By.xpath("//*[@id=\"ModalElemento\"]/div/div/div[2]/div/div/div[2]/select");
    public static final By seleccionarProfundidad1 = By.xpath("//*[@id=\"ModalElemento\"]/div/div/div[2]/div/div/div[3]/select");
    public static final By opciones = By.xpath("//option[contains(text(),'Superficial')]");

    public static final By buscar = By.xpath("//input[@class = 'select2-search__field']");
    public static final By primerDato = By.xpath("/html[1]/body[1]/span[1]/span[1]/span[2]/ul[1]/li[1]");
}
