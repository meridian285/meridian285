package unitTesting;

import org.testng.Assert;
import org.testng.annotations.Test;
import tickets.Tickets;

public class UnitTest {
    @Test
    public void ticket_infant_freeTicket(){
        //Given - Arrange - preconditions
        Tickets infant = new Tickets(2,1000);
        //When - Act - testing
        double result = infant.calculate();
        //Then - Assert - Compare expected and Actual result
        Assert.assertEquals(result, 0.0,"ErrorBZZZZZZZZZZZ");
    }
    @Test
    public void ticket_child_50percent(){

        Tickets child = new Tickets(10,1000);

        double result = child.calculate();

        Assert.assertEquals(result, 500.0,"ErrorBZZZZZZZZZZZ");
    }
    @Test
    public void ticket_fullPrice(){

        Tickets child = new Tickets(25,1000);

        double result = child.calculate();

        Assert.assertEquals(result, 1000.0,"ErrorBZZZZZZZZZZZ");
    }
    @Test
    public void ticket_Ticket(){

        Tickets old = new Tickets(66,1000);

        double result = old.calculate();

        Assert.assertEquals(result, 800.0,"ErrorBZZZZZZZZZZZ");
    }
}
