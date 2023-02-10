/********************************************************************
 * Programmer:    sveinson
 * Class:  CS20S
 *
 * Assignment: Selection Example 5.1 simple switch
 * Program Name:  gradeMessage
 ***********************************************************************/

// import java libraries here as needed

import javax.swing.*;
import java.text.DecimalFormat;

public class gradeMessageStarter {  // begin class

    public static void main(String[] args) {  // begin main

        // ********* declaration of constants **********

        // ********** declaration of variables **********

        String strin;                // string data input from keyboard
        String strout = "";          // processed info string to be output
        String banner;               // string to print banner to message dialogs

        String prompt;                // prompt for use in input dialogs

        String delim = "[ :]+";        // delimiter string for splitting input string
        
        char grade;                    // letter grade entered from keyboard

        // create an instance of the Scanner so that we can read data from the keyboard

        // ********** Print output banner **********
        banner = "*******************************************\n";
        banner += "Name:        your name here\n";
        banner += "Class:        CS20S\n";
        banner += "Assignment:    Selection example 5.1 simple switch\n";
        banner += "*******************************************\n\n";

        System.out.println(banner);

        // ************************ get input **********************

        prompt = "Enter your letter grade. \n\n";        

        strin = JOptionPane.showInputDialog(banner + prompt);     
        grade = strin.charAt(0);                // get the first character of the input string
        System.out.println("grade entered: " + grade);


        // ************************ processing ***************************
        // switch goes here
        
        // ************************ print output ****************************

        System.out.println(strout);

        // ******** closing message *********

        System.out.println("end of processing.");
    }  // end main
}  // end class
