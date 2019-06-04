class maths{
	public void addition (int A,int B){
		int Result;
		Result=A+B;
		System.out.println("The result: "+ Result);
	}

	public int subtraction (int A, int B){
		int answer;
		answer=A-B;
		return answer;
	}
}
class test3{
	public static void main(String xyz[]){
		maths x;
		x= new maths();
		x.addition(2,10);
		System.out.println
		("Result is: "+x.subtraction(100,5));
	}
}