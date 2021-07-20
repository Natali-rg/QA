package test;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;
import java.net.URL;
public class zapovnenyaFormy {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
   
  }
   @After
 public void tearDown() {
    driver.quit();
  }
  @Test
  public void aser() {
    openProjectasp();
    loginProjectasp();
    driver.findElement(By.cssSelector(".gn-icon-menu")).click();
    driver.findElement(By.linkText("Додати направлення")).click();
    driver.findElement(By.name("nameUst")).click();
    driver.findElement(By.name("nameUst")).click();
    driver.findElement(By.name("nameUst")).sendKeys("КНП «Центр первинної медико-санітарної допомоги» Андрушівської районної ради");
    driver.findElement(By.name("likar")).click();
    driver.findElement(By.name("likar")).sendKeys("Карпюк С.В.");
    driver.findElement(By.name("adresa")).click();
    driver.findElement(By.name("adresa")).click();
    driver.findElement(By.name("adresa")).sendKeys("м. Житомир");
    driver.findElement(By.name("phone")).click();
    driver.findElement(By.name("phone")).click();
    {
      WebElement element = driver.findElement(By.name("phone"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.name("phone")).sendKeys("(098)4561245");
    driver.findElement(By.cssSelector("tr:nth-child(6) .my1:nth-child(3)")).click();
    driver.findElement(By.name("pacName")).click();
    driver.findElement(By.name("pacName")).click();
    driver.findElement(By.name("pacName")).sendKeys("Ірина");
    driver.findElement(By.name("pacFam")).click();
    driver.findElement(By.name("pacFam")).click();
    {
      WebElement element = driver.findElement(By.name("pacFam"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.name("pacFam")).sendKeys("Кофтун");
    driver.findElement(By.name("nomPac")).click();
    driver.findElement(By.name("nomPac")).click();
    driver.findElement(By.name("nomPac")).sendKeys("6458");
    driver.findElement(By.id("dateR")).click();
    driver.findElement(By.id("dateR")).click();
    driver.findElement(By.id("dateR")).sendKeys("09101990");
    driver.findElement(By.id("vik")).click();
    driver.findElement(By.name("adressa")).click();
    driver.findElement(By.name("adressa")).click();
    driver.findElement(By.name("adressa")).sendKeys("м. Житомир");
    driver.findElement(By.cssSelector("td:nth-child(4) > .my1:nth-child(3)")).click();
    driver.findElement(By.name("pacPhone")).click();
    driver.findElement(By.name("pacPhone")).click();
    driver.findElement(By.name("pacPhone")).sendKeys("(096)4567898");
    driver.findElement(By.name("zrazType")).click();
    
    /*driver.findElement(By.name("dateZab")).click();
    driver.findElement(By.name("dateZab")).sendKeys("01012020");*/
    
    driver.findElement(By.name("timeZab")).click();
    driver.findElement(By.name("timeZab")).click();
    driver.findElement(By.name("timeZab")).sendKeys("10:30");
    driver.findElement(By.name("datPochZah")).click();
    driver.findElement(By.name("datPochZah")).sendKeys("11102020");
    driver.findElement(By.cssSelector("tr:nth-child(21) .my1:nth-child(3)")).click();
    driver.findElement(By.cssSelector("tr:nth-child(23) .my1:nth-child(3)")).click();
    driver.findElement(By.cssSelector(".my1:nth-child(9)")).click();
    driver.findElement(By.name("datRezult")).click();
    driver.findElement(By.name("datRezult")).sendKeys("14102020");
    clickButtonSave();
   
   assertText("6458");
  }
private void clickButtonSave() {
	driver.findElement(By.id("butt")).click();
}
private void loginProjectasp() {
	/*Данная программа - это реальный проект, который содержит персональные даные о пациентах. Поэтому логин и пароль указать не могу.*/
	driver.findElement(By.id("m1")).click();
    driver.findElement(By.id("m1")).sendKeys("");
    driver.findElement(By.cssSelector(".form > div")).click();
    driver.findElement(By.id("m2")).click();
    driver.findElement(By.id("m2")).sendKeys("");
    driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
}
private void openProjectasp() {
	driver.get("https://projectasp4.pp.ua/");
}
protected void assertText(String nomPac) {
	assertTrue(driver.getPageSource().contains(nomPac));
}
}