public class Main {
    public static void main(String[] args) {
        Flight flight = new Flight();

        flight.addPassenger("Apri");
        flight.addPassenger("Wildan");
        flight.addPassenger("Zacky");
        flight.addPassenger("Allen");
        System.out.println("Daftar passenger saat ini:");
        flight.displayPassanger();

        flight.removePassenger("Zacky");
        System.out.println("Daftar passenger setelah di hapus:");
        flight.displayPassanger();
    }
}