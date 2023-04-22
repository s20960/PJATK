public class Ppj4 {
	public static void main(String[] args) {
		
		byte minByte = (byte)0b10000000; //0x80 0200
		byte maxByte = (byte)0b01111111; //0x7F 0177
		
		short minShort = (short)0b1000000000000000; //0x8000 0100000
		short maxShort = (short)0b0111111111111111; //0x7FFF 077777
		
		int minInt = 0x80000000;
		int maxInt = 0x7FFFFFFF;
		
		float maxFloat = Float.MAX_VALUE;
		float minFloat = Float.MIN_VALUE;
		
		char minChar = 0b0;
		char maxChar = 0xFFFF;
		
		System.out.println(minByte);
		System.out.println(maxByte);
		
		System.out.println(minShort);
		System.out.println(maxShort);
		
		System.out.println(maxFloat);
		System.out.println(minFloat);
		
		System.out.println(minChar);
		System.out.println(maxChar);
	}
}