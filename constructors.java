/* contructors - when multiple constructors, each one
will call their own parent*/
class second{
	public second(){
		System.out.println(7);
	}
}
class first extends second{
	public first(){
		System.out.println(6);
	}
}
class one extends first{
	public one(){
		System.out.println(1);
	}
}
class two extends one{
	public two(int a){
		System.out.println(2);
	}
	public two(){
		System.out.println(3);
	}
}
class constructors{
	public static void main(String xyz[]){
		two x=new two();
	}
}