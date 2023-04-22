public class Ppj4 {
	public static void main(String[] args) {
		byte maxByte = (byte)0b01111111;
		byte minByte = (byte)0b10000000;
		
		short maxShort = (short)0x7FFF;
		short minShort = (short)0x8000;
		
		int maxInt = 017777777777;
		int minInt = 020000000000;
		
		float maxFloat = Float.MAX_VALUE;
		float minFloat = Float.MIN_VALUE;
		
		boolean minBoolean = false; // trudno jest powiedzieć
		boolean maxBoolean = true;
		
		char maxChar = 0xFFFF;
		char minChar = 0x0000;
		
		
		System.out.println(maxChar);
		System.out.println(minChar);
		
		
		char znak = 'a';
		int wartosc = 3;
		
		char wynik = (char)(znak + wartosc);
		char wynik2 = (char)(wartosc + znak);
		
		
	}
}