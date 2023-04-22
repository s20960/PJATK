public class Ppj4 {
	public static void main(String[] args) {
		byte minByte = (byte)0b10000000; // 0200 0x80 
		byte maxByte = (byte)0b01111111; // 0177 0x7F
		
		short minShort = (short)0b1000000000000000; // 0100000 0x8000
		short maxShort = (short)0b0111111111111111; // 077777  0x7FFF
		
		char minChar = 0;
		char maxChar = 0xFFFF; // 0177777 65365
		
		float minFloat = Float.MIN_VALUE;
		
		System.out.println(minChar);
		System.out.println(maxChar);
		System.out.println(minFloat);
		int x = 48;
		if (x >= 0) {
			System.out.println("A");
		}
		if (x <= 1) {
			System.out.println("B");
		}
		if (x >= 0 && x <= 1) {
			System.out.println("C");
		}
		
	}
}