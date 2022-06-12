public class SizeTypes{
	public static void main(String [] args){
		byte x=0;
		System.out.println(x);
		x=Byte.MIN_VALUE;
		System.out.println(x);
		x=Byte.MAX_VALUE;
		System.out.println(x);
		
		System.out.println("Size in bytes:" +(Byte.SIZE/8));
	}
}
