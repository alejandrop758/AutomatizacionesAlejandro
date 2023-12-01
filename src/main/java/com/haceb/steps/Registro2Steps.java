package com.haceb.steps;

import com.haceb.pageObject.Registro2Page;
import com.haceb.utils.Data;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import static com.haceb.utils.Selects.selects;

public class Registro2Steps {
    @Page
    Registro2Page registro2Page;


    @Step("Completar el fomulario de registro 2")
    public void completarFormulario2(){

        registro2Page.inputCedula.sendKeys(Data.extractTo().get(0).get("Cedula"));

        selects(registro2Page.seleGenero,Data.extractTo().get(0).get("Genero"));

        registro2Page.inputFecha.sendKeys(Data.extractTo().get(0).get("Fecha"));

        selects(registro2Page.selectpais,Data.extractTo().get(0).get("CodigoP"));

        registro2Page.selecNumerocont.sendKeys(Data.extractTo().get(0).get("Telefono"));

        selects(registro2Page.selectDepartamento,Data.extractTo().get(0).get("Departamento"));

        selects(registro2Page.selectCiudad,Data.extractTo().get(0).get("Ciudad"));

        registro2Page.labelAutorizar2.click();
        registro2Page.inputEnviar.click();

    }



//        Refactorizacion
//        Select select= new Select(registroPage.selectDepartamento);
//        select.selectByVisibleText(Data.extractTo().get(0).get("Departamento"));
//    No se usa ya esta seleccionado
//        JavascriptExecutor js = (JavascriptExecutor) registroPage.getDriver();
//        js.executeScript("arguments[0].click();", registroPage.spanCHECKBOX2);


}

