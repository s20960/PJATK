public class michal{
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		/*
		//zad1
		System.out.println("Podaj liczbÄ™");
		int liczba = in.nextInt();
		
		if (liczba > 0) {
			System.out.println("Liczba wiÄ™ksza od 0");
		} else if (liczba < 0) {
			System.out.println("Liczba mniejsza od 0");
		}
		
		System.out.println(
			liczba > 0 ? "Liczba wiÄ™ksza od 0" :
			liczba < 0 ? "Liczba mniejsza od 0" : ""
		);
		//zad2
		int x = in.nextInt();
		int y = in.nextInt();
		
		if (x <= y) {
			if (liczba >= x && liczba <= y) {
				System.out.print("NaleĹĽy do przedziaĹ‚u ");
				System.out.print(x);
				System.out.print(";");
				System.out.println(y);
			} else {
				System.out.println("Nie naleĹĽy do przedziaĹ‚u [" + x + "; " + y + "]");
			}
		} else {
			System.out.println("PodaĹ‚eĹ› zĹ‚y przedziaĹ‚");
		}
		*/
		//zad3
		byte binaryNum =0b00000000 ;
		System.out.println(binaryNum  | 0b00000001);
		System.out.println(binaryNum | (0b00000001 << 1));
		System.out.println(binaryNum | (0b00000001 << 2));
		System.out.println(binaryNum | (0b00000001 << 3));
		System.out.println(binaryNum | (0b00000001 << 4));
		System.out.println(binaryNum | (0b00000001 << 5));
		System.out.println(binaryNum | (0b00000001 << 6));
		//System.out.println(binaryNum | (0b00000001 << 7));
		System.out.println(binaryNum);
		/*
		for(int i = 0; i < 3; i++) {
		
			double  liczba= (Math.random()*10);
			int x = in.nextInt();
			int y = in.nextInt();
			System.out.println(liczba);
			if (x <= y) {
				if (liczba >= x && liczba <= y) {
					System.out.print("NaleĹĽy do przedziaĹ‚u ");
					System.out.print(x);
					System.out.print(";");
					System.out.println(y);
					
				} else {
					System.out.println("Nie naleĹĽy do przedziaĹ‚u [" + x + "; " + y + "]");
				}
			} else {
				System.out.println("PodaĹ‚eĹ› zĹ‚y przedziaĹ‚");
			}
		
		}
		*/
	}
}