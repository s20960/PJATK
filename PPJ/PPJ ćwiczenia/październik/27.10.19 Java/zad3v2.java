public class zad3{
	public static void main(String[] args){
		java.util.Scanner in = new java.util.Scanner(System.in);
		byte wrt = in.nextByte();
		for(int i=7;i>=0;i--){
        System.out.println(wrt & (1 << i)); 
		}
	
	
	
	
	}
	
}