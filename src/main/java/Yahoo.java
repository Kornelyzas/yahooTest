import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo {

    public static WebDriver browser;

    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "webdriver/chromedriver89.exe");

        browser = new ChromeDriver();
        browser.get("https://login.yahoo.com/");
    }

    public static void clickCreateAccount(){
        WebElement createAcc = browser.findElement(By.id("createacc"));

        JavascriptExecutor js = (JavascriptExecutor) browser;
        js.executeScript("arguments[0].click();", createAcc);
    }

    public static void fillRegForm(){
        WebElement uRegFname = browser.findElement(By.id("usernamereg-firstName"));
        uRegFname.sendKeys("Antanas");

        WebElement uRegLname = browser.findElement(By.id("usernamereg-lastName"));
        uRegLname.sendKeys("Baranaukas");

        WebElement uRegEmail = browser.findElement(By.id("usernamereg-yid"));
        uRegEmail.sendKeys("antanas.baranauskasxs");

        WebElement uRegPass = browser.findElement(By.id("usernamereg-password"));
        uRegPass.sendKeys("Antaniukx007");

        WebElement uRegPhone = browser.findElement(By.id("usernamereg-phone"));
        uRegPhone.sendKeys("65834270");

        WebElement uRegMonth = browser.findElement(By.xpath("//*[@id=\"usernamereg-month\"]/option[3]"));
        uRegMonth.click();

        WebElement uRegDay = browser.findElement(By.id("usernamereg-day"));
        uRegDay.sendKeys("29");

        WebElement uRegYear = browser.findElement(By.id("usernamereg-year"));
        uRegYear.sendKeys("1996");

        WebElement uRegGender = browser.findElement(By.id("usernamereg-freeformGender"));
        uRegGender.sendKeys("Man");
    }

    public static void clickRegSubmit(){
        WebElement regSubmitBtn = browser.findElement(By.xpath("//*[@id=\"reg-submit-button\"]"));
        regSubmitBtn.click();
    }

    public static void main(String[] args) {
        System.out.println("Test Started");
        setup();
        clickCreateAccount();
        fillRegForm();
        clickRegSubmit();
    }
}
