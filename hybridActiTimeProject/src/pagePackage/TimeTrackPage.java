package pagePackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import genericPackage.BaseTest;
import genericPackage.Worklib;

public class TimeTrackPage extends BaseTest {
	@FindBy(xpath="//a[text()='Insert existing tasks']") private WebElement AssignTaskLink;
	@FindBy(xpath = "//select[@name=\"usersSelector.selectedUser\"]") private WebElement EnterTimeTrackDropDown;
	@FindBy(xpath="//input[@name='selected_9']") private WebElement SelectTaskToAddCheckBox;
	@FindBy(xpath="//input[@value='Insert Selected Tasks to the Enter Time-Track Page']") private WebElement InsertSelectedTaskButton;
	
	
	
	
	//operational
	public void AssignTask(String name)
	{
		EnterTimeTrackDropDown.click();
		Worklib wb = new Worklib();
		wb.selectByVisibleText(EnterTimeTrackDropDown, name);
		String parentHandle = driver.getWindowHandle();
		AssignTaskLink.click();
		
		
		
		SelectTaskToAddCheckBox.click();
		InsertSelectedTaskButton.click();
		
	}

}
