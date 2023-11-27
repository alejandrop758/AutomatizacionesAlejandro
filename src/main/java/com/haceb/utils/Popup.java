package com.haceb.utils;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class Popup {
    public static void popup1( WebElementFacade webElementFacade){
        try{
            boolean visible = webElementFacade.isDisplayed();
            if(visible){
                webElementFacade.click();
            }
        }catch (
                NoSuchElementException ignored){

        }
    }
}


