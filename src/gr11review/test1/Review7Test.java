package gr11review.test1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;

import org.junit.jupiter.api.Test;
import gr11review.part1.*;
import java.io.*;

public class Review7Test {

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

        // input 0 on product prompt
        String simulatedUserInput = "";
        ByteArrayInputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes());

        // Set the output stream expected value
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        String expectedOutput = "Enter a sentence: " +sep
        + "# Letters: 0" + sep
        + "# Digits: 0" + sep
        + "# Spaces: 0" + sep
        + "# Other: 0" + sep;
        System.setIn(in);
        System.setOut(new PrintStream(out));


        // run the comparison
        assertThrows(NullPointerException.class, () -> {Review7.main(null);});
    
    }

    /**
     * single letter, non-a
     */
    @Test
    public void testMain1() throws Exception{

        // input 0 on product prompt
        String simulatedUserInput = "x";
        ByteArrayInputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes());

        // Set the output stream expected value
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        String expectedOutput = "Enter a sentence: "
        + "# Letters: 1" + sep
        + "# Digits: 0" + sep
        + "# Spaces: 0" + sep
        + "# Other: 0" + sep;

        // Set the System in/out to the simulated input/output
        System.setIn(in);
        System.setOut(new PrintStream(out));
   
        // run the comparison
        Review7.main(null);
        assertEquals(expectedOutput.trim(), out.toString().trim(), "Failed testMain1");

    }

    /**
     * multiple letter, non-a, no spaces
     */
    @Test
    public void testMain2() throws Exception{

        // input 0 on product prompt
        String simulatedUserInput = "ccc";
        ByteArrayInputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes());

        // Set the output stream expected value
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        String expectedOutput = "Enter a sentence: "
        + "# Letters: 3" + sep
        + "# Digits: 0" + sep
        + "# Spaces: 0" + sep
        + "# Other: 0" + sep;

        // Set the System in/out to the simulated input/output
        System.setIn(in);
        System.setOut(new PrintStream(out));
   
        // run the comparison
        Review7.main(null);
        assertEquals(expectedOutput.trim(), out.toString().trim(), "Failed testMain2");
    }

    /**
     * multiple letter, a, no spaces
     */
    @Test
    public void testMain3() throws Exception{

        // input 0 on product prompt
        String simulatedUserInput = "55ab";
        ByteArrayInputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes());

        // Set the output stream expected value
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        String expectedOutput = "Enter a sentence: "
        + "# Letters: 2" + sep
        + "# Digits: 2" + sep
        + "# Spaces: 0" + sep
        + "# Other: 0" + sep;

        // Set the System in/out to the simulated input/output
        System.setIn(in);
        System.setOut(new PrintStream(out));
   
        // run the comparison
        Review7.main(null);
        assertEquals(expectedOutput.trim(), out.toString().trim(), "Failed testMain3");
    }

    /**
     * multiple letter, a, spaces
     */
    @Test
    public void testMain4() throws Exception{

        // input 0 on product prompt
        String simulatedUserInput = "b a 1 b@";
        ByteArrayInputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes());

        // Set the output stream expected value
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        String expectedOutput = "Enter a sentence: "
        + "# Letters: 3" + sep
        + "# Digits: 1" + sep
        + "# Spaces: 3" + sep
        + "# Other: 1" + sep;

        // Set the System in/out to the simulated input/output
        System.setIn(in);
        System.setOut(new PrintStream(out));
   
        // run the comparison
        Review7.main(null);
        assertEquals(expectedOutput.trim(), out.toString().trim(), "Failed testMain4");
    }

    /**
     * multiple letter, a, different spaces
     */
    @Test
    public void testMain5() throws Exception{

        // input 0 on product prompt
        String simulatedUserInput = "# 1 2 3 x y z#";
        ByteArrayInputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes());

        // Set the output stream expected value
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        String expectedOutput = "Enter a sentence: "
        + "# Letters: 3" + sep
        + "# Digits: 3" + sep
        + "# Spaces: 6" + sep
        + "# Other: 2" + sep;

        // Set the System in/out to the simulated input/output
        System.setIn(in);
        System.setOut(new PrintStream(out));
   
        // run the comparison
        Review7.main(null);
        assertEquals(expectedOutput.trim(), out.toString().trim(), "Failed testMain5");
    }
    


    
}