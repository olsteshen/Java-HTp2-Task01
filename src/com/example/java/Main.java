package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String string1 = "PHP Exercises and ";
        String string2 =  "Python Exercises";
        StringBuilder string3 = new StringBuilder();
        char [] array = string1.concat(string2).toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 'p' && array[i] !='P'){
                string3.append(array[i]);
            }
        }
        System.out.println("The concatenated string with replacements: " + string3);
    }
}
