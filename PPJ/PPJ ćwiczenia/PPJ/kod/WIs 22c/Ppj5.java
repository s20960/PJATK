public class Ppj5 {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		
		int liczba = in.nextInt();
		if (liczba > 0)
			System.out.println("Wpisana liczba jest większa od 0");
		else if (liczba < 0)
			System.out.println("Wpisana liczba jest mniejsza od 0");
		
		System.out.println(
			liczba > 0 ? "Wpisana liczba jest większa od 0"
						: liczba < 0 ? "Wpisana liczba jest mniejsza od 0"
										: ""

		);
		
		int x = in.nextInt();
		int y = in.nextInt();
		if (x <= y){
			if (liczba <= y && liczba >= x)
				System.out.println("Należy do zbioru");
			else
				System.out.println("Nie należy do zbioru");
		} else 
			System.out.println("Zły zakres");
		
		
		byte zmByte = 86;
		System.out.println(zmByte & (1 << 0));
		System.out.println(zmByte & (1 << 1));
		System.out.println(zmByte & (1 << 2));
		System.out.println(zmByte & (1 << 3));
		System.out.println(zmByte & (1 << 4));
		System.out.println(zmByte & (1 << 5));
		System.out.println(zmByte & (1 << 6));
		System.out.println(zmByte & (1 << 7));
		
		byte licznik = 0;
		while (licznik < 3) {
			liczba = (int)(Math.random() * 101);
			x = in.nextInt();
			y = in.nextInt();
			if (x <= y){
				if (liczba <= y && liczba >= x)
					System.out.println("Należy do zbioru");
				else
					System.out.println("Nie należy do zbioru");
			} else 
				System.out.println("Zły zakres");
			licznik = (byte)(licznik + 1);
		}
		System.out.println("Zakonczona petla");
	}
}