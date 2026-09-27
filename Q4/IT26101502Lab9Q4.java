import java.util.Scanner;

public Class studentMarks{

    
    public static double calcFinalMark(double assignmentMark, double examMark) {
        return (assignmentMark * 0.30) + (examMark * 0.70);
    }

    
    public static String findGrades(double finalMark) {
        if (finalMark >= 75) {
            return "A";
        } else if (finalMark >= 60) {
            return "B";
        } else if (finalMark >= 50) {
            return "C";
        } else {
            return "F";
        }
    }

   
    public static void printDetails(String name, double finalMark, String grade) {
        System.out.printf("%-15s %-15.2f %-5s%n", name, finalMark, grade);
    }

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String[] names = new String[5];
        double[] finalMarks = new double[5];
        String[] grades = new String[5];

        
        for (int i = 0; i < 5; i++) {
            System.out.println("--- Student " + (i + 1) + " ---");
            System.out.print("Enter Name: ");
            names[i] = scanner.nextLine();

            System.out.print("Enter Assignment Mark (out of 100): ");
            double assignmentMark = scanner.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100): ");
            double examMark = scanner.nextDouble();
            
            
            scanner.nextLine();

            
            finalMarks[i] = calcFinalMark(assignmentMark, examMark);
            grades[i] = findGrades(finalMarks[i]);
            System.out.println();
        }

       
        System.out.printf("%-15s %-15s %-5s%n", "Name", "Final Mark", "Grade");
        System.out.println("----------------------------------------");

        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }

        scanner.close();
    }
}