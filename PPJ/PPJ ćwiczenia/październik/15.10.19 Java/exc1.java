public class exc1{
	public static void main(String[] args){
	java.util.Scanner in = new java.util.Scanner(System.in);
	int liczba = in.nextInt();
	//System.out.println(liczba);
	if(liczba<0) System.out.println("Liczba jest mniejsza od zera");
	if(liczba>0) System.out.println("Liczba jest wieksza od zera");
	
	System.out.println(
		liczba>0?"Liczba wieksza od 0":
		liczba<0?"Liczba mniejsza od 0": ""
	);
	
	
	}
	
}