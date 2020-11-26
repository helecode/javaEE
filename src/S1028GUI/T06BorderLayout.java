package S1028GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class T06BorderLayout extends JFrame{
	public T06BorderLayout(){
		super.setBounds(10, 10, 800, 600);
		this.setLayout(new BorderLayout());
		this.add(new JButton("东"),BorderLayout.EAST);
		this.add(new JButton("西"),BorderLayout.WEST);
		this.add(new JButton("南"),BorderLayout.SOUTH);
		this.add(new JButton("北"),BorderLayout.NORTH);
		this.add(new JButton("中"),BorderLayout.CENTER);
		JPanel jp=new JPanel();//面板也是一个容器
		jp.setLayout(new FlowLayout(FlowLayout.LEFT,3,3));
		jp.setBackground(Color.gray);
		for(int i=0;i<6;i++){
			jp.add(new JButton("按钮_"+i));
			getContentPane().add(jp,BorderLayout.CENTER);//将面板容器加入外部大容器中
		}
		jp.setVisible(true);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new T06BorderLayout();
	}

}
