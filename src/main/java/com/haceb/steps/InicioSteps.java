package com.haceb.steps;

import com.haceb.pageObject.InicioPage;
import com.haceb.pageObject.RegistroPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.NoSuchElementException;

import static com.haceb.utils.Esperas.espera1;
import static com.haceb.utils.Popup.popup1;

public class InicioSteps {
    @Page
    InicioPage inicioPage;

    @Step("Abrir navegador")
    public void abrirNavegador(){
        inicioPage.openUrl("https://www.haceb.com/");

    }
    @Step("cerrar popup")
    public void cerrarPopup(){
        espera1(inicioPage.getDriver(),inicioPage.apopup);
        popup1(inicioPage.apopup);
    }


}
