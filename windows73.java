import java.awt.*;
class windows73{
	public static void main(String args[]){
		Frame win= new Frame();
		Button B1= new Button("Click 1");
		Button B2= new Button("Click 2");
		Button B3= new Button("Click 3");
		Button B4= new Button("Click 4");
		Button B5= new Button("Click 5");
		win.add(B1,BorderLayout.NORTH);
		win.add(B2,BorderLayout.EAST);
		win.add(B3,BorderLayout.SOUTH);
		win.add(B4,BorderLayout.WEST);
		win.add(B5,BorderLayout.CENTER);
		win.setSize(500,400);
		win.setVisible(true);
	}
}