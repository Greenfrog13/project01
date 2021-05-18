class FloatToBinEx{
	public static void main(String args[]){
		float f = 9.1234567f;
		int i = Float.floatToIntBits(f);
		
		System.out.println("%f\n", f);
		System.out.println("%x\n", i); //16진수로 출력
	} // main의 끝 
}
