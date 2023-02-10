/********************************************************************
 * Programmer:	sveinson
 * Class:  CS20S
 *
 * Assignment: Switch example 1 grade message
 * Program Name:  simpleSwitchGradeMessage
 *
 * Description: use a switch statement to print a message based on a letter
 *                      grade entered from the keyboard
 *
 * Input: letter grade
 *
 * Output: message associated with letter grade
 ***********************************************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
// import java.text.DecimalFormat;

public class simpleSwitchGradeMessage {  // begin class
    
    public static void main(String[] args) {  // begin main
    
    // ********* declaration of constants **********
    
    // ********** declaration of variables **********
    
    	String strin;			// string data input from keyboard
    	String strout;		// processed info string to be output
    	String bannerOut;		// string to print banner to message dialogs
    	
    	String prompt;		// prompt for use in input dialogs
    	
    	String delim = "[ :]+";		// delimiter string for splitting input string
    	String tabSpace = "      ";	// six spaces
        
                char grade;                         // grade entered from keyboard
    	
    // create an instance of the ConsoleReader so that we can read data from the keyboard
    
    	//ConsoleReader console = new ConsoleReader(System.in);
    	//DecimalFormat df1 = new DecimalFormat("##.###");
    	
    // ********** Print output Banner **********
    
    	System.out.println("*******************************************");
    	System.out.println("Name:		your name here");
    	System.out.println("Class:		CS20S");
    	System.out.println("Assignment:	Ax Qy");
    	System.out.println("*******************************************");

    	bannerOut = "*******************************************\n";
    	bannerOut += "Name:		your name here\n";
    	bannerOut += "Class:		CS20S\n";
    	bannerOut += "Assignment:	Ax Qy\n";
    	bannerOut += "*******************************************\n\n";
    	
    // ************************ get input **********************

    	prompt = "Enter your prompt text here. \n";	
    	prompt += "you may need to add additional lines\n";
    	prompt += "or delete some of these prompt lines.\n\n";
    
    	
    	strin = JOptionPane.showInputDialog(bannerOut + prompt);	 
    
    	/* **********************************
    	 * split the input string into tokens
    	 * use the value in delim as the delimieter
    	 * uncomment the line to use it.
    	 ************************************/
    	//String[] tokens = strin.split(delim);
    	

    // ************************ processing ***************************
    
    // ************************ print output ****************************
    
    
        // ******** closing message *********
        
        System.out.println("end of processing.");
    }  // end main
}  // end class
