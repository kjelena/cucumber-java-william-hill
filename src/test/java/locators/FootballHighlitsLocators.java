package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
public class FootballHighlitsLocators{

    // Better to use such locators instead of football club names, names will be changed every day, but betting functionality we will able to test.
	// We can use factory, but we will be not so flexible on low level.
	public static By FootballClubHomeBtn = By.cssSelector("[id='match-highlights'] div:nth-child(1) section > div + div:nth-child(2) div:nth-child(1) button"); 
	public static By FootballClubEventBtn = By.cssSelector("[id='match-highlights'] div:nth-child(1) section > div + div:nth-child(2) ul a");
	}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
