package sample;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.PropertiesUtility;

public class fetchdata {
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	PropertiesUtility pUtility=new PropertiesUtility();
	String value=pUtility.getDataFromPropertiesFile("url");
    driver.get(value);
    driver.manage().window().maximize();
    String UN=pUtility.getDataFromPropertiesFile("username");
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys(UN);
    Thread.sleep(2000);
    String PWD=pUtility.getDataFromPropertiesFile("password");
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys(PWD,Keys.ENTER);
    
}
}
