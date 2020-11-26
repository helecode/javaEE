package S1028GUI;

import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class T03Jbutton {
	public static void main(String[] args) {
		JFrame jf=new JFrame();
		jf.setBounds(100, 100, 200, 300);
		jf.setBackground(Color.GREEN);
		
	//∆’Õ®∞¥≈•
		
		JButton jb1=new JButton("jbutton");
		jb1.setBackground(Color.RED);
		jb1.setSize(100, 20);
		jf.add(jb1);
	//Õº∆¨∞¥≈•
		Icon i=new ImageIcon("C:\\Users\\admin\\Pictures\\Camera Roll\\preview (2).jpg");
		JButton jb2=new JButton("Õº∆¨∞¥≈•",i);
		jb2.setBounds(120, 120, 100, 50);
		jf.add(jb2);
		jf.show();
		
		
	}
}
