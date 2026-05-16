package Web_Pages;

import Base.generic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page extends Base_Page {


    @FindBy(xpath = "//li[@id='menu-item-1237']//a[@class='menu-link'][normalize-space()='Account']")
    public WebElement Account_Page_Link;

    @FindBy(xpath = "//a[@aria-label='Add “Denim Blue Jeans” to your cart']")
    public WebElement Denim_Blue_Jeans_Add_to_cartbutton;

    @FindBy(xpath = "//a[@title='View cart']")
    public WebElement View_cart;

    @FindBy(xpath = "//li[@id='menu-item-1226']//a[@class='menu-link'][normalize-space()='Home']")
    public WebElement Home_page_link;

    public void Clickonaccountpagelink()  {
       gl.genericwait();
        Account_Page_Link.click();
    }

    public void ClickonAddtocartfordenimbluejeans(){
        gl.genericwait();
        Denim_Blue_Jeans_Add_to_cartbutton.click();
    }

    public void Clickonviewcart(){
       gl.elementClickable(View_cart);
        View_cart.click();
    }

    public void Clickonhomepagelinke(){
        gl.genericwait();
        Home_page_link.click();
    }

}

