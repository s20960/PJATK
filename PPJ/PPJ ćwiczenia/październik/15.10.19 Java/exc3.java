public class exc3{
	public static void main(String[] args){
	
	
	byte binaryNumber=86;
	
	System.out.println(binaryNumber&0b00000001);
	System.out.println(binaryNumber&(0b00000001<<1));
	System.out.println(binaryNumber&(0b00000001<<2));
	System.out.println(binaryNumber&(0b00000001<<3));
	System.out.println(binaryNumber&(0b00000001<<4));
	System.out.println(binaryNumber&(0b00000001<<5));
	System.out.println(binaryNumber&(0b00000001<<6));
	System.out.println(binaryNumber&(0b00000001<<7));
	System.out.println(binaryNumber&(0b00000001<<8));
	
	
	}
	
}