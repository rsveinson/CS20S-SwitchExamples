/********************************************************************
 * Programmer:    sveinson
 * Class:  CS20S
 *
 * Assignment: Selection example 5.2 not so simple switch
 * Program Name:  shapeCalculator
 ***********************************************************************/

// import java libraries here as needed

import javax.swing.*;
import java.text.DecimalFormat;

public class shapeCalculator {  // begin class

    public static void main(String[] args) {  // begin main

        // ********* declaration of constants **********

        final double PI = 3.14159;        // constant value for PI

        // ********** declaration of variables **********

        String strin;                // string data input from keyboard
        String strout;                // processed info string to be output
        String banner;            // string to print banner to message dialogs

        String prompt;                // prompt for use in input dialogs

        String delim = "[ :]+";        // delimiter string for splitting input string
        String tabSpace = "      ";    // six spaces

        char type;                    // indicates type of shape
        double radius = 0.0;                    // radius of circle
        double length = 0.0;        // length of rectangle
        double width = 0.0;         // width of rectangle
        double altitude = 0.0;        // height of triangle
        double base = 0.0;            // base of triangle

        double area = 0.0;            // area of shape
        double perimiter = 0.0;        // perimiter or circumference

        // create an instance of the ConsoleReader so that we can read data from the keyboard


        // ********** Print output Banner **********

        banner = "*******************************************\n";
        banner += "Name:        your name here\n";
        banner += "Class:        CS20S\n";
        banner += "Assignment:    Ax Qy\n";
        banner += "*******************************************\n\n";
        
        System.out.println(banner);

        // ************************ get input **********************

        prompt = "Enter the shape c, r, or t. \n";    
        prompt += "Also enter the radius, length and width\n";
        prompt += "or height and base.\n\n";

        strin = JOptionPane.showInputDialog(banner + prompt);
        System.out.println(strin);     

        /* **********************************
         * split the input string into tokens
         * use the value in delim as the delimieter
         * uncomment the line to use it.
         ************************************/
        String[] tokens = strin.split(delim);
        System.out.println(tokens[0] + " " + tokens[1]);    // there may be another token if it's
        // a rectangle or triangle

        type = tokens[0].charAt(0);                    // get the char representing type of shape

        switch(type){
            case 'R':    // parse length and width for rectangle input
            case 'r':   length = Double.parseDouble(tokens[1]);    
                        width = Double.parseDouble(tokens[2]);
                        break;
            case 'T':    // parse height and base for triangle input
            case 't':   altitude = Double.parseDouble(tokens[1]);
                        base = Double.parseDouble(tokens[2]);
                        break;
            case 'c':    // parse radius for circle input
            case 'C':   radius = Double.parseDouble(tokens[1]);    
                        break;
            default:    System.out.println("someting has gone wrong, error, error, error");
        } // end switch on type

        // ************************ processing ***************************
        switch(type){
            case 'R':    
            case 'r':   area = length * width;        // area of rectangle
                        perimiter = length * 2 + width * 2;        // perimiter of rectangle    
                        break;
            case 'T':    
            case 't':   area = base * altitude / 2;            // area of triangle
                        perimiter = 0.0;                    // not used for triangles
                        break;
            case 'c':    
            case 'C':   area = PI * radius * radius;        // area of circle
                        perimiter = 2 * PI * radius;        // circumference of circle
                        break;
            default:    System.out.println("someting has gone wrong, error, error, error");
        } // end switch on type

        // ************************ print output ****************************

        strout = "Shape: " + type + "\n";
        strout += "Area: " + area + "\n";

        if(type == 't' || type == 'T'){
            strout += "Perimiter: not used\n\n";
        } // end if t
        else{
            strout += "Perimiter: " + perimiter + "\n\n";
        } // end not t

        JOptionPane.showMessageDialog(null, banner + strout);
        // ******** closing message *********
        System.out.println("end of processing.");
    }  // end main
}  // end class
