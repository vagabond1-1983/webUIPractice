package com.test.java.webui.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by beigui on 2016/5/22.
 * 用Page Factory方式，先做LoginPage对象，然后再写用例脚本
 * 有了Page对象后，脚本直接写逻辑，而数据通过数据驱动成为脚本的参数
 * 注意：一个类的Page对象在同一个页面中，如果不同页面的元素都放到一个Page类中会有定位不到的问题
 */
public class DriveLoginWithSimplePOM {
    private LoginPage loginPage;
    private WebDriver driver;

    @DataProvider(name = "csv")
    public Object[][] genLoginAccount() {
        return new Object[][]{
                {"xxx", "xxx"}
        };
    }

    @BeforeClass
    public void before() {
        System.setProperty("webdriver.firefox.bin", "D:\\Program Files\\Mozilla Firefox\\firefox.exe");
        driver = new FirefoxDriver();
        loginPage = new LoginPage(driver);
    }

    @Test(dataProvider = "csv")
    public void drive(String username, String password) {
        loginPage.typeUsername(username);
        loginPage.typePassword(password);
        loginPage.login();
        Assert.assertTrue(loginPage.getTitle().contains("Suning"));
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
