/*
 * Base class for inputable elements, can suitable for dropdowns, inputs, datepickers.
 */
package ElementActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author KUSEDU
 */
public class InputElementBase extends ElementBase {
    
    public InputElementBase(WebDriver driver) {
        super(driver);
    }
    
        public void Type(By by, String text) throws Exception {
            WaitUntilElementIsVisible(by);
            WebElement elem = GetLocatedElement(by);
            elem.sendKeys(text);
    }
}
