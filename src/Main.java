import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get the year entered by the user
        System.out.println("Yıl Giriniz: ");
        int year = scanner.nextInt();

        if (year % 4 == 0) {
            System.out.println(year + " " + "bir artık yıldır!");
        } else {
            System.out.println(year + " " + "bir artık yıl değildir.");
        }
    }
}