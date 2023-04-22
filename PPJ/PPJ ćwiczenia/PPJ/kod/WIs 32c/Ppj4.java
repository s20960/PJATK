public class Ppj4 {
	public static void main(String[] args) {
		byte minByte = (byte)0b10000000; // 0200 0x80
		byte maxByte = (byte)0b01111111; // 0177 0x7F


		short minShort = (short)0b1000000000000000; // 0100000 0x8000
		short maxShort = (short)0b0111111111111111; // 077777  0x7FFF
		
		/*
			
		*/

		char minChar = 0;
		char maxChar = 0xFFFF;
		
		float minFloat = Float.MIN_VALUE;
		float maxFloat = Float.MAX_VALUE;
		
		System.out.println(minByte);
		System.out.println(maxByte);
		
		System.out.println(minShort);
		System.out.println(maxShort);
		
		System.out.println(minChar);
		System.out.println(maxChar);
		
		System.out.println(minFloat);
		System.out.println(maxFloat);
		
		
		int x = 1;
		if (x >= 0) {
			System.out.println("Należy do A");
		}
		
		if (x <= 1) {
			System.out.println("Należy do B");
			
		}
		if (x >= 0 && x <= 1) {
			System.out.println("Należy do C");
		}
		
	}
}