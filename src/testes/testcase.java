package testes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testcase {
    
    public static void main(String[] arg) {

        System.setProperty("webdriver.chrome,driver", "\\Users\\bdasilva\\Documents\\java\\dem\\src\\drivers\\chromedriver");
        
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

    }


//Pre conditions    
@BeforeSuite //1

public void setUp(){
    System.out.println("setup system property for chrome");
}

@BeforeTest //2

public void lauchsite(){
    System.out.println("login chrome");
}

@BeforeClass //3

public void login(){
    System.out.println("login site");
}

@BeforeMethod //4
    
public void enterURL(){
    System.out.println("enter URL");
}


//Test cases
 @Test(priority = 2) //5

 public void googleTitle(){
    System.out.println("Google Title Test");
 }

@Test (priority = 3)

public void searchTest(){
    System.out.println("Search Test");
}

@Test (priority = 1)
public void googlelogo(){
        System.out.println("google logo test");
}

//Post conditions
@AfterMethod //6

public void logOut(){
    System.out.println("logout from app");
}

@AfterClass //7

public void closeBrowser(){
        System.out.println("close browser");
}

@AfterTest //8

public void deleteAllCookies(){
    System.out.println("deleteall");
}

@AfterSuite //9

public void generatetestreport(){
        System.out.println("generate test report");
}









}