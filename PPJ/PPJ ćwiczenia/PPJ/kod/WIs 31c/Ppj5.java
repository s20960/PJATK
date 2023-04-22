public class Ppj5 {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		
		System.out.println("Podaj liczbę");
		int liczba = in.nextInt();
		
		if (liczba > 0) {
			System.out.println("Większa od 0");
		} else if (liczba < 0) {
			System.out.println("Mniejsza od 0");
		}
		
		System.out.println(
			liczba > 0 ? "Większa od 0" :
			liczba < 0 ? "Mniejsza od 0" : ""
		);
		
		System.out.println("Podaj x");
		int x = in.nextInt();
		System.out.println("Podaj y");
		int y = in.nextInt();
		
		if (x <= y) {
			if (liczba >= x && liczba <=y) {
				System.out.println("Należy do przedziału");
			} else {
				System.out.println("Nie należy do przedziału");
			}
		} else {
			System.out.println("Podałes zły przedział");
		}
		
		byte number = 86;
		System.out.println(number & 1);
		System.out.println(number & (1 << 1));
		System.out.println(number & (1 << 2));
		System.out.println(number & (1 << 3));
		System.out.println(number & (1 << 4));
		System.out.println(number & (1 << 5));
		System.out.println(number & (1 << 6));
		System.out.println(number & (1 << 7));
		
		int zmPomocnicza = 0;
		while(zmPomocnicza < 3) {
			liczba = (int)(Math.random() * 100);
			
			System.out.println("Podaj x");
			x = in.nextInt();
			System.out.println("Podaj y");
			y = in.nextInt();
			
			if (x <= y) {
				if (liczba >= x && liczba <=y) {
					System.out.println("Należy do przedziału");
				} else {
					System.out.println("Nie należy do przedziału");
				}
			} else {
				System.out.println("Podałes zły przedział");
			}
			zmPomocnicza += 1;
		}
		
		
	}
}