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
		this.add(new JButton("��"),BorderLayout.EAST);
		this.add(new JButton("��"),BorderLayout.WEST);
		this.add(new JButton("��"),BorderLayout.SOUTH);
		this.add(new JButton("��"),BorderLayout.NORTH);
		this.add(new JButton("��"),BorderLayout.CENTER);
		JPanel jp=new JPanel();//���Ҳ��һ������
		jp.setLayout(new FlowLayout(FlowLayout.LEFT,3,3));
		jp.setBackground(Color.gray);
		for(int i=0;i<6;i++){
			jp.add(new JButton("��ť_"+i));
			getContentPane().add(jp,BorderLayout.CENTER);//��������������ⲿ��������
		}
		jp.setVisible(true);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new T06BorderLayout();
	}

}
