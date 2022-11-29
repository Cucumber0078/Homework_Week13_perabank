package testsuite;

import Utility.Utility;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Sleeper;

public class LoginTest extends Utility {
    String baseUrl = "https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC";
    @Before
    public void setUp(){ openBroswer(baseUrl);}
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //* Enter valid username
        sendTextElement(By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[1]/input[1]"), "ramesh007");
        //** Enter valid password
        sendTextElement(By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[2]/input[1]"), "ramesh008");
        //* Click on ‘LOGIN’ button
        clickOnElement(By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[3]/input[1]"));

        //* Verify the ‘Accounts Overview’ text is display
        String expTest = "Accounts Overview";
        String acuTest =getTextFromElement(By.xpath("//h1[contains(text(),'Accounts Overview')]")) ;
        Assert.assertEquals("Account Overview is not display", expTest, acuTest);
        driver.close();
    }
        @Test
                public void verifyTheErrorMessage(){
            //* Enter valid Invalid username
            sendTextElement(By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[1]/input[1]"), "ramesh0071111");
            //** Enter Invalid password
            sendTextElement(By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[2]/input[1]"), "ramesh0082222");
            // click on login button
            clickOnElement(By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[3]/input[1]"));

        }
        @Test

        public void userShouldLogOutSuccessfully(){
            // * Enter valid username
            sendTextElement(By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[1]/input[1]"), "ramesh007");
            //** Enter valid password
            sendTextElement(By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[2]/input[1]"), "ramesh008");
            //* Click on ‘LOGIN’ button
            clickOnElement(By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[3]/input[1]"));
            // * Click on ‘Log Out’ link
            clickOnElement(By.xpath("//a[contains(text(),'Log Out')]"));
                   //* Verify the text ‘Customer Login’
            String expMessage1 = "Customer Login";
            String actMessage1 =getTextFromElement(By.xpath("//h2[contains(text(),'Customer Login')]"));
            Assert.assertEquals("message is not displaying ", expMessage1,actMessage1);

    }
    public void ashisMOr(){
        driver.quit();
    }



    }



