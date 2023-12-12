package testes2;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome,driver","\\Users\\bdasilva\\Documents\\java\\dem\\src\\drivers\\chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://dhp000003szikma4-dev-ed.develop.lightning.force.com/lightning/page/home");

        WebElement username = driver.findElement(By.id("username"));
        username.click();
        username.sendKeys("bdasilva@salesforce1.com");


        WebElement password = driver.findElement(By.id("password"));
        password.click();
        password.sendKeys("Salesforce1");

        WebElement login = driver.findElement(By.id("Login"));
        login.click();

        Thread.sleep(5);

        WebElement button = driver.findElement(By.xpath("//span[text()='Contacts']/parent::a[contains(@href,'lightning/o/Contact/home')]"));    
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", button);


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='New' and @type='button']")));        
        driver.findElement(By.xpath("//button[text()='New' and @type='button']")).click();
        //((JavascriptExecutor)driver).executeScript("arguments[0].click();", newcontact);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='firstName']"))); 
        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Bah");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='lastName']"))); 
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Rodrigues");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Save' and @type='button']"))); 
        driver.findElement(By.xpath("//button[text()='Save' and @type='button']")).click();


    // get the current URL of the page 
    String URL= driver.getCurrentUrl(); 
    System.out.print(URL); 
    //get the title of the page 
    String title = driver.getTitle(); 
    System.out.println(title); 
    
    }
}
