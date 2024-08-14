import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    static Scanner input = new Scanner(System.in);
    static DecimalFormat x = new DecimalFormat("#.###");

    public static void main(String[] args) {
        double height;
        double length;
        double side1;
        double side2;
        double finger;

        System.out.println("======================");
        System.out.println("Program Pengiraan Luas");
        System.out.println("======================");

        System.out.println("Sila pilih jenis luas:");
        System.out.println("1. Segi empat");
        System.out.println("2. Trapezium");
        System.out.println("3. Bulatan");
        System.out.print("Pilihan: ");
        int choice = input.nextInt();

        switch (choice){
            case 1:
                System.out.print("Masukkan Tinggi: ");
                height = input.nextDouble();
                System.out.print("Masukkan Lebar: ");
                length = input.nextDouble();
                System.out.print(x.format(height * length));
                break;
            case 2:
                System.out.print("Masukkan sisi sejajar 1: ");
                side1 = input.nextDouble();
                System.out.print("Masukkan sisi sejajar 2: ");
                side2 = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                height = input.nextDouble();
                System.out.print(x.format(0.5 * (side1 * side2) * height));
                break;
            case 3:
                System.out.print("Masukkan jejari: ");
                finger = input.nextDouble();
                System.out.print(x.format(Math.PI * (finger * finger)));
                break;
        }
    }
}