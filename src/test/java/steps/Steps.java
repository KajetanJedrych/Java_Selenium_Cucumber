package steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps {

    WebDriver driver = new ChromeDriver();

    @Given("User navigates to the application")
    public void user_navigates_to_the_application() {
        driver.get("https://www.saucedemo.com/");
        System.out.println("The user is on login page");
    }
    @Given("User enter the username as {string}")
    public void user_enter_the_username_as(String string) {
        driver.findElement(By.id("user-name")).click();
        driver.findElement(By.id("user-name")).clear();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        System.out.println("enter username");
    }
    @Given("User enter the password as {string}")
    public void user_enter_the_password_as(String string) {
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        System.out.println("enter the password");

    }
    @When("User click on the login button")
    public void user_click_on_the_login_button() {
        driver.findElement(By.id("login-button")).click();
        System.out.println("Click button");

    }
    @Then("Login should be success")
    public void login_should_be_success() {
        String text = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
        Assert.assertEquals("Products", text);
        System.out.println("you are logged in");

    }
    @When("Login should fail")
    public void login_should_fail() {
        String text = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3/text()")).getText();
        Assert.assertEquals("Products", text);

    }

}
