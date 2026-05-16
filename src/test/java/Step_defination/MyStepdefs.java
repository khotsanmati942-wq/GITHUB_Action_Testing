package Step_defination;

import Base.Test_Base;
import Web_Pages.Account_Page;
import Web_Pages.Base_Page;
import Web_Pages.Cart_Page;
import Web_Pages.Home_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;




public class MyStepdefs extends Test_Base  {

    public  Account_Page account_page;
    public  Home_Page home_page;
    public Cart_Page cart_page;

    @Given("I navigate to the URL")
    public void iNavigateToTheURL() {
    }

    @And("I enter {string} in the Username field")
    public void iEnterInTheUsernameField(String username) {
        account_page = new Account_Page();
        account_page.Enterusernameforregitration(username);

    }

    @And("I enter {string} in the Email address field")
    public void iEnterInTheEmailAddressField(String email) {
        account_page = new Account_Page();
        account_page.Enteruseremailforregitration(email);

    }

    @And("I enter {string} in the Password field")
    public void iEnterInThePasswordField(String password) {
        account_page = new Account_Page();
        account_page.Enteruserpasswordforregitration(password);
    }

    @And("I click on the REGISTER button")
    public void iClickOnTheREGISTERButton() {
        account_page = new Account_Page();
        account_page.Clickonregisterbutton();
    }

    @And("I enter {string} in the Username or email address field")
    public void iEnterInTheUsernameOrEmailAddressField(String user) {
        account_page = new Account_Page();
        account_page.Enteruseridforlogin(user);
    }

    @And("I click on the LOG IN button")
    public void iClickOnTheLOGINButton() {
        account_page = new Account_Page();
        account_page.Clickonloginbutton();
    }

    @And("I enter {string} in the Password field for login")
    public void iEnterInThePasswordFieldForLogin(String password) {
        account_page = new Account_Page();
        account_page.Enterpasswordforlogin(password);
    }

    @And("I click on Account link")
    public void iClickOnAccountLink() {
        home_page = new Home_Page();
        home_page.Clickonaccountpagelink();
    }

    @And("I navigate to home screen")
    public void iNavigateToHomeScreen() {
        home_page = new Home_Page();
        home_page.Clickonhomepagelinke();

    }


    @Then("I click on view cart button which appeared below add to cart button")
    public void iClickOnViewCartButtonWhichAppearedBelowAddToCartButton() {
        home_page = new Home_Page();
        home_page.Clickonviewcart();
    }

    @And("I click on proceed to pay")
    public void iClickOnProceedToPay() {
        cart_page = new Cart_Page();
        cart_page.Clickonproccedtocheckout();

    }

    @And("I click on place order")
    public void iClickOnPlaceOrder() {
        cart_page = new Cart_Page();
        cart_page.enteruserdetails();
        cart_page.Clickonproceedtoorder();

    }

    @And("I select a product and I click on Add to cart")
    public void iSelectAProductAndIClickOnAddToCart() {
        home_page = new Home_Page();
        home_page.ClickonAddtocartfordenimbluejeans();
    }

    @And("Hello word")
    public void helloword(){
        System.out.println("Hello world");
    }

    @And("Hello word New ")
    public void helloword_New(){
        System.out.println("Hello world New");
    }


    @And("Hello word New and bye ")
    public void helloword_New_and_bye(){
        System.out.println("Hello world New");
    }

    @And("Conflit method new")
    public void Conflict_method_new(){
        System.out.println("Conflict change by sanmati");
    }

    public  void dummy(){
        System.out.println("dummy method by sanmati");
    }
}
