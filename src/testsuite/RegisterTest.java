package testsuite;

import Utility.Utility;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.Random;

public class RegisterTest extends Utility {

    String baseUrl = "https://parabank.parasoft.com/parabank/index.htm";
    @Before
    public void setUp(){ openBroswer(baseUrl);
    }
    @Test
    public void verifyThatSigningUpPageDisplay(){
        //* click on the ‘Register’ link
        clickOnElement(By.xpath("//a[contains(text(),'Register')]"));
        //Verify the text ‘Signing up is easy!’
        String expMessage = "Signing up is easy!";
        String actMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Signing up is easy!')]"));
        Assert.assertEquals("Sighinig up is not easy", expMessage,actMessage);
    }
    @Test
    public void userSholdRegisterAccountSuccessfully(){
        //* click on the ‘Register’ link
        clickOnElement(By.xpath("//a[contains(text(),'Register')]"));
        //* Enter First name
        sendTextElement(By.xpath("//input[@id='customer.firstName']"),"Ramesh");
        //* Enter Last name
        sendTextElement(By.xpath("//input[@id='customer.lastName']"),"Ramji");
        //* Enter Address
        sendTextElement(By.xpath("//input[@id='customer.address.street']"),"56 friend park north finchley");
        //* Enter City
        sendTextElement(By.xpath("//input[@id='customer.address.city']"),"london");
        //* Enter State
        sendTextElement(By.xpath("//input[@id='customer.address.state']"),"heartfordshire");
        //* Enter Zip Code
        sendTextElement(By.xpath("//input[@id='customer.address.zipCode']"),"n12 9dp");
        //* Enter Phone
        sendTextElement(By.xpath("//input[@id='customer.phoneNumber']"),"30946843");
        //* Enter SSN
        sendTextElement(By.xpath("//input[@id='customer.ssn']"),"309468676743");
        //* Enter Username

        Random ran = new Random();
        int userName = ran.nextInt(100);
        sendTextElement(By.xpath("//input[@id='customer.username']"), "ramesh007"+userName+"007");
        //* Enter Password
        sendTextElement(By.xpath("//input[@id='customer.password']"), "ramesh008");
        //* Enter Confirm
        sendTextElement(By.xpath("//input[@id='repeatedPassword']"), "ramesh008");
        //* Click on REGISTER button

        clickOnElement(By.xpath("//tbody/tr[13]/td[2]/input[1]"));
        //* Verify the text 'Your account was created successfully. You are now logged in.’

        String expMessage1 = "Your account was created successfully. You are now logged in.";
        String actMessage1 = getTextFromElement(By.cssSelector("body:nth-child(2) div:nth-child(1) div:nth-child(3) div:nth-child(2) > p:nth-child(2)"));
        Assert.assertEquals("your account was not created", expMessage1,actMessage1);










    }

}
