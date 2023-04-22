public class zmienna{
	public static void main(String[] args){
		byte maxByte=0b01111111; //oktalnie 0177, 16kowo 0x7F binarnie 0b01111111
		byte minByte=(byte)0b10000; //oktalnie 0200, heksadecymalnie 0x80, binarnie 0b10000000
		System.out.println(maxByte);
		System.out.println(minByte);
		
		short maxShort=0b0111111111111111; //oktalnie 077777, 16kowo 0x7FFF
		short minShort=(short)0b1000000000000000; //oktalnie 0100000, 16kowo 0x8000
		System.out.println(maxShort);
		System.out.println(minShort);
		
		char maxChar=0xFFFF;
		char minChar=0;
		System.out.println(maxChar);
		System.out.println(minChar);
		
		float minFloat=Float.MIN_VALUE;
		float maxFloat=Float.MAX_VALUE;
		
		System.out.println(maxFloat);
		System.out.println(minFloat);
	}
	
}
	byte maxbyte=Byte.MAX_VALUE;
	byte minbyte=Byte.MIN_VALUE;
	System.out.println(maxbyte);
	System.out.println(minbyte);
	
	
	char maxchar=Char.MAX_VALUE;
	char minchar=Char.MIN_VALUE;
	System.out.println(maxchar);
	System.out.println(minchar);