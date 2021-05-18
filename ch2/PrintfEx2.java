class PrintfEx2{
	public static void main(String[] args){
		String url = "www.codechobo.com";
		
		float f1 = .10f;
		float f2 = 1e1f;
		float f3 = 3.14e3f;
		double d = 1.23456789;
		
		System.out.println("f1=%f, %e, %g\n", f1, f1, f1);
		System.out.println("f2=%f, %e, %g\n", f2, f2, f2);
		System.out.println("f3=%f, %e, %g\n", f3, f3, f3);
		
		System.out.println("d=%f\n", d);
		System.out.println("d=%14.10f\n", d); // 전체 14자리 중 소수점 10자리 
		
		System.out.println("[1234567890]%n");
		System.out.println("[%s]\n", url);
		System.out.println("[%20s]\n", url);
		System.out.println("[%-20s]\n", url); // 왼쪽 정렬 
		System.out.println("[%.8s]\n", url); // 왼쪽에서 8글자만 출력 
		
