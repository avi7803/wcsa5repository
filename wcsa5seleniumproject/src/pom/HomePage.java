package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath="//div[.='Time-Track']/../descendant::IMG") private WebElement TimeTrack;
	@FindBy(xpath="//div[text()='Tasks']/following-sibling:img") private WebElement Tasks;
	@FindBy(xpath="//div[text()='Reports']/following-sibling:img") private WebElement Reports;
	@FindBy(xpath="//A[@class='content users']/descendant::IMG[@class='sizer']") private WebElement Users;
	@FindBy(xpath="//div[text()='Work Schedule']/following-sibling:img") private WebElement WorkSchedule;
	@FindBy(xpath="//div[text()='Settings']/following-sibling:img") private WebElement Settings;
	
	@FindBy(xpath="//div[text()='Logout']") private WebElement logOutLink;
	
	//initialzation
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	//Setters
	public WebElement getTimeTrack() {
		return TimeTrack;
	}

	public WebElement getTasks() {
		return Tasks;
	}

	public WebElement getReports() {
		return Reports;
	}

	public WebElement getUsers() {
		return Users;
	}

	public WebElement getWorkSchedule() {
		return WorkSchedule;
	}

	public WebElement getSettings() {
		return Settings;
	}

	public WebElement getLogOutLink() {
		return logOutLink;
	}
	
	//Operational
	
	public void clickOnTimeTrack()
	{
		TimeTrack.click();
	}
	
	public void clickOnTasksModule()
	{
		Tasks.click();
	}
	
	public void clickOnReportsModule()
	{
		Reports.click();
	}
	
	public void clickOnUsersModule()
	{
		Users.click();
	}
	
	public void clickOnWorkScheduleModule()
	{
		WorkSchedule.click();
	}
	
	
	public void clickOnSettingsModule()
	{
		Settings.click();
	}
	
	public void clickOnLogoutLink()
	{
		logOutLink.click();
	}
	
}
