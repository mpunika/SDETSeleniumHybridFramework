package zaaaelementlocators.a_idlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.Assert.assertEquals;

public class IDLocatorTest {

    @org.testng.annotations.Test
    public void idLocatorTest() {

        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");

        WebElement fullNameTextBox = driver.findElement(By.id("userName"));
        fullNameTextBox.sendKeys("Jabu Mahlangu");

        WebElement emailTextBox = driver.findElement(By.id("userEmail"));
        emailTextBox.sendKeys("jabu.mahlangu@onderstepoort.co.za");

        WebElement currentAddressTextBox = driver.findElement(By.id("currentAddress"));
        currentAddressTextBox.sendKeys("123 Marie Street,Ondestepoort,0110");

        WebElement permanentAddressTextBox = driver.findElement(By.id("permanentAddress"));
        permanentAddressTextBox.sendKeys("123 Marie Street,Ondestepoort,0110");

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();


        driver.quit();
    }
}
