package genericPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Worklib extends BaseTest{
	Actions act = new Actions(driver);
	
	//Handle Alert popup
	public void acceptAlertHandling()
	{
		driver.switchTo().alert().accept();
	}
	
	public void dissmissAlertHandling()
	{
		driver.switchTo().alert().dismiss();
	}
	
	//Handle confirmation popup
	public void acceptConfirmationHandling()
	{
		driver.switchTo().alert().accept();
	}
	
	public void dissmissConfirmationHandling()
	{
		driver.switchTo().alert().dismiss();
	}
	
	//Handling Frames
	public void handleFrameByIndex(int index)
	{
		driver.switchTo().frame(index);
	}
	
	public void handleFrameByStringOrName(String name)
	{
		driver.switchTo().frame(name);
	}
	
	public void handleFrameByWebelement(WebElement nameOrId)
	{
		driver.switchTo().frame(nameOrId);
	}
	
	//To go to any page
	public void goToMainPage()
	{
		driver.switchTo().defaultContent();
	}
	
	public void goToParentPage()
	{
		driver.switchTo().parentFrame();
	}
	//Handle the Mouse Actions
	public void rightClick(WebElement target)
	{
		act.contextClick(target).perform();
	}
	
	public void doubleClick(WebElement target)
	{
		act.doubleClick(target).perform();
	}

	public void dragAndDrop(WebElement src,WebElement dest)
	{
		act.dragAndDrop(src, dest).perform();
	}
	
	public void moveToElement(WebElement target)
	{
		act.moveToElement(target).perform();
	}
	
	//Hit keyboard buttons
	public void hitEnterButton() throws AWTException
	{
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void hitTabButton() throws AWTException
	{
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
	}
	
	//Handle Dropdown
	public void selectByVisibleText(WebElement target,String text)
	{
		Select sel = new Select(target);
		sel.selectByVisibleText(text);
	}
	
	public void selectByValue(WebElement target,String value)
	{
		Select sel = new Select(target);
		sel.selectByValue(value);
	}
	
	public void selectByIndex(WebElement target,int index)
	{
		Select sel = new Select(target);
		sel.selectByIndex(index);
	}

	
}
