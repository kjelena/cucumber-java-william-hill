/*
 * Main class suitable for all elements
 */
package ElementActions;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ElementBase {
    
        private WebDriver _driver;

        public ElementBase(WebDriver driver){
            _driver = driver;
        }
        
        protected void WaitUntilElementIsVisible(By by) throws Exception
        {
            WebDriverWait wait = new WebDriverWait(_driver, 10); // Seconds should be stored in one place somewhere, should be const with default timeout
            
            try
            {
                wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            }
            catch (TimeoutException e)
            {
                throw new Exception(String.format("Element is not visible {0}", by));
            }
        }
        
        protected void WaitUntilElementIsClickable(By by) throws Exception
        {
            WebDriverWait wait = new WebDriverWait(_driver, 10);
            
            try
            {
                wait.until(ExpectedConditions.elementToBeClickable(by));
            }
            catch (TimeoutException e)
            {
                throw new Exception(String.format("Element is not clickable {0}", by));
            }
        }
        
        protected WebElement GetLocatedElement(By by) throws Exception
        {
            try
            {
                WebElement elem = _driver.findElement(by);
                return elem;
            }
            catch (NoSuchElementException e)
            {
                throw new Exception(String.format("Element not found {0}", by));
            }
        }
        
}
