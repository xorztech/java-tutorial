package Beginner;

public class MultipleIfElseProgram {
    public static void main(String args[]){
        int x = 3;

        if (x > 5) {
            System.out.println("x is greater than 5");
        } else if (x > 3) {
            System.out.println("x is greater than 3");
        } else {
            System.out.println("x is less than or equal to 3");
        }

        int dayOfWeek = 2;

        if (dayOfWeek == 1) {
            System.out.println("Monday");
        } else if (dayOfWeek == 2) {
            System.out.println("Tuesday");
        } else if (dayOfWeek == 3) {
            System.out.println("Wednesday");
        } else if (dayOfWeek == 4) {
            System.out.println("Thursday");
        } else if (dayOfWeek == 5) {
            System.out.println("Friday");
        } else if (dayOfWeek == 6) {
            System.out.println("Saturday");
        } else if (dayOfWeek == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid day");
        }
    }
}
