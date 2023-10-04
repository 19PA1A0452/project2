package com.amdocs.Finalproj;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1 {
	public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new EdgeDriver();

        driver.get("https://www.amazon.com/");

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("laptop"); // Replace with your product query

        WebElement searchButton = driver.findElement(By.xpath("//input[@value='Go']"));
        searchButton.click();
        WebElement firstSearchResult = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        firstSearchResult.click();

        WebElement addToCartButton = driver.findElement(By.id("add-to-cart-button"));
        addToCartButton.click();

       
        driver.quit();
    }
}
	