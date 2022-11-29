package clxPages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;

public class LoginPage extends Base {

    // Object repo
    @FindBy(xpath = "//button[@class='btn btn-gray ms-btn']")   WebElement SSOLoginButton;
    @FindBy(xpath = "//input[@name='username']")   WebElement userNameTextBox;
    @FindBy(xpath = "//input[@name='password']")  WebElement passwordTextBox;
    @FindBy(xpath = "//input[@name='password']//parent::div//parent::div//parent::div//parent::div//parent::mat-form-field//parent::div//descendant::span[3]")  WebElement passwordVisibility;
    @FindBy(xpath = "//button[@type='submit']")   WebElement submitButton;

    // Constructor for initialization
    public LoginPage()
    {
        PageFactory.initElements(driver,this);
    }

    // Action methods
    public  boolean checkSSOButton()
    {
        return SSOLoginButton.isDisplayed();
    }
    public  boolean checkUsername()
    {
        return userNameTextBox.isDisplayed();
    }
    public  boolean checkPassword()
    {
        return passwordTextBox.isDisplayed();
    }
    public  boolean checkVisibilityIcon() {
        return passwordVisibility.isDisplayed();
    }

    public  boolean checkLoginButton()
    {
        return submitButton.isDisplayed();
    }

    public  void login() throws InterruptedException {
        userNameTextBox.clear();
        userNameTextBox.sendKeys("Pearson@yopmail.com");
        passwordTextBox.clear();
        passwordTextBox.sendKeys("Cloudlex#2021");
        submitButton.click();
        Thread.sleep(3000);
    }




}


