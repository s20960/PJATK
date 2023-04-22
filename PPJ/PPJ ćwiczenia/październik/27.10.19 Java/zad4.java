public class zad4{
	public static void main(String[] args){
		java.util.Scanner in = new java.util.Scanner(System.in);
		int W = 0b00111111;
		int X = 0b00000101;
		int Y = 0b00010001;
		int Z = 0b00001100;
		int A = in.nextInt();
		int suma=W+X+Y+Z;
		//System.out.println(suma);
		
		if(suma<A){
			if((W&0b00010000)==16) System.out.println(W);
			if((X&(1<<4))==16) System.out.println(X);
			if((Y&(1<<4))==16) System.out.println(Y);
			if((Z&(1<<4))==16) System.out.println(Z);
			System.out.println(suma);
		}else{
			int A3=in.nextInt();
			
		}
		
		
		
		

		
		
		System.out.println("");
	}
	
}