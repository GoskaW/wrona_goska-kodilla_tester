package com.kodilla.selenium.pom;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KodillaStorePomTest {

    KodillaStorePom storePom;

    WebDriver driver;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://kodilla.com/pl/test/store");
        storePom = new KodillaStorePom(driver);
    }

    @Test
    public void findNotebook() {
        String searchItem = "Notebook";
        storePom.search(searchItem);

        int item = storePom.items.size();

        assertEquals(2, item);
    }

    @Test
    public void findSchool() {
        String searchItem = "School";
        storePom.search(searchItem);

        int item = storePom.items.size();

        assertEquals(1, item);

    }

    @Test
    public void findBrand() {
        String searchItem = "Brand";
        storePom.search(searchItem);

        int item = storePom.items.size();

        assertEquals(1, item);
    }

    @Test
    public void findBusiness() {
        String searchItem = "Business";
        storePom.search(searchItem);

        int item = storePom.items.size();

        assertEquals(0, item);
    }

    @Test
    public void findGaming() {
        String searchItem = "Gaming";
        storePom.search(searchItem);

        int item = storePom.items.size();

        assertEquals(1, item);
    }

    @Test
    public void findPowerful() {
        String searchItem = "Powerful";
        storePom.search(searchItem);

        int item = storePom.items.size();

        assertEquals(0, item);
    }

    @Test
    public void findItemByDifferentChar() {
        String searchItem = "noTeBooK";
        storePom.search(searchItem);

        int item = storePom.items.size();

        assertEquals(2,item);
    }


}





