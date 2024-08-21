import java.util.Scanner;

public class TotalHargaBelanja {

    public static void main(String[] args) {
        double hargaAwal;
        double persentaseDiskon;
        int jumlahBarang;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan harga awal barang: ");
        hargaAwal = input.nextDouble();

        System.out.print("Masukkan persentase diskon (dalam %): ");
        persentaseDiskon = input.nextDouble();

        System.out.print("Masukkan jumlah barang yang dibeli: ");
        jumlahBarang = input.nextInt();

        double diskon= hargaAwal * (persentaseDiskon / 100);

        double totalHarga = (hargaAwal - diskon) * jumlahBarang;

        System.out.println("Total harga setelah diskon: " + totalHarga);

        input.close();
    }
}