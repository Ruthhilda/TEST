/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.helloworld;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mukis
 */
public class question2 {

 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> studentNames = new ArrayList<>();
        ArrayList<double[]> studentMarks = new ArrayList<>();
        String input;

        System.out.println("Enter student names and their marks (type 'x' to finish):");

        while (true) {
            System.out.print("Enter student name (or 'x' to finish): ");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("x")) {
                break;
            }
            studentNames.add(input);

            double[] marks = new double[4]; // Assuming 4 subjects
            
            System.out.print("Enter marks for science: ");
            marks[0] = scanner.nextDouble();
            
            System.out.print("Enter marks for English: ");
            marks[1] = scanner.nextDouble();
            
            System.out.print("Enter marks for SST: ");
            marks[2] = scanner.nextDouble();
            
            System.out.print("Enter marks for math: ");
            marks[3] = scanner.nextDouble();
            studentMarks.add(marks);

            scanner.nextLine(); // Consume the newline character left by nextDouble
        }

        System.out.println("Student Data:");

        for (int i = 0; i < studentNames.size(); i++) {
            double[] marks = studentMarks.get(i);
            double totalMarks = 0;
            for (double mark : marks) {
                totalMarks += mark;
            }
            System.out.println("Name: " + studentNames.get(i) + ", Total Marks: " + totalMarks);
        }
    }
}





        
