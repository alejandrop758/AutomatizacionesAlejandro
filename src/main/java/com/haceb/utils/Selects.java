    package com.haceb.utils;

    import net.serenitybdd.core.pages.WebElementFacade;
    import org.openqa.selenium.support.ui.Select;

    public class Selects {

        public static void selects ( WebElementFacade webElementFacade, String datos){

            Select select = new Select(webElementFacade);
            select.selectByVisibleText(datos);
        }
    }
