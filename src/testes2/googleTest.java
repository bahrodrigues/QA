package testes2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class googleTest {
    
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        System.setProperty("web.driver.chrome","\\Users\\bdasilva\\Documents\\java\\dem\\src\\drivers\\chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("http://www.google.com");
    }


    @Test
    public void googleTitle(){
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title, "Google","title is not matched");
    }

    @Test
    public void googlelogotest(){
       boolean b = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
       
    }

    //@Test
    //public void maillink(){
    //   boolean c = driver.findElement(By.xpath("//button[text()='Gmail' and @type='button']")).isDisplayed();
    //   System.out.println(c);
    //   }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }







}
