import java.util.*;

class Student_Grade_Calc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float DSA = 0, Java = 0, DDC = 0, CS = 0;
        float total = 0, mean = 0;

        System.out.print("Enter Marks of DSA: ");
        DSA = scan.nextInt();
        System.out.print("Enter Marks of Java: ");
        Java = scan.nextInt();
        System.out.print("Enter Marks of DDC: ");
        DDC = scan.nextInt();
        System.out.print("Enter Marks of CS: ");
        CS = scan.nextInt();
        total = DSA + DDC + CS + Java;
        mean = total / 4;
        System.out.println("Total Marks Score: " + total);
        System.out.println("Average Marks Percantage: " + mean);
        if (mean > 85 && mean <= 100) {
            System.out.println("Grade : A");
        } else if (mean <= 85 && mean > 70) {
            System.out.println("Grade : B");
        } else if (mean <= 70 && mean > 65) {
            System.out.println("Grade : c");
        } else if (mean <= 65 && mean > 50) {
            System.out.println("Grade : D");
        } else if (mean <= 50 && mean > 35) {
            System.out.println("Grade : E");
        } else {
            System.out.println("Fail");
        }
    }
}
