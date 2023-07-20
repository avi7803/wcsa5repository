package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateUsersPage extends BaseTest {

	@FindBy(xpath="//div[text()='Users']/following-sibling:img") private WebElement Users;
	@FindBy(xpath="//input[@value='Create New User']") private WebElement CreateNewUser;
	@FindBy(xpath="//*[@name='username']") private WebElement Username;
	@FindBy(xpath="//*[@name='passwordText']") private WebElement Password;
	@FindBy(xpath="//*[@name='passwordTextRetype']") private WebElement RetypePass;
	@FindBy(xpath="//*[@name='firstName']") private WebElement firstName;
	@FindBy(xpath="//*[@name='lastName']") private WebElement lastName;
	@FindBy(xpath="//*[@id='right12']") private WebElement ModifyTimeTrack;
	@FindBy(xpath="//*[@id='right2']") private WebElement ManageCust;
	@FindBy(xpath="//*[@id='right1']") private WebElement GenerateReport;
	@FindBy(xpath="//*[@id='right7']") private WebElement ManageUsers;
	@FindBy(xpath="//*[@id='right5']") private WebElement ManageBilling;
	
	@FindBy(xpath="//input[@type='submit']") private WebElement createUserButton;
	@FindBy(xpath = "/HTML/BODY/DIV/FORM/TABLE/TBODY/TR[4]/TD/INPUT[2]") private WebElement cancelButton;
	@FindBy(xpath = "//a[.='Shrama, Rohit (manager_01)']") private WebElement usersLink;
	@FindBy(xpath = "//input[@value='Delete This User']") private WebElement deleteThisUserButton;
	
	public CreateUsersPage(WebDriver driver )
	{
		PageFactory.initElements(driver, this);
	}


	
	
	//Getters
	
	public WebElement getUsers() {
		return Users;
	}


	public WebElement getCreateNewUser() {
		return CreateNewUser;
	}


	public WebElement getUsername() {
		return Username;
	}


	public WebElement getPassword() {
		return Password;
	}


	public WebElement getRetypePass() {
		return RetypePass;
	}


	public WebElement getFirstName() {
		return firstName;
	}


	public WebElement getLastName() {
		return lastName;
	}


	public WebElement getModifyTimeTrack() {
		return ModifyTimeTrack;
	}


	public WebElement getManageCust() {
		return ManageCust;
	}


	
	public WebElement getGenerateReport() {
		return GenerateReport;
	}




	public WebElement getManageUsers() {
		return ManageUsers;
	}




	public WebElement getManageBilling() {
		return ManageBilling;
	}
	
	public WebElement getCreateUserButton() {
		return createUserButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}
	
	
	public void UserData(String username,String password,String firstname,String lastname) throws InterruptedException
	{
		CreateNewUser.click();
		Thread.sleep(1000);
		Username.sendKeys(username);
		Password.sendKeys(password);
		RetypePass.sendKeys(password);
		firstName.sendKeys(firstname);
		lastName.sendKeys(lastname);
		Thread.sleep(1000);
		ModifyTimeTrack.click();
		ManageCust.click();
		GenerateReport.click();
		ManageUsers.click();
		ManageBilling.click();
		Thread.sleep(1000);
		createUserButton.click();
	}

	public void deleteManager()
    {
   	 usersLink.click();
   	 deleteThisUserButton.click();
   	
    }
	
}
