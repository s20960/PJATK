public class exc5{
	public static void main(String[] args){
	java.util.Scanner in = new java.util.Scanner(System.in);

	int los = (int) (Math.random()*100);
	int zgad = in.nextInt();
 
	for(;;){
		if (zgad<los) System.out.println("Podana liczba jest mniejsza od liczby randomowej");
		else if(zgad>los) System.out.println("Podana liczba jest większa od liczby randomowej");
		else if(zgad==los){
			System.out.println("Podana liczba jest równa liczbie randomowej");
			break;
		}
	}
	
	
	}
	
}