import java.util.Scanner;

public class firstprogram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        Double averege;

        System.out.println("Write name of student:");
        name = scanner.nextLine();

        System.out.println("Write the averege of student:");
        averege = scanner.nextDouble();
    
        if (averege >= 7) {
            System.out.println(name + " approved");
        } else {
            System.out.println(name + " repproved");
        }

        scanner.close();
    }
}