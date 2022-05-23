package org.example;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import static org.junit.Assert.assertTrue;



/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    /*@BeforeSuite
    public void beforeSuiteEx(){
        System.out.println("before Suite");
    }

    @BeforeClass
    public void beforeClassEx(){
        System.out.println("before class");
    }

    @BeforeTest
    public void beforeTestEx(){
        System.out.println("before Test");
    }

    @BeforeMethod
    public void beforeMethodEx(){
        System.out.println("before Method");
    }*/

   /* @Parameters({"first-name"})
    @Test
    public void shouldAnswerWithTrue(@Optional(value = "Kala") String name)
    {
        Assert.assertEquals("Sri",name);

    }


    @Test(dataProvider = "TestDataEx")
    public void testWithDataProvider(String actual,String expected, String output){
        Assert.assertEquals(actual,expected);
        Assert.assertTrue(true,"both the actual and expected are same");
        System.out.println(output);
    }*/

    //@Ignore
    @Test()
    public void aA(){
        System.out.println(System.currentTimeMillis());

    }


    @Test()
    public void bB()
    {
        System.out.println(System.currentTimeMillis());
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(true);
        softAssert.assertFalse(false);
        System.out.println("after assert fail");
        softAssert.assertAll();
    }



    @DataProvider(name="TestDataEx")
    public Object[][] dataProvider(){
        return new Object[][]{
                {"Sri","Sri","true"}
        };
    }

    @AfterClass
    public void afterClassEx(){
        System.out.println("after class");
    }
}
