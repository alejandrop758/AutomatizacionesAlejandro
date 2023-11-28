package com.haceb.pageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ValidacionPage extends PageObject {

    @FindBy(how = How.XPATH,using = "(//div[@class='vtex-pageHeader__title t-heading-2 order-0 flex-grow-1'])[2]")
    public WebElementFacade inputPerfilValidar;
}
