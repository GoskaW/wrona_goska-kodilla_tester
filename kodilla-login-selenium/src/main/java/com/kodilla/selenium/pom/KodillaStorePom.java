package com.kodilla.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class KodillaStorePom {

    @FindBy (xpath = "//*[@id=\"searchField\"]")
    WebElement searchField;

    @FindBy (xpath = "//*[@id=\"elements-wrapper\"]")
    List<WebElement> items;

   WebDriver driver;

   public KodillaStorePom(WebDriver driver) {
       this.driver = driver;
       PageFactory.initElements(driver, this);
    }

    public void search (String item) {
       searchField.sendKeys(item);
       searchField.submit();


    }
}
