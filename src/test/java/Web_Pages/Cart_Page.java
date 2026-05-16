package Web_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cart_Page extends Base_Page{

    @FindBy(xpath = "//a[normalize-space()='Proceed to checkout']")
    WebElement Prcocced_to_checkout;

    @FindBy(xpath = "//button[@id='place_order']")
    WebElement Place_order;

    @FindBy(id = "billing_first_name")
    WebElement firstName;

    @FindBy(id = "billing_last_name")
    WebElement lastName;

    @FindBy(id = "billing_address_1")
    WebElement streetAddress1;

    @FindBy(id = "billing_city")
    WebElement city;

    @FindBy(id = "billing_postcode")
    WebElement zipCode;






    public void Clickonproccedtocheckout(){
        gl.elementClickable(Prcocced_to_checkout);
        Prcocced_to_checkout.click();
    }

    public void Clickonproceedtoorder(){
        gl.elementClickable(Place_order);
        Place_order.click();
    }
    public void enteruserdetails(){
        enterFirstName();
        gl.genericwait();
        enterLastName();
        gl.genericwait();
      enterCity();
        gl.genericwait();
        enterStreetAddress();
        gl.genericwait();
      enterZipCode();
    }

    public void enterFirstName() {
        firstName.clear();
        firstName.sendKeys("Chaitra");
    }

    public void enterLastName() {
        lastName.clear();
        lastName.sendKeys("A");
    }

    public void enterStreetAddress() {
        streetAddress1.clear();
        streetAddress1.sendKeys("#123");

    }

    public void enterCity() {
        city.clear();
        city.sendKeys("USA");
    }

    public void enterZipCode() {
        zipCode.clear();
        zipCode.sendKeys("98101");
    }


}
