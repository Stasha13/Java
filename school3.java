class Results{

private int phy,che,mat;
public void physics(int P){
	if (P>=0 && P<=150){
		phy=P;
	}
	else{
		phy=-1;
		System.out.println("Invalid Physics mark");
	}
}
public void chemistry(int C){
	if(C>=0 && C<=150){
		che=C;
	}
	else{
		che=-1;
		System.out.println("Invalid Chemistry mark");
	}
}
public void maths(int M){
	if(M>=0 && M<=150){
		mat=M;
	}
	else{
		mat=-1;
		System.out.println("Invalid Maths mark");
	}
}
public void showresults(){
		int total;

		if (phy==-1||che==-1||mat==-1){
			System.out.println("No Results");
		}
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
class school3{
	public static void main(String xyz[]){
		Results Peter,James;
		Peter = new Results();

		System.out.println("Peter's results: ");
		Peter.physics(500);
		Peter.chemistry(100);
		Peter.maths(90);
 		Peter.showresults();
 		System.out.println(" ");

 		James = new Results();

		System.out.println("James' results: ");
		James.physics(45);
		James.chemistry(102);
		James.maths(99);
 		James.showresults();
	}
}
