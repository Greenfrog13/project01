class CastingEx2{
	public static void main(String[] args){
		int i=10;
		byte b = (byte)i;
		System.out.println("[int -> byte] i=%d -> b=%d\n", i, b);
		
		i = 300;
		b = (byte)i;
		System.out.println("[int -> byte] i=%d -> b=%d\n", i, b);
		
		b = 10;
		i = (int)b;
		System.out.println("[byte -> int] b=%d -> i=%d\n", b, i);
		
		b = -2;
		i = (int)b;
		System.out.println("[byte -> int] b=%d -> i=%d\n", b, i);
		
		System.out.println("i=" + Integer.toBinaryString(i));
	}
}
