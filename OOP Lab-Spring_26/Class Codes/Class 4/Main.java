// Problem Set 03 - Q1

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /// Taking Input
        Student [] arr = new Student[3];

        String rollNo;
        String name;
        int marksCount;
        double [] marks;

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<arr.length; i++)
        {
            rollNo = sc.next();
            name = sc.nextLine();
            marksCount = sc.nextInt();

            marks = new double[marksCount]; //Common mistake

            for(int j=0; j<marksCount; j++)
            {
                marks[j] = sc.nextDouble();
            }

            arr[i] = new Student(rollNo,name,marks);
        }

        /// Display Info
        for(Student s: arr)
        {
            s.displayInfo();
        }

        /// Print Topper
        Student.findTopper(arr);

    }

}
