package S1028GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

public class T10WindowListener extends JFrame implements WindowListener, ActionListener {
	public T10WindowListener(){

		this.setBounds(200, 200, 800, 600);
		this.setBackground(Color.gray);
		
		JTextArea jt=new JTextArea("sssssss",3,4);
		this.add(jt);
		
		JLabel jl=new JLabel("��ǩ");
		this.add(jl);
		
		JButton jb=new JButton("��ť");
		this.add(jb);
		
		this.addWindowListener(this);
		jb.addActionListener(this);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new T10WindowListener();
	}
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void windowActivated(WindowEvent arg0) {
		System.out.println("���ڱ�Ϊ�����ʱ����");
		
	}
	public void windowClosed(WindowEvent arg0) {
		System.out.println("���ڹر�ʱ����");
		
	}
	public void windowClosing(WindowEvent arg0) {
		System.out.println("�������ڹر�ʱ����");
		
	}
	public void windowDeactivated(WindowEvent arg0) {
		System.out.println("���ڱ�Ϊ�������ʱ����");
		
	}
	public void windowDeiconified(WindowEvent arg0) {
		System.out.println("������С������������");
		
	}
	public void windowIconified(WindowEvent arg0) {
		System.out.println("������С������");
		
	}
	public void windowOpened(WindowEvent arg0) {
		System.out.println("���ڴ�ʱ����");
		
	}


}
