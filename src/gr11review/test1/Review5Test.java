package gr11review.test1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;

import org.junit.jupiter.api.Test;
import gr11review.part1.*;
import java.io.*;


public class Review5Test {


    private final InputStream sysInBackup = System.in; // backup System.in to restore it later
    private final PrintStream sysOutBackup = System.out; // backup System.out to restore later
    private final String sep = System.getProperty("line.separator");

    private final String[]testInputs = {
        "150",
        "10",
        "1000",
        "5"
     };

    private final String[] testOutputs = {
        "12",
        "8",
        "15",
        "7"
    };

    /**
     * Builds the simulatted input string with separators
     * @param inputList
     * @return
     */
    private String getFormattedInput(String[] inputList){
        String inputString = "";

        for (int i = 0; i < inputList.length - 1; i++){
            inputString += inputList[i];
            inputString += sep;
        }
        inputString += inputList[inputList.length - 1]; // add the last value without the separator
        return inputString;
    }


    private String getFormattedOutput(String output){
        return "Enter the initial amount of substance: "+ "The substance has decayed completely after "+ output +" half-lives."+ sep;
    }


    @After
    public void restoreStreams() {
         // restore the backups
         System.setIn(sysInBackup);
         System.setOut(sysOutBackup);
    }



    @Test
    void testMain0() throws Exception {
        
        // Set the input and output stream expected values
        String simulatedUserInput = testInputs[0];
        ByteArrayInputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes());

        // Set the output stream expected value
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        String expectedOutput = getFormattedOutput(testOutputs[0]);

        // Set the System in/out to the simulated input/output
        System.setIn(in);
        System.setOut(new PrintStream(out));
   
        // run the comparison
        Review5.main(null);
        assertEquals(expectedOutput, out.toString(), "Failed testMain0");
    }

    @Test
    void testMain1() throws Exception {
        
        // Set the input and output stream expected values
        String simulatedUserInput = testInputs[1];
        ByteArrayInputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes());

        // Set the output stream expected value
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        String expectedOutput = getFormattedOutput(testOutputs[1]);

        // Set the System in/out to the simulated input/output
        System.setIn(in);
        System.setOut(new PrintStream(out));
   
        // run the comparison
        Review5.main(null);
        assertEquals(expectedOutput, out.toString(), "Failed testMain1");
    }
    
    @Test
    void testMain2() throws Exception {
        
        // Set the input and output stream expected values
        String simulatedUserInput = testInputs[2];
        ByteArrayInputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes());

        // Set the output stream expected value
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        String expectedOutput = getFormattedOutput(testOutputs[2]);

        // Set the System in/out to the simulated input/output
        System.setIn(in);
        System.setOut(new PrintStream(out));
   
        // run the comparison
        Review5.main(null);
        assertEquals(expectedOutput, out.toString(), "Failed testMain2");
    }


    @Test
    void testMain3() throws Exception {
        
        // Set the input and output stream expected values
        String simulatedUserInput = testInputs[3];
        ByteArrayInputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes());

        // Set the output stream expected value
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        String expectedOutput = getFormattedOutput(testOutputs[3]);

        // Set the System in/out to the simulated input/output
        System.setIn(in);
        System.setOut(new PrintStream(out));
   
        // run the comparison
        Review5.main(null);
        assertEquals(expectedOutput, out.toString(), "Failed testMain3");
    }
}

