abstract class calculations{
	abstract public void tax(int salary);
	public void msg(){
		tax (x);
		System.out.println("Hello my friend");
	}
}
class calculations2 extends calculations{
	public void tax(int salary){
	float result;
	result=salary*21/100;
	System.out.println(result);
	}
}