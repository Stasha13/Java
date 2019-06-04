class college{
	private int phy,che,total;float per;
	private void calculations(){
		total=phy+che;
		per=total*100/300;
	}

	public void physics(int p){
		if(p>=0 && p<=150){
			phy=p;
		}
		else{
			phy=-1;
			System.out.println("Invalid Physics mark");
		}
	}
	public void chemistry(int c){
		if(c>=0 && c<=150){
			che=c;
		}
		else{
			che=-1;
			System.out.println("Invalid Chemistry mark");
		}
	}
	public void showresults(){
		if (che==-1||phy==-1){
			System.out.println("No results");
		}
		else{
			calculations();
			System.out.println("Total marks: "+total);
			System.out.println("Percentage: "+per);
		}
	}
}
	class test3{
		public static void main(String xyz[]){

		college abc;
		abc = new college();
		abc.physics(7000);
		abc.chemistry(80);
		abc.showresults();
	}
}
