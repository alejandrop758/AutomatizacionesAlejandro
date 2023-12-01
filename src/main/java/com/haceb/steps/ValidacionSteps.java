package com.haceb.steps;

import com.haceb.pageObject.InicioPage;

import com.haceb.pageObject.ValidacionPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

import static com.haceb.utils.Esperas.espera1;

public class ValidacionSteps {
    @Page
    ValidacionPage validacionPage;

    @Step("Abrir Ventana y Validar el Registro Exitoso")
    public void validacionPerfil() {
        for (String windowHandle : validacionPage.getDriver().getWindowHandles()) {
            if(!validacionPage.getDriver().getWindowHandle().contentEquals(windowHandle)) {
                validacionPage.getDriver().switchTo().window(windowHandle);
                break;
            }
        }

        espera1(validacionPage.getDriver(),validacionPage.inputPerfilValidar);
        Assert.assertTrue(validacionPage.inputPerfilValidar.isDisplayed());

    }
}
