/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

import org.openqa.selenium.WebDriver;

public class Navigation {
    public WebDriver  _driver;
    
    public Navigation(WebDriver driver) {
         _driver = driver;
    }
    
    public void GoToRelatedUrl(String baseUrl){
        _driver.get(baseUrl);
    }
}
