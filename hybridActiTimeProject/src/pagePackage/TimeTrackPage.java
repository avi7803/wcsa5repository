package pagePackage;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericPackage.BaseTest;
import genericPackage.Worklib;

public class TimeTrackPage extends BaseTest  {
	@FindBy(xpath="//a[text()='Insert existing tasks']") private WebElement AssignTaskLink;
	@FindBy(xpath = "//*[@name='usersSelector.selectedUser']") private WebElement EnterTimeTrackDropDown;
	@FindBy(xpath="//input[@name='selected_12']") private WebElement SelectTaskToAddCheckBox;
	@FindBy(xpath="//input[@value='Insert Selected Tasks to the Enter Time-Track Page']") private WebElement InsertSelectedTaskButton;
	@FindBy(xpath="//option[text()='Patil, Avinash (testeng)']") private WebElement TestEngName;
	@FindBy(xpath="//input[@name='timeTrack[12].spentStr[0]']") private WebElement TimrtrackBox1;
	@FindBy(xpath="//input[@name='timeTrack[12].spentStr[1]']") private WebElement TimrtrackBox2;
	
	//initialization
	public TimeTrackPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	public WebElement getAssignTaskLink() {
		return AssignTaskLink;
	}

	public WebElement getEnterTimeTrackDropDown() {
		return EnterTimeTrackDropDown;
	}

	public WebElement getSelectTaskToAddCheckBox() {
		return SelectTaskToAddCheckBox;
	}

	public WebElement getInsertSelectedTaskButton() {
		return InsertSelectedTaskButton;
	}

	public WebElement getTestEngName() {
		return TestEngName;
	}
	
	public WebElement getTimrtrackBox1() {
		return TimrtrackBox1;
	}

	public WebElement getTimrtrackBox2() {
		return TimrtrackBox2;
	}

	//operational
	public void AssignTask(String name) throws InterruptedException
	{
		EnterTimeTrackDropDown.click();
		String parentHandle = driver.getWindowHandle();
		TestEngName.click();
		//Worklib wb = new Worklib();
		//wb.selectByVisibleText(EnterTimeTrackDropDown, name);
		
		AssignTaskLink.click();
		Set<String> allHandle = driver.getWindowHandles();
		
		for(String wh:allHandle)
		{
			if(!parentHandle.equals(wh))
			{
				driver.switchTo().window(wh);
				Thread.sleep(1000);
				SelectTaskToAddCheckBox.click();
				InsertSelectedTaskButton.click();
			}
		}
		//driver.close();		
		
		//SelectTaskToAddCheckBox.click();
		//InsertSelectedTaskButton.click();
		
	}

	
}
