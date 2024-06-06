package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class mainChorme {

    ChromeDriver chromeDriver;

    @Before
    public void setUp() {
        // load chrome driver
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }

    @After
    public void tearDown(){
        // close the chrome
        chromeDriver.quit();
    }

}
