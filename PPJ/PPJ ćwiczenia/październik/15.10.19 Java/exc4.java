public class exc4{
	public static void main(String[] args){
	java.util.Scanner in = new java.util.Scanner(System.in);

	//System.out.println(liczba);
	int x = in.nextInt();
	int y = in.nextInt();
	int pomoc;
	if(x>y){
		pomoc = x;
		x=y;
		y=pomoc;
	}
	
	for(int i=0;i<3;i++){
		int liczba = (int) (Math.random()*10);
		System.out.println(liczba);
	if(liczba>=x && liczba<=y) System.out.println("Podana liczba jest w zakresie ");
	else System.out.println("Podana liczba nie jest w zakresie ");
	}
	}
	
}