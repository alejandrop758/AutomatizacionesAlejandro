package com.haceb.steps;

import com.haceb.pageObject.InicioPage;

import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

import static com.haceb.utils.Esperas.espera1;

public class ValidacionSteps {
    @Page
    InicioPage inicioPage;

    @Step("completar el formulario de registro")
    public void validacionPerfil() {
        for (String windowHandle : inicioPage.getDriver().getWindowHandles()) {
            if(!inicioPage.getDriver().getWindowHandle().contentEquals(windowHandle)) {
                inicioPage.getDriver().switchTo().window(windowHandle);
                break;
            }
        }
        espera1(inicioPage.getDriver(),inicioPage.inputPerfilValidar);

        Assert.assertTrue(inicioPage.inputPerfilValidar.isDisplayed());

    }
}
