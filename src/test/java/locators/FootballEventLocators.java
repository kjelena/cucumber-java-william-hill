package locators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
public class FootballEventLocators{

        // We can use factory, but we will be not so flexible on low level.
        public static By BetInput = By.cssSelector("[id*='stake-input']"); 
	    public static By OddsTxt = By.cssSelector("[id*='bet-price']");
        public static By TotalReturnPriceTxt = By.id("total-to-return-price");
	}