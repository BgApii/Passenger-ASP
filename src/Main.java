public class Main {
    public static void main(String[] args) {
        Flight flight = new Flight();

        System.out.println("Daftar pelanggan saat belum di tambah:");
        flight.displayPassanger();
        System.out.println("=====================================================");

        flight.addPassenger("Apri");
        flight.addPassenger("Wildan");
        flight.addPassenger("Zacky");
        flight.addPassenger("Allen");
        System.out.println("Setelah di tambah, daftar passenger saat ini:");
        flight.displayPassanger();
        System.out.println("=====================================================");

        flight.removePassenger("Zacky");
        System.out.println("Daftar passenger setelah nama Zacky di hapus:");
        flight.displayPassanger();
        System.out.println("=====================================================");

        System.out.println("Remove passenger jika tidak ada di daftar pelanggan:");
        flight.removePassenger("Aprek");
    }
}