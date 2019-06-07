import java.awt.Button;
import java.awt.Frame;
class windows72{
	public static void main(String args[]){
		Frame win= new Frame();
		Button B1= new Button("Click 1");
		Button B2= new Button("Click 2");
		win.add(B1);
		win.add(B2);
		win.setSize(500,400);
		win.setVisible(true);
	}
}