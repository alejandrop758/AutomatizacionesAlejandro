package com.haceb.pageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Registro2Page extends PageObject {
    //     DATOS ADICIONALES
    @FindBy(how = How.XPATH,using = "(//input[@name='data.cedula'])[2]")
    public WebElementFacade inputCedula;
    @FindBy(how = How.XPATH,using = "(//select[@name='profile.gender'])[2]")
    public WebElementFacade seleGenero;

    @FindBy(how = How.XPATH,using = "//input[@id='gigya-textbox-29430652596742216']")
    public WebElementFacade inputFecha;

    @FindBy(how = How.XPATH,using = "(//select[@class='gigya-country-code-select'])[3]")
    public WebElementFacade selectpais;
    @FindBy(how = How.XPATH,using = "(//input[@class='gigya-input-text gigya-subscriber-phone-number-input'])[3]")
    public WebElementFacade selecNumerocont;

    @FindBy(how = How.XPATH,using = "(//select[@data-screenset-element-id='gigya-dropdown-92626747568210580'])[2]")
    public WebElementFacade selectDepartamento;

    @FindBy(how = How.XPATH,using = "(//select[@name='profile.city'])[2]")
    public WebElementFacade selectCiudad;

    @FindBy(how = How.XPATH,using = "(//span[@class='gigya-label-text gigya-checkbox-text'])[5]")
    public WebElementFacade spanCHECKBOX2;

    @FindBy(how = How.XPATH,using = "(//label[@data-translation-key='MULTICHOICE_75524321350268400_CHOICES_B326B5062B2F0E69046810717534CB09'])[2]")
    public WebElementFacade  labelAutorizar2;

    @FindBy(how = How.XPATH,using = "(//input[@class='gigya-input-submit hc-c-register-screen-submit invi'])[2]")
    public WebElementFacade  inputEnviar;
}
