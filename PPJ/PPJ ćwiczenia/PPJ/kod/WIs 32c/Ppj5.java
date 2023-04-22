public class Ppj5 {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		
		System.out.println("Podaj liczbę");
		int liczba = in.nextInt();
		
		if (liczba > 0) {
			System.out.println("Liczba większa od 0");
		} else if (liczba < 0) {
			System.out.println("Liczba mniejsza od 0");
		}
		
		System.out.println(
			liczba > 0 ? "Liczba większa od 0" :
			liczba < 0 ? "Liczba mniejsza od 0" : ""
		);
		
		int x = in.nextInt();
		int y = in.nextInt();
		
		if (x <= y) {
			if (liczba >= x && liczba <= y) {
				System.out.print("Należy do przedziału ");
				System.out.print(x);
				System.out.print(";");
				System.out.println(y);
			} else {
				System.out.println("Nie należy do przedziału [" + x + "; " + y + "]");
			}
		} else {
			System.out.println("Podałeś zły przedział");
		}
		
		byte binaryNum = 86;
		System.out.println(binaryNum & 1);
		System.out.println(binaryNum & (1 << 1));
		System.out.println(binaryNum & (1 << 2));
		System.out.println(binaryNum & (1 << 3));
		System.out.println(binaryNum & (1 << 4));
		System.out.println(binaryNum & (1 << 5));
		System.out.println(binaryNum & (1 << 6));
		System.out.println(binaryNum & (1 << 7));
		
		for(int i = 0; i < 3; i++) {
		
			liczba = Math.random();
			x = in.nextInt();
			y = in.nextInt();
			
			if (x <= y) {
				if (liczba >= x && liczba <= y) {
					System.out.print("Należy do przedziału ");
					System.out.print(x);
					System.out.print(";");
					System.out.println(y);
				} else {
					System.out.println("Nie należy do przedziału [" + x + "; " + y + "]");
				}
			} else {
				System.out.println("Podałeś zły przedział");
			}
		
		}
	}
}