class absenteeexception extends exception{
}

class accountsNBS{
	public float tax (int salary, int absentees) 
	throws absenteeexception{
		float t;
	if (absentees>=7){
		absenteeexception e= new absenteeexception();
		throw e;
	}
	else{
		t=salary*21/100;
	}
	return t;
	}
}
class accountslip{
	public static void main(String args[]){
		accountsNBS x=new accountsNBS();
		try{
			float netsalary=2000-x.tax(2000,7);
		}
		catch(absenteeexception e){
			System.out.println("Sorry too much sickness");
		}
	}
}
class accountsit{
	public void salaryslip() throws absenteeexception;
	accountsNBS x=new accountsNBS();
	float netsalary=2000-x.tax(2000,7);
}