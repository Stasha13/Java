/*using this. to tell the the method which variable
to use*/
class math{
	int a;
	public void message(){
		int a;
		a=20;
		this.a=15;
		System.out.println("Result: "+a);
	}
	public void message2(){
		this.a=0;
		System.out.println(a);
	}
}
	class math46{
		public static void main(String xyz[]){
	math x = new math();
	math y = new math();
	x.a=25;
	y.a=15;
	x.message2();
	x.message();
	}
}