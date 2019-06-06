//printing each word on a new line
class newline{
	public void wordcount(String msg){
		String word="";
		int i=0;
		msg=msg+" ";
		while(i<msg.length()){
			if(msg.substring(i,i+1).equals(" ")){
				System.out.println(word);
				word="";
			}
			else{
				word+=msg.substring(i,i+1);
			}
			i++;
		}
	}
	public static void main(String xyz[]){
		newline s = new newline();
		s.wordcount("Is it the weekend yet");
	}
}
