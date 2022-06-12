public class PrimitiveTypes{
	
	int i;
	short s;
	float f;
	byte by;
	long l;
	char c= '0';
	char c1= '\u0000';
	char c2= '\uFFFF';
	double d;
	
	public static void main(String [] args){
		
	PrimitiveTypes dt = new PrimitiveTypes();
	
	System.out.println("default value of int: " +dt.i);
	dt.i = Integer.MIN_VALUE;
	System.out.println("minimum value of int: " +dt.i);
	dt.i = Integer.MAX_VALUE;
	System.out.println("maximum value of int: " +dt.i);
	System.out.println("Size in bytes for int: " +(Integer.SIZE/8) +"bytes.");
	
	System.out.println("default value of short: " +dt.s);
	dt.s = Short.MIN_VALUE;
	System.out.println("minimum value of short: " +dt.s);
	dt.s = Short.MAX_VALUE;
	System.out.println("maximum value of short: " +dt.s);
	System.out.println("Size in bytes for short: "+ (Short.SIZE/8) +"bytes.");
	
	System.out.println("default value of float: " +dt.f);
	dt.f = Float.MIN_VALUE;
	System.out.println("minimum value of float: " +dt.f);
	dt.f = Float.MAX_VALUE;
	System.out.println("maximum value of float: " +dt.f);
	System.out.println("Size in bytes for float: " +(Float.SIZE/8) +"bytes.");
	
	System.out.println("default value of byte: " +dt.by);
	dt.by = Byte.MIN_VALUE;
	System.out.println("minimum value of byte: " +dt.by);
	dt.by = Byte.MAX_VALUE;
	System.out.println("maximum value of byte: " +dt.by);
	System.out.println("Size in bytes for byte: " +(Byte.SIZE/8) +"bytes.");
	
	System.out.println("default value of long: " +dt.l);
	dt.l = Long.MIN_VALUE;
	System.out.println("minimum value of long: " +dt.l);
	dt.l = Long.MAX_VALUE;
	System.out.println("maximum value of long: " +dt.l);
	System.out.println("Size in bytes for long: " +(Long.SIZE/8) +"bytes.");
	
	System.out.println("default value of char: " +dt.c);
	dt.c1 = Character.MIN_VALUE;
	System.out.println("minimum value of char: " +dt.c1);
	dt.c2 = Character.MAX_VALUE;
	System.out.println("maximum value of char: " +dt.c2);
	System.out.println("Size in bytes for char: " +(Character.SIZE/8) +"bytes.");
	
	System.out.println("default value of double: " +dt.d);
	dt.d = Double.MIN_VALUE;
	System.out.println("minimum value of double: " +dt.d);
	dt.d = Double.MAX_VALUE;
	System.out.println("maximum value of double: " +dt.d);
	System.out.println("Size in bytes for double: " +(Double.SIZE/8) +"bytes.");
	}
}
