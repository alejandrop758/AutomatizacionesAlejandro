package com.haceb.steps;

import com.haceb.pageObject.RegistroPage;
import com.haceb.utils.Data;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import static com.haceb.utils.Selects.selects;

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

    @Step("completar el formulario de registro 1")
    public void completarFormulario() {

        registroPage.inputCorreo.sendKeys(Data.extractTo().get(0).get("Correo"));
        registroPage.idNombre.sendKeys(Data.extractTo().get(0).get("Nombre"));
        registroPage.idApellido.sendKeys(Data.extractTo().get(0).get("Apellido"));
        registroPage.idanContra.sendKeys(Data.extractTo().get(0).get("Contrasena"));
        registroPage.idConfirContra.sendKeys(Data.extractTo().get(0).get("ConfirContrasena"));

        JavascriptExecutor js = (JavascriptExecutor) registroPage.getDriver();
        js.executeScript("arguments[0].click();", registroPage.spanCHECKBOX1);

        registroPage.labelAutoriza.click();
        registroPage.inputRegistro.click();
    }

}
