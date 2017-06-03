/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.openqa.selenium.WebDriver;
import step_definitions_as_page_objects.Hooks;

/**
 *
 * @author KUSEDU
 */
public class StateHolder {
    
    public static Object CreateObject(Class myClass) throws NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        WebDriver Driver = Hooks.driver;
        return myClass.getDeclaredConstructor(WebDriver.class).newInstance(Driver);   
    }
}

