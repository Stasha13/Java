//counting the number of words in a string
class stringprocessing{
	public void wordcount(String msg){
		int word=1;
		int i=0;
		while(i<msg.length()){
			if(msg.substring(i,i+1).equals(" ")){
				word++;
			}
			i++;
		}
		System.out.println(word);
	}
	public static void main(String xyz[]){
		stringprocessing s = new stringprocessing();
		s.wordcount("Is it the weekend yet");
	}
}
