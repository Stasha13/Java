class digitstowords{
	private String ones(int num){
		String word = "";
		switch(num){
			case 1: word = ("One ");break;
			case 2: word = ("Two ");break;
			case 3: word = ("Three ");break;
			case 4: word = ("Four ");break;
			case 5: word = ("Five ");break;
			case 6: word = ("Six ");break;
			case 7: word = ("Seven ");break;
			case 8: word = ("Eight ");break;
			case 9: word = ("Nine ");break;
			case 10: word = ("Ten ");break;
			case 11: word = ("Eleve ");break;
			case 12: word = ("Twelve ");break;
			case 13: word = ("Thirteen ");break;
			case 14: word = ("Fourteen ");break;
			case 15: word = ("Fifteen ");break;
			case 16: word = ("Sixteen ");break;
			case 17: word = ("Seventeen ");break;
			case 18: word = ("Eighteen ");break;
			case 19: word = ("Ninteen ");break;
		}
		return word;
	}
	private String tens(int num){
		String word="";
		switch(num){
			case 20: word = ("Twenty ");break;
			case 30: word = ("Thirty ");break;
			case 40: word = ("Fourty ");break;
			case 50: word = ("Fifty ");break;
			case 60: word = ("Sixty ");break;
			case 70: word = ("Seventy ");break;
			case 80: word = ("Eighty ");break;
			case 90: word = ("Ninty ");break;
		}
		return word;
	}
	public String convert(int num){
		String answer="";
		if (num>=1000 && num<=9999){
			answer = ones(num/1000) + "Thousand ";
			num = num%1000;
		}
		if (num>=100 && num<1000){
			answer += ones(num/100) + "Hundred and ";
			num = num%100;
		}
		if (num>=20 && num<100){
			answer += tens((num/10)*10);
			num = num%10;
		}
		if (num>=1 && num<20){
			answer += ones(num);
		}
		//System.out.println(answer);
		return answer;
	}
}

class print{
	public static void main(String xyz[]){
		digitstowords c= new digitstowords();
		System.out.println(c.convert(6201));
	}	
}
