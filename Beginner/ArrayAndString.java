package Beginner;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayAndString {
    public static void main(String[] args) {
        String stringVar = "Xorz Technology!";

        System.out.println("String: " + stringVar);
        System.out.println("Length: " + stringVar.length());
        System.out.println("Lowercase: " + stringVar.toLowerCase());
        System.out.println("Uppercase: " + stringVar.toUpperCase());

        //Array

        String[] javaTopics = {"Intro", "Setup", "Deployment"};
        System.out.println("Array: " + javaTopics);
        System.out.println("ArrayData: " + Arrays.toString(javaTopics));
        System.out.println("Length: " + javaTopics.length);

    }
}
