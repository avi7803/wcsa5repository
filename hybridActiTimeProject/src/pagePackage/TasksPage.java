package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericPackage.Worklib;

public class TasksPage {
	
	@FindBy(partialLinkText = "Projects & Customers") private WebElement Projects_CustomersLink;
	@FindBy(xpath = "//input[@value='Create New Tasks']") private WebElement CreateNewTasksButton;
	@FindBy(xpath = "//input[@value='Create New Customer']") private WebElement CreateNewCustomerButton;
	@FindBy(name = "name") private WebElement customerNameTextBox;
	@FindBy(xpath = "//input[@name='createCustomerSubmit']") private WebElement CreateCustomerButton;
	@FindBy(xpath = "//input[@value='Create New Project']") private WebElement CreateNewProjectButton;
	@FindBy(name = "customerId") private WebElement CustomerDropDown;
	@FindBy(name = "projectId") private WebElement ProjectDropDown;
	@FindBy(name = "task[0].billingType") private WebElement BillingTypeDropDown;
	@FindBy(name = "name") private WebElement projectNameTextBox;
	
	@FindBy(name = "task[0].name") private WebElement TaskTextBox;
	@FindBy(name = "task[0].deadline") private WebElement TaskDeadlineTextBox;
	@FindBy(name = "task[0].markedToBeAddedToUserTasks") private WebElement AddToMyTimeTrackCheckBox;
	@FindBy(xpath = "//input[@value='Create Tasks']") private WebElement CreateTaskButton;
	@FindBy(xpath = "//input[@name='createProjectSubmit']") private WebElement CreateProjectButton;
	@FindBy(xpath = "//input[@name='taskSelected[7]']") private WebElement TaskSelectCheckBox;
	
	@FindBy(xpath = "//input[@value='Complete Selected Tasks']") private WebElement CompleteSelectedTaskButton;
	
	//Initialization
	public TasksPage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}

	//Utilization
	public WebElement getProjects_CustomersLink() {
		return Projects_CustomersLink;
	}

	
	public WebElement getCreateNewTasksButton() {
		return CreateNewTasksButton;
	}

	public WebElement getCreateNewCustomer() {
		return CreateNewCustomerButton;
	}

	public WebElement getCustomerNameTextBox() {
		return customerNameTextBox;
	}

	public WebElement getCreateCustomerButton() {
		return CreateCustomerButton;
	}

	public WebElement getCreateNewProject() {
		return CreateNewProjectButton;
	}

	public WebElement getCustomerDropDown() {
		return CustomerDropDown;
	}

	public WebElement getProjectDropDown() {
		return ProjectDropDown;
	}

	public WebElement getBillingTypeDropDown() {
		return BillingTypeDropDown;
	}

	public WebElement getProjectNameTextBox() {
		return projectNameTextBox;
	}

	public WebElement getTaskTextBox() {
		return TaskTextBox;
	}

	public WebElement getTaskDeadlineTextBox() {
		return TaskDeadlineTextBox;
	}

	public WebElement getAddToMyTimeTrackCheckBox() {
		return AddToMyTimeTrackCheckBox;
	}

	public WebElement getCreateTaskButton() {
		return CreateTaskButton;
	}

	public WebElement getCreateProjectButton() {
		return CreateProjectButton;
	}
	
	
	public WebElement getTaskSelectCheckBox() {
		return TaskSelectCheckBox;
	}

	
	public WebElement getCompleteSelectedTaskButton() {
		return CompleteSelectedTaskButton;
	}

	//Operational
	public void createNewCustomer(String name) throws InterruptedException
	{
		Projects_CustomersLink.click();
		CreateNewCustomerButton.click();
		Thread.sleep(1000);
		customerNameTextBox.sendKeys(name);
		Thread.sleep(1000);
		CreateCustomerButton.click();
	}
	
	public void createNewProject(String text,String input)
	{
		CreateNewProjectButton.click();
		Worklib wb = new Worklib();
		wb.selectByVisibleText(CustomerDropDown, text);
		projectNameTextBox.sendKeys(input);
		CreateProjectButton.click();
		
	}
	
	public void  createNewTask(String customerName,String projectName,String taskName,String taskDeadline,String bilingType)
	{
		CreateNewTasksButton.click();
		Worklib wb = new Worklib();
		wb.selectByVisibleText(CustomerDropDown, customerName);
		ProjectDropDown.click();
		wb.selectByVisibleText(ProjectDropDown, projectName);
		TaskTextBox.sendKeys(taskName);
		TaskDeadlineTextBox.sendKeys(taskDeadline);
		BillingTypeDropDown.click();
		wb.selectByVisibleText(BillingTypeDropDown,bilingType);
		AddToMyTimeTrackCheckBox.click();
		CreateTaskButton.click();
	}
	
	
	
	
	
	

}
