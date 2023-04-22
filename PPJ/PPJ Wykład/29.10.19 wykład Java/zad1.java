import java.util.Scanner;
public class zad1{
	public static void main(String[] args){
		java.util.Scanner in = new java.util.Scanner(System.in);
		/*int [] tab = new int [5];
		for(int i=0;i<5;i++){
			tab[i]= (int)(Math.random()*10);
		}
		for(int i=0;i<5;i++){
			System.out.print(tab[i]+ " ");
		}
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("");
		System.out.println("");
		System.out.println("Czy Asice sie nudzi?");
		System.out.println("Odpowiedz, tak lub nie: ");
		String pytanie=scan.nextLine();
		if(pytanie=="nie"){ System.out.println("LOL");}
	    else { System.out.println("OK");}
		
		
		
	}
}
