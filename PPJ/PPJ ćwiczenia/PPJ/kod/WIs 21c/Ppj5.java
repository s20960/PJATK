public class Ppj5 {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		
		System.out.println("Wprowadz liczbę");
		int inputNumber = in.nextInt();
		
		if (inputNumber > 0) {
			System.out.println("Jest większa");
		} else if(inputNumber < 0) {
			System.out.println("Jest mniejsza");
		}
		
		System.out.println(
			inputNumber > 0 ? "Jest większa" :
			inputNumber < 0 ? "Jest mniejsza" : ""
		);
		
		System.out.println("Wprowadz X");
		int x = in.nextInt();
		System.out.println("Wprowadz Y");
		int y = in.nextInt();
		
		if (x <= y) {
			if (inputNumber <= y && inputNumber >= x) {
				System.out.println("Nalezy do przedziału [X; Y]");
			} else {
				System.out.println("Nie nalezy do przedziału [X; Y]");
			}
		} else {
			System.out.println("Zły przedział");
		}
		
		byte z3 = 86;
		System.out.println(z3 & 1);
		System.out.println(z3 & (1 << 1));
		System.out.println(z3 & (1 << 2));
		System.out.println(z3 & (1 << 3));
		System.out.println(z3 & (1 << 4));
		System.out.println(z3 & (1 << 5));
		System.out.println(z3 & (1 << 6));
		System.out.println(z3 & (1 << 7));
		
		
		
	}
}