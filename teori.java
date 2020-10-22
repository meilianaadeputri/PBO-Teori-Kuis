import java.util.Scanner;
public class teori {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nama anda: ");
		String nama = input.nextLine();
		System.out.print("Masukkan tipe rumah anda: ");
		byte tipe = input.nextByte();
		System.out.print("Jumlah meteran yang anda pakai(kWH): ");
		float meteran = input.nextFloat();
		
		int biaya=0;
		switch(tipe) {
			case 31: biaya=100000; break;
			case 32: biaya=125000; break;
			case 33: biaya=450000; break;
			case 34: biaya=480000; break;
			case 35: biaya=500000; break;
			case 40: biaya=550000; break;
			default: System.out.println("Tipe rumah salah");
		}
		float total = meteran*biaya;
		System.out.println("Total: Rp" + (int)total);
		
		System.out.print("Jumlah bayar: Rp");
		int bayar = input.nextInt();
		float kembalian = bayar-total;
		
		System.out.println("======================================");
		System.out.println("Nama       	: " + nama);
		System.out.println("Total harga	: Rp" + (int)total);
		System.out.println("Bayar		: Rp" + bayar);
		System.out.println("Kembalian	: Rp" + (int)kembalian);
	}
}