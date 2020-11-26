package S1028GUI;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class T09AbsoluteLayout {

	public static void main(String[] args) {
		JFrame jf=new JFrame("绝对布局");
		jf.setLayout(null);
		jf.setBounds(100, 100, 800, 600);
		jf.setBackground(Color.gray);
		jf.setVisible(true);
		
		JLabel jl=new JLabel("标签",JLabel.RIGHT);
		jl.setBounds(200, 200, 200, 200);
		jl.setBackground(Color.RED);
		jf.getContentPane().add(jl);
		
	}

}
