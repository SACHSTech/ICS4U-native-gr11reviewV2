package gr11review.test1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;

import org.junit.jupiter.api.Test;
import gr11review.part1.*;
import java.io.*;

import javax.swing.JToolBar.Separator;

public class Review4Test {

    private final InputStream sysInBackup = System.in; // backup System.in to restore it later
    private final PrintStream sysOutBackup = System.out; // backup System.out to restore later
    private final String sep = System.getProperty("line.separator");

    @After
    public void restoreStreams() {
         // restore the backups
         System.setIn(sysInBackup);
         System.setOut(sysOutBackup);
    }

    /**
     * 0 entry for number of products
     * @throws Exception
     */
    @Test
    public void testMain0() throws Exception{

        // input blank on product prompt
        String simulatedUserInput = "0" + sep + "0" + sep;
        ByteArrayInputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes());

        // Set the output stream expected value
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        String expectedOutput = "Enter the number of trips: " 
        + "Enter the fuel efficency of the vehicle (in L/100km): "
        + "The total distance travelled is 0.0km" + sep
        + "The total amount of gas consumed is 0.0L";

        // Set the System in/out to the simulated input/output
        System.setIn(in);
        System.setOut(new PrintStream(out));
   
        // run the comparison
        Review4.main(null);
        assertEquals(expectedOutput.trim(), out.toString().trim(), "Failed testMain0");

    }

    /**
     * 0 entry for number of products
     * @throws Exception
     */
    @Test
    public void testException() throws Exception{

        // input blank on product prompt
        String simulatedUserInput = "";
        ByteArrayInputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes());

        // Set the output stream expected value
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        
        // Set the System in/out to the simulated input/output
        System.setIn(in);
        System.setOut(new PrintStream(out));
   
        // run the comparison
        assertThrows(NumberFormatException.class, () -> {Review4.main(null);});
    }


    /**
     * Test 3 products
     * @throws Exception
     */
    @Test
    public void testMain1() throws Exception{

        // input blank on product prompt
        String simulatedUserInput = "3" + sep
        + "15.5" + sep
        + "10" + sep
        + "20" + sep
        + "30" + sep;

        ByteArrayInputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes());

        // Set the output stream expected value
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        String expectedOutput = "Enter the number of trips: "
        + "Enter the fuel efficency of the vehicle (in L/100km): "
        + "Enter the distance travelled for trip 1: " 
        + "Enter the distance travelled for trip 2: "
        + "Enter the distance travelled for trip 3: ";

        expectedOutput += "The total distance travelled is 60.0km" + sep
        + "The total amount of gas consumed is 9.3L" + sep;


        // Set the System in/out to the simulated input/output
        System.setIn(in);
        System.setOut(new PrintStream(out));
   
        // run the comparison
        Review4.main(null);
        assertEquals(expectedOutput.trim(), out.toString().trim(), "Failed testMain1");
    }

    /**
     * Test int $ values
     */
    @Test
    public void testMain2() throws Exception{

        // input blank on product prompt
        String simulatedUserInput = "2" + sep
        + "15" + sep
        + "10" + sep
        + "30" + sep;
        ByteArrayInputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes());

        // Set the output stream expected value
        // Set the output stream expected value
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        String expectedOutput = "Enter the number of trips: "
        + "Enter the fuel efficency of the vehicle (in L/100km): "
        + "Enter the distance travelled for trip 1: " 
        + "Enter the distance travelled for trip 2: ";

        expectedOutput += "The total distance travelled is 40.0km" + sep
        + "The total amount of gas consumed is 6.0L" + sep;

        // Set the System in/out to the simulated input/output
        System.setIn(in);
        System.setOut(new PrintStream(out));
   
        // run the comparison
        Review4.main(null);
        assertEquals(expectedOutput.trim(), out.toString().trim(), "Failed testMain2");
    }





}