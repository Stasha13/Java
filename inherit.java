class maths{
	public void addition(int a, int b){
		int result = a+b;
		System.out.println("Result: "+result);
	}
	public void subtraction(int a, int b){
		System.out.println(a-b);
	}
}

class maths2 extends maths{
	public void multiplication(int x, int y){
		System.out.println("Result: "+(x*y));
	}
	public void subtraction(int x,int y){
		System.out.println("Result: "+(x-y));
	}
}
class inherit{
	public static void main(String xyz[]){
		maths2 x= new maths2();
		x.addition(10,2);
	}
}