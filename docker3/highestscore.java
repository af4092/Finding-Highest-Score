package docker3;

import java.util.Scanner;
import java.util.stream.IntStream.IntMapMultiConsumer;
import java.util.*;
import java.io.*;

public class highestscore {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Program which finds the highest scored student :)");
        System.out.print("Please enter the number of students: ");
        int NumberOfStudents = input.nextInt();
    
        String HighestScoredStudentName = "";
        String SecondHighestScoredStudentName = "";
        int HighestScore = 0;
        int SecondHighestScore = 0;

        System.out.println(new String(new char[45]).replace("\0", "\u2500"));

        for (int i = 0; i < NumberOfStudents; i++) {

            System.out.print("Student: " + (i + 1) + "\n   Name: ");
            String name = input.next();
            System.out.print("   Score: ");
            int score = input.nextInt();

            // HighestScore, SecondHighestScore, score
            if (score > HighestScore) {
                SecondHighestScore = HighestScore;
                SecondHighestScoredStudentName = HighestScoredStudentName;
                HighestScore = score;
                HighestScoredStudentName = name;
            }

        }

        System.out.println(new String(new char[45]).replace("\0", "\u2500"));
        System.out.println("Student with the highest score: " + HighestScoredStudentName + " ~ " + HighestScore);
        System.out.println("Student with the second highest score: " + SecondHighestScoredStudentName + " ~ "
                + SecondHighestScore);
    }
}
