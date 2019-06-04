class Results{

private int phy,che,mat;
public void physics(int P){
	if (P>=0 && P<=150){
		phy=P;
	}
	else{
		System.out.println("Invalid Physics mark");
	}
}
public void chemistry(int C){
	if(C>=0 && C<=150){
		che=C;
	}
	else{
		System.out.println("Invalid Chemistry mark");
	}
}
public void maths(int M){
	if(M>=0 && M<=150){
		mat=M;
	}
	else{
		System.out.println("Invalid Maths mark");
	}
}
public void showresults(){
		int total;
		total=phy+che+mat;
		System.out.println("Total score: "+total);

		if (total>300){
			System.out.println("Passed! =D");
		}
		else {
			System.out.println("Failed :(");
		}
}
}
class school2{
	public static void main(String xyz[]){
		Results Peter,James;
		Peter = new Results();

		Peter.physics(50);
		Peter.chemistry(100);
		Peter.maths(90);

 		Peter.showresults();
	}
}
