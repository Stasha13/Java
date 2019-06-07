class exceptions2{
	public static void main(String data[]){
		int first,second,result;
		first=second=result=0;

	try{
		first=Integer.parseInt(data[0]);
		second=Integer.parseInt(data[1]);
		result=first/second;
	System.out.println("Result: "+result);
	}
	catch(NumberFormatException e){
		System.out.println("Digits only please");
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Not enough values");
	}
	catch(ArithmeticException e){
		System.out.println("Cannot divide by zero");
	}
	System.out.println("Bye");
	}
}