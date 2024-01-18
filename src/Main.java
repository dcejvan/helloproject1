

//DO NOT REMOVE PACKAGE LINE
//Without this line authograder will not run correctly
//You can comment it while you work on the problem
//When everything works - uncomment and submit!
package com.gradescope.lab1pr1;
public class Main {
    /*Find all the problems (bugs)
    / fix the errors (explain in comments what you did to fix it!)
    / When the program is fixed. Run it.
    /Correct run will print:
    /Hello Class!
    / 12
    /This is 17
    */
    public static void main(String[] args) {
        String word = "Hello Class!";
        System.out.println(word);
        int x = 7 + 5;
        System.out.println(x);
        int z = 1;
        int y = z + 4;

        y += 1;
        System.out.println("This is " + y);
    }
}

