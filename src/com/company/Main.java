package com.company;

import java.util.ArrayList;

//Write a Java program to create a new array list to hold colors.
//Add at least 3 colors (string) to the array list and print out all its values.
//Using the array list created above, print out the value at index 1.
//Using the array list above, prompt the user for one new color, and add that color to the array list.
//Using the array list, continue prompting the user for colors until they type in
//"Q" or "q" to quit. Each time the user enters a color, add that to the array list. Print out the list at the end.
public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String>colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("Yellow");

        int i=1;
        System.out.println("Get color at index 1: " + colors.get(i));

    }
}
