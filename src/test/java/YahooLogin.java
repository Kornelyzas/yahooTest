import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooLogin {

    public static WebDriver browser;

    public static void setup2(){
        System.setProperty("webdriver.chrome.driver", "webdriver/chromedriver89.exe");

        browser = new ChromeDriver();
        browser.get("https://login.yahoo.com/");
    }

    public static void fillSignIn(){
        WebElement signInArea = browser.findElement(By.id("login-username"));
        signInArea.sendKeys("antanas.baranauskasxs");

        WebElement logIn = browser.findElement(By.xpath("//*[@id=\"login-signin\"]"));
        logIn.click();
    }

    public static void password(){
        WebElement loginPass = browser.findElement(By.xpath("//*[@id=\"login-passwd\"]"));
        loginPass.sendKeys("Antaniukx007");

        WebElement logSubmit = browser.findElement(By.xpath("//*[@id=\"login-signin\"]"));
        logSubmit.click();
    }


    public static void main(String[] args) {
        System.out.println("Test Started");
        setup2();
        fillSignIn();
        password();
    }
}
