class accounts{
	public void tax(){
		System.out.println("Tax rate is"+22.7);
	}
	public void tax(int salary){
		float t;
		t=salary*22.7f/100;
		System.out.println("Your tax is:"+t);
	}
	public void tax(int salary,float tax_rate){
		float t;
		t=salary*tax_rate/100;
		System.out.println("Your tax is:"+t);
	}
}
class accountstest{
	public static void main(String xyz[]){
		accounts ref=new accounts();
		ref.tax();
		ref.tax(1345);
		ref.tax(2000,19);
	}
}