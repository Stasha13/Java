//printing each word on a new line
class reverse{
	public void wordcount(String msg){
		String word="";
		int i=msg.length()-1;
		//msg=msg+" ";

		while(i>=0){
			if(msg.substring(i,i+1).equals(" ")){
				System.out.println(word);
				word="";
			}
			else{
				word=msg.substring(i,i+1)+word;
			}
			i-=1;
		}
		System.out.println(word);
	}

	public static void main(String xyz[]){
		reverse s = new reverse();
		s.wordcount("Is it the weekend yet");
	}
}