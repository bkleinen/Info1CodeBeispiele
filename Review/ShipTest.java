

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ShipTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ShipTest
{
    /**
     * Default constructor for test class ShipTest
     */
    public ShipTest()
    {
    }

   
    @Test
    public void playWithShip(){
        Ship ship = new Ship();
        Hafen sfo = new Hafen();
        ship.setLocation(sfo);
        // Offene See?
        Hafen offeneSee = new Hafen();
        ship.setLocation(offeneSee);
        ship.setLocation(null);
        
        
        
       // ship.getHafen().getCountry();
        
        

        
    }
}
