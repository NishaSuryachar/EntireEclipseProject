package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage 
{
   @FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
   private WebElement CreateContactLookUp;
    
    public ContactsPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }

	public WebElement getCreateContactLookUp()
	{
		return CreateContactLookUp;
	}
	
	
	/**
	 * This method will click on CreateContactLookUp
	 */
     public void ClickOnCreateContactsLookUpImg()
    {
    	 CreateContactLookUp.click();
    }
}


