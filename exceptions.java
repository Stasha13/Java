class exceptions{
	public static void main(String xyz[]){
		int a,b,c;
		a=b=c=0;
		try{
			a=4;
			b=0;
			c=a/b;
			System.out.println("The result is: "+c);
		}
		catch(NumberFormatException exp1){
			System.out.println("Exception 1");
		}
		catch (ArithmeticException exp2){
			System.out.println("Exception 2");
		}
	}
}