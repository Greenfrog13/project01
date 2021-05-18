class CharToCode{
	public static void main(String[] args){
		char ch = 'A';
		int code = (int)ch;
		
		System.out.println("%c=%d(%x#) \n", ch, code, code);
		
		char hch = '가';
		System.out.println("%c=%d(%#X) \n", hch, (int)hch, (int)hch);
	}
}
