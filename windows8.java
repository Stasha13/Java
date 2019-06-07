import java.awt.event.*;
import java.awt.*;
class windows8{
	public static void main(String args[]){
		Frame win= new Frame();
		Button B1= new Button("Click 1");
		Action1 e=new Action1();
		B1.addActionListener(e);
		win.add(B1,BorderLayout.NORTH);
		win.setSize(500,400);
		win.setVisible(true);
	}
}
class Action1 implements ActionListener{
	public void actionPerformed(ActionEvent x){
		System.out.println("Hello my friend");
	}
}