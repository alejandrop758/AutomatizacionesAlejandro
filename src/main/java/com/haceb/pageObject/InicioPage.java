package com.haceb.pageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class InicioPage extends PageObject {

    @FindBy(how = How.XPATH, using = "//span[@class='icon-user']")
    public WebElementFacade spanIconuser;
    @FindBy(how = How.XPATH, using = "//a[@aria-label='close window']")
    public WebElementFacade apopup;

    @FindBy(how = How.XPATH, using = "//a[@class='cdc-fire cdc-register']")
    public WebElementFacade aregistro;
    @FindBy(how = How.XPATH, using = "//button[@id='vtexIdUI-custom-oauth']")
    public WebElementFacade buttonRegistro;

    @FindBy(how = How.XPATH, using = "(//input[@name='email'])[4]")
    public WebElementFacade inputCorreo;


    @FindBy(how = How.XPATH,using = "//*[@id='orders-page']/div[5]/section/div/div/div/div/aside/nav/a[2]")
    public WebElementFacade inputPerfilValidar;

}
