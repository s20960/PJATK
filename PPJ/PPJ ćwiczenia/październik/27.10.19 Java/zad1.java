public class zad1{
	public static void main(String[] args){
	byte zmienna=(byte)0b10101010;
	int pomoc=zmienna & 1;
	if(pomoc==0){
		System.out.println("liczba jest parzysta");
	}
	else System.out.println("liczba jest nieparzysta");
	
	int pomoc1;
	int pomoc2;
	int pomoc3;
	int pomoc4;
	
	pomoc1=(zmienna & (1 << 1));
	pomoc2=(zmienna & (1 << 3));
	pomoc3=(zmienna & (1 << 5));
	pomoc4=(zmienna & (1 << 7));
		
	System.out.println(
		pomoc1 == 2 ? "ten bit wynosi 1" :""
	);
	System.out.println( 
		pomoc2 == 8 ? "ten bit wynosi 1" : ""
	);
		System.out.println(
		pomoc3 == 32 ? "ten bit wynosi 1" :  ""
	);
		System.out.println(
		pomoc4 == 128 ? "ten bit wynosi 1" : ""
	);
	
	
	}	
}	