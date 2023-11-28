package com.haceb.steps;

import com.haceb.pageObject.RegistroPage;
import com.haceb.utils.Data;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

public class RegistroSteps {
    @Page
    RegistroPage registroPage;

    @Step("Seleccionar icono de usuario")
    public void seleccionarInconUser(){

        registroPage.spanIconuser.click();
    }

    @Step("Seleccionar registro")
    public void seleccionarRegistro() {

        registroPage.aregistro.click();
    }

    @Step("Seleccionar formulario")
    public void seleccionarFormulario() {

        registroPage.buttonRegistro.waitUntilClickable().click();
    }

    @Step("Seleccionar nueva ventana")
    public void entreVentanas() {
//        String originalWindow = driver.getWindowHandle(); Driver= inicioPage.getDriver()


        for (String windowHandle : registroPage.getDriver().getWindowHandles()) {
            if(!registroPage.getDriver().getWindowHandle().contentEquals(windowHandle)) {
                registroPage.getDriver().switchTo().window(windowHandle);
                break;
            }
        }


    }

    @Step("completar el formulario de registro")
    public void completarFormulario() {

        registroPage.inputCorreo.sendKeys(Data.extractTo().get(0).get("Correo"));
        registroPage.idNombre.sendKeys(Data.extractTo().get(0).get("Nombre"));
        registroPage.idApellido.sendKeys(Data.extractTo().get(0).get("Apellido"));
        registroPage.idanContra.sendKeys(Data.extractTo().get(0).get("Contrasena"));
        registroPage.idConfirContra.sendKeys(Data.extractTo().get(0).get("ConfirContrasena"));
    }
    @Step("seleccionar checkbots")
    public void seleccionarCheckbots() {

        JavascriptExecutor js = (JavascriptExecutor) registroPage.getDriver();
        js.executeScript("arguments[0].click();", registroPage.spanCHECKBOX1);

        registroPage.labelAutoriza.click();
        registroPage.inputRegistro.click();


    }




    @Step("Continuar con el registro")
    public void datosComplementarios(){

        registroPage.inputCedula.sendKeys(Data.extractTo().get(0).get("Cedula"));

        Select select = new Select(registroPage.seleGenero);
        select.selectByVisibleText(Data.extractTo().get(0).get("Genero"));

        registroPage.inputFecha.sendKeys(Data.extractTo().get(0).get("Fecha"));

//        Fecha	CodigoP	Telefono	Departamento	Ciudad

//        Select select1 = new Select(registroPage.selectpais);
//        select.selectByVisibleText(Data.extractTo().get(0).get("CodigoP"));
//


    }

    @Step("Seleccionar pais")
    public void datosTelefono(){
        Select select= new Select(registroPage.selectpais);
        select.selectByVisibleText(Data.extractTo().get(0).get("CodigoP"));

        registroPage.selecNumerocont.sendKeys(Data.extractTo().get(0).get("Telefono"));

    }

    @Step("Seleccionar Departamento")
    public void selectDepartamento(){
        Select select= new Select(registroPage.selectDepartamento);
        select.selectByVisibleText(Data.extractTo().get(0).get("Departamento"));
    }

    @Step("Seleccionar Ciudad")
    public void selectCiudad(){
        Select select= new Select(registroPage.selectCiudad);
        select.selectByVisibleText(Data.extractTo().get(0).get("Ciudad"));
    }

    @Step("Seleccionar Aceptar terminos y condiciones")
    public void seleccionarCheckbots2(){

//        JavascriptExecutor js = (JavascriptExecutor) registroPage.getDriver();
//        js.executeScript("arguments[0].click();", registroPage.spanCHECKBOX2);

        registroPage.labelAutorizar2.click();
        registroPage.inputEnviar.click();
    }
}
