package S1028GUI;

import java.awt.FlowLayout;

import javax.swing.*;

public class T05FlowLayout extends JFrame {
	public T05FlowLayout(){
		super.setBounds(10, 10, 800, 600);
		this.setLayout(new FlowLayout(FlowLayout.LEFT,3,4));
		for(int i=0;i<20;i++){
			this.add(new JButton("°´Å¥_"+(i+1)));
		}
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new T05FlowLayout();
	}
	
}
