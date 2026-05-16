package Web_Pages;

import Base.Test_Base;
import Base.generic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base_Page {
    generic gl;
    WebDriver driver;
    public Base_Page()  {
       this.driver = Test_Base.getDriver();
        PageFactory.initElements(driver,this);
       gl = new generic();

    }
}
