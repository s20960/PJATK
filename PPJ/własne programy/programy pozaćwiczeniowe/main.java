public class main{
	public static void main(String[] args){
	java.util.Scanner in = new java.util.Scanner(System.in);
	
//	java.util.Scanner in = new java.util.Scanner(Sysrem.in);
//	int nazwa = in.nextInt();
	
	System.out.println("Podaj liczbe: ");
	int liczba = in.nextInt();
	
	System.out.println(
	liczba<0?"liczba mniejsza od zera":
	liczba>0?"liczba wieksza od zera": ""
	);
	
	}

}
//	java.util.Scanner in = new java.util.Scanner(System.in);
//	int nazwa = in.nextInt();