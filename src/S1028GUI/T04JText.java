package S1028GUI;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class T04JText {
	public static void main(String[] args) {
		
		JFrame jf=new JFrame("�������");
		jf.setBounds(10,10, 400, 400);
		jf.setBackground(Color.CYAN);
		
		JTextField jtf=new JTextField("��ͨ�ı���");
		jtf.setEditable(true);
		jtf.setColumns(300);
		jtf.setLocation(300, 300);
		jf.add(jtf);
		
		JPasswordField jpf=new JPasswordField("����������");
		
		jpf.setSize(100, 60);
		jpf.setLocation(200, 200);
		jf.add(jpf);
		
		JTextArea jta=new JTextArea("�����ı���",10,10);
		jta.append("append");
		jf.add(jta);
		jta.setLocation(100,100);
		jf.show();
	}
}
