package com.haceb.pageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegistroPage extends PageObject {


    @FindBy(how = How.XPATH, using = "//span[@class='icon-user']")
    public WebElementFacade spanIconuser;


    @FindBy(how = How.XPATH, using = "//a[@class='cdc-fire cdc-register']")
    public WebElementFacade aregistro;
    @FindBy(how = How.XPATH, using = "//button[@id='vtexIdUI-custom-oauth']")
    public WebElementFacade buttonRegistro;

//                     DATOS DE REGHISTRO 1
    @FindBy(how = How.XPATH, using = "(//input[@name='email'])[4]")
    public WebElementFacade inputCorreo;

    @FindBy(how = How.XPATH, using = "(//input[@name='profile.firstName'])[2]")
    public WebElementFacade idNombre;

    @FindBy(how = How.XPATH, using = "//*[@id='gigya-textbox-146410824335495100']")
    public WebElementFacade idApellido;

    @FindBy(how = How.XPATH, using = "//*[@id='gigya-password-54061940132406190']")
    public WebElementFacade idanContra;
    @FindBy(how = How.XPATH, using = "//*[@id='gigya-password-142670944012194750']")
    public WebElementFacade idConfirContra;

    @FindBy(how = How.XPATH, using = "(//span[@data-translation-key='CHECKBOX_70031539084410860_LABEL'])[3]")
    public WebElementFacade spanCHECKBOX1;

    @FindBy(how = How.XPATH, using = " (//label[@data-translation-key='MULTICHOICE_109350074984747230_CHOICES_B326B5062B2F0E69046810717534CB09'])[2]")
    public WebElementFacade labelAutoriza;
    @FindBy(how = How.XPATH, using = "(//input[@class='gigya-input-submit hc-register-screen-submit invi'])[2]")
    public WebElementFacade inputRegistro;

}

