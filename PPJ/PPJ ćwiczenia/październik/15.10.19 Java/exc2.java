public class exc2{
	public static void main(String[] args){
	java.util.Scanner in = new java.util.Scanner(System.in);
	int liczba = in.nextInt();
	//System.out.println(liczba);
	int x = in.nextInt();
	int y = in.nextInt();
	int pomoc;
	if(x>y){
		pomoc = x;
		x=y;
		y=pomoc;
	}
	if(liczba>=x && liczba<=y) System.out.println("Podana liczba jest w zakresie ");
	else System.out.println("Podana liczba nie jest w zakresie ");
	
	}
	
}