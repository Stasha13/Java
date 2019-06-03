class Results{
	int phy,che,mat;

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
class school{
	public static void main(String xyz[]){
		Results Peter,James;
		Peter= new Results();
		James= new Results();

		Peter.mat=50;
		Peter.che=100;
		Peter.phy=100;

		James.phy=50;
		James.che=40;
		James.mat=60;

	Peter.showresults();
	James.showresults();

	}
}