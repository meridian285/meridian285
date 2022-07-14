package unitTesting;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tickets.Tickets;

public class DataProviderExample {

    @DataProvider (name = "tickets")
    public Object[][] getData(){
        return new Object[][]{
                {1,1000,0.0},
                {2,500,0.0},
                {3,1000,500.0},
                {12,500,250.0},
                {13,500,500.0},
                {65,500,500.0},
                {66,1000,800.0},
                {25,1000,1000.0},
                {75,1000,800.0}
        };

    }

    @Test (dataProvider = "tickets")
    public void ticket_one_allCases(int age, int basePrice, double expectedResult){
        Tickets passenger = new Tickets(age,basePrice);
        double result = passenger.calculate();
        Assert.assertEquals(result, expectedResult);
    }
}
