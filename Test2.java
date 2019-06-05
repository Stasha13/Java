class Second{
	int phy,che;

	public void message(){
		System.out.println("Hello");
		System.out.println("My Friends");
	}
}

class Test2{
	public static void main(String xyz[]){
		Second Ref1;
		Ref1 = new Second();
		Ref1.phy=75;
		Ref1.message();
	}
}
