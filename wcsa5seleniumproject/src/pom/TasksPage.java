package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TasksPage {

	@FindBy(xpath="//div[text()='Tasks']") private WebElement TaskButton;
	@FindBy(xpath="//a[text()='Projects & Customers']") private WebElement CustomerButton;
	@FindBy(xpath="//input[@value='Create New Customer']") private WebElement CreateCustomer;
}
