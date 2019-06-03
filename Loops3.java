class Loops3{
	public static void main(String xyz[]){
		int A,B,C;

	A=1;
	B=10;
	C=100;

	for( ;A<=1 && B<=10 && C<=500;){
		System.out.println(A+"-"+B+"-"+C);
		A++;
		B+=10;
		C+=100;
	}
	}
}