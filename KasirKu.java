import java.util.Scanner;
public class KasirKu {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int pilih1, pilih2, pin;
            int harga, jumlah;

            System.out.println("=====Aplikasi Kasir=====");
            System.out.print("PIN = ");
            pin = sc.nextInt();

            if (pin == 123) {
                System.out.println("=====Selamat Datang=====");
                System.out.println("====Daftar Menu Kami====");
                System.out.println("1. Makanan Berat");
                System.out.println("2. Minuman");
                System.out.println("1. Makanan Ringan");
                System.out.print("Pilih Menu = ");
                pilih1 = sc.nextInt();

                switch (pilih1) {
                    case 1:
                        System.out.println("======Makanan Berat======");
                        System.out.println("1. Rendang - Rp25000");
                        System.out.println("2. Pempek  - Rp15000");
                        System.out.println("3. Gudeg   - Rp18000");
                        System.out.println("4. Geprek  - Rp12000");
                        System.out.println("========================");
                        System.out.print("Pilih Makanan Berat: ");
                        pilih2 = sc.nextInt();

                        switch (pilih2) {
                            case 1:
                                harga = 25000;
                                break;
                            case 2:
                                harga = 15000;
                                break;
                            case 3:
                                harga = 18000;
                                break;
                            case 4:
                                harga = 12000;
                                break;
                            default:
                                harga = 0;
                                System.out.println("ERROR (Tidak Ada Pilihan!)");
                        }

                        System.out.print("Jumlah Pembelian = ");
                        jumlah = sc.nextInt();

                        System.out.println("Total Harga: " + (harga * jumlah));
                        break;
                    
                    case 2:
                        System.out.println("=========Minuman========");
                        System.out.println("1. Es Teh - Rp4000");
                        System.out.println("2. Es Degan - Rp10000");
                        System.out.println("1. Kopi - Rp6000");
                        System.out.println("========================");
                        System.out.print("Pilih Minuman: ");
                        pilih2 = sc.nextInt();

                        switch (pilih2) {
                            case 1:
                                harga = 4000;
                                break;
                            case 2:
                                harga = 10000;
                                break;
                            case 3:
                                harga = 6000;
                                break;
                            default:
                                harga = 0;
                                System.out.println("ERROR (Tidak Ada Pilihan!)");
                        }
                        
                        System.out.print("Jumlah Pembelian = ");
                        jumlah = sc.nextInt();

                        System.out.println("Total Harga: " + (harga * jumlah));
                        break;

                    case 3:
                        System.out.println("========Makanan Ringan========");
                        System.out.println("1. Kentang Goreng - Rp10000");
                        System.out.println("2. Bakwan - Rp2000");
                        System.out.println("3. Mendoan - Rp1000");
                        System.out.println("4. Dimsum (4pcs) - Rp25000");
                        System.out.println("==============================");
                        System.out.print("Pilih Makanan Ringan: ");
                        pilih2 = sc.nextInt();

                        switch (pilih2) {
                            case 1:
                                harga = 10000;
                                break;
                            case 2:
                                harga = 2000;
                                break;
                            case 3:
                                harga = 1000;
                                break;
                            case 4:
                                harga = 25000;
                                break;
                            default:
                                harga = 0;
                                System.out.println("ERROR (Tidak Ada Pilihan!)");
                        }

                        System.out.print("Jumlah Pembelian = ");
                        jumlah = sc.nextInt();

                        System.out.println("Total Harga: " + (harga * jumlah));
                        break;

                    default:
                        System.out.println("Pilihan Salah!");
                }
            } else {
                System.out.println("PIN salah!");
            }
        }
    }
}
