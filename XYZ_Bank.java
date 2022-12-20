import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.Arrays;

public class XYZ_Bank {


@Test
    public void BalanceTest() throws InterruptedException {
    String url = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/";
    //Selector
    String CustomerLogin = "body > div > div > div.ng-scope > div > div.borderM.box.padT20 > div:nth-child(1) > button";
    String YourName = "#userSelect";
    String Login = "body > div > div > div.ng-scope > div > form > button";
    String Withdrawal = "body > div > div > div.ng-scope > div > div:nth-child(5) > button:nth-child(3)";
    String Deposit = "body>div>div>div.ng-scope>div>div:nth-child(5)>button:nth-child(2)";
    String Balance = "body > div > div > div.ng-scope > div > div:nth-child(3) > strong:nth-child(2)";
    String Amount_Deposited = "body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > div > input";
    String Amount_Withdrawal = "body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > div > input";
    String Dollar = "body > div > div > div.ng-scope > div > div:nth-child(3) > strong:nth-child(3)";
    //input
    String Amount_depositInput = "1000";
    String Amount_withdrawalInput = "250";

    DOMselenium selenium = new DOMselenium();
    selenium.driver.get(url);
    Thread.sleep(1000);
    selenium.getElement(CustomerLogin).click();
    Thread.sleep(1000);
    selenium.getElement(YourName).click();
    Thread.sleep(1000);
    selenium.getElement(YourName).sendKeys(Keys.ARROW_DOWN);
    Thread.sleep(1000);
    selenium.getElement(YourName).sendKeys(Keys.ARROW_DOWN);
    Thread.sleep(1000);
    selenium.getElement(YourName).sendKeys(Keys.ENTER);
    Thread.sleep(1000);
    selenium.getElement(Login).click();
    Thread.sleep(1000);
    selenium.getElement(Deposit).click();
    Thread.sleep(1000);
    selenium.getElement(Amount_Deposited).sendKeys(Amount_depositInput);
    Thread.sleep(1000);
    selenium.getElement(Amount_Deposited).sendKeys(Keys.ENTER);
    Thread.sleep(1000);
    selenium.getElement(Withdrawal).click();
    Thread.sleep(1000);
    selenium.getElement(Amount_Withdrawal).sendKeys(Amount_withdrawalInput);
    Thread.sleep(1000);
    selenium.getElement(Amount_Withdrawal).sendKeys(Keys.ENTER);
    String AV = selenium.getElement(Balance).getText();
    Thread.sleep(1000);
    String EXP = "750";
    Assert.assertEquals(AV, EXP);
}
@Test
    public void CurrencyTest()throws InterruptedException {
    String url = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/";

    //Selector
    String CustomerLogin = "body > div > div > div.ng-scope > div > div.borderM.box.padT20 > div:nth-child(1) > button";
    String YourName = "#userSelect";
    String Login = "body > div > div > div.ng-scope > div > form > button";
    String Dollar = "body > div > div > div.ng-scope > div > div:nth-child(3) > strong:nth-child(3)";


    DOMselenium selenium = new DOMselenium();
    selenium.driver.get(url);
    Thread.sleep(1000);
    selenium.getElement(CustomerLogin).click();
    Thread.sleep(1000);
    selenium.getElement(YourName).click();
    Thread.sleep(1000);
    selenium.getElement(YourName).sendKeys(Keys.ARROW_DOWN);
    Thread.sleep(1000);
    selenium.getElement(YourName).sendKeys(Keys.ARROW_DOWN);
    Thread.sleep(1000);
    selenium.getElement(YourName).sendKeys(Keys.ENTER);
    Thread.sleep(1000);
    selenium.getElement(Login).click();
    Thread.sleep(1000);
    String AV = selenium.getElement(Dollar).getText();
    Thread.sleep(1000);
    String EXP = "Dollar";
    Assert.assertEquals(AV, EXP);







}










}









