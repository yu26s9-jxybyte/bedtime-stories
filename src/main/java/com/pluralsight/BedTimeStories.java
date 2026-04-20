package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BedTimeStories {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of a bedtime story to read: ");
        String fileName = scanner.nextLine();

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufreader = new BufferedReader(fileReader);

            String line;
            String input;

            int linenumber = 1;

            while ((input = bufreader.readLine()) != null) {
                System.out.println(input);
            }
            bufreader.close();
        }
        catch (IOException e){
                e.printStackTrace();
            }
        }

    }

