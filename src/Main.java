import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Flight flight = new Flight();

        do {
            System.out.println("============================================");
            System.out.println("1. Display");
            System.out.println("2. Add");
            System.out.println("3. Remove");
            System.out.println("4. Close");
            System.out.println("Pilih operasi yang ingin di lakukan:");
            String pilih = input.nextLine();
            System.out.println("============================================");

            if (pilih.equals("1") || pilih.equalsIgnoreCase("Display")) {
                System.out.println("Daftar penumpang saat ini:");
                flight.displayPassanger();
            } else if (pilih.equals("2") || pilih.equalsIgnoreCase("Add")) {
                System.out.println("Masukkan nama penumpang:");
                String nama = input.nextLine();
                flight.addPassenger(nama);
                System.out.println("Daftar penumpang saat ini:");
                flight.displayPassanger();
            } else if (pilih.equals("3") || pilih.equalsIgnoreCase("Remove")) {
                System.out.println("Masukkan nama penumpang yang mau di hapus:");
                String nama = input.nextLine();
                flight.removePassenger(nama);
                System.out.println("Daftar penumpang saat ini:");
                flight.displayPassanger();
            } else if (pilih.equals("4") || pilih.equalsIgnoreCase("Close")) {
                System.exit(0);
            } else {
                System.out.println("Inputan anda salah");
            }
        } while(true);
    }
}