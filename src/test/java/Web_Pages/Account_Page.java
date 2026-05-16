package Web_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Account_Page extends Base_Page{


    @FindBy(xpath = "//input[@id='reg_username']")
    WebElement Register_Username;

    @FindBy(xpath = "//input[@id='reg_email']")
    WebElement Register_Email_address;

    @FindBy(xpath = "//input[@id='reg_password']")
    WebElement Register_Password;

    @FindBy(xpath = "//button[normalize-space()='Register']")
    WebElement Register_Button;

    @FindBy(xpath = "//input[@id='username']")
    WebElement Login_Username;

    @FindBy(xpath = "//input[@id='password']")
    WebElement Login_password;

    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement Login_Button;


    public void Enterusernameforregitration(String name)  {
        gl.genericwait();
        Register_Username.sendKeys(name);
    }

    public void Enteruseremailforregitration(String email) {
        gl.genericwait();
        Register_Email_address.sendKeys(email);
    }

    public void Enteruserpasswordforregitration(String password)  {
        gl.genericwait();
        Register_Password.sendKeys(password);
    }

    public void Clickonregisterbutton()  {
        gl.genericwait();
        Register_Button.click();
    }

    public void Enteruseridforlogin(String loginname)  {
        gl.genericwait();
        Login_Username.sendKeys(loginname);
    }

    public void Enterpasswordforlogin(String loginpassword){
        gl.genericwait();
        Login_password.sendKeys(loginpassword);
    }

    public void Clickonloginbutton(){
        gl.genericwait();
        Login_Button.click();
    }
}

