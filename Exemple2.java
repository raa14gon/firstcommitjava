import java.util.Scanner;

public class Exemple2 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
        // making a reference
        //Stundet student1;

        // makin a object
        // student1 = new Student();

        Student student1 = new Student();

        System.out.println("Write the name of student");
        student1.name = scanner.nextLine();

        System.out.println("Write the averege of student");
        student1.averege = scanner.nextDouble();

        student1.verifyApprovetion();

        scanner.close();
    }

}
