package S1028GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;

import javax.swing.JFrame;

public class T01Frame {
public static void main(String[] args) {
	Frame f=new Frame("����");
	f.setSize(300, 200);
	f.setLocation(100, 100);
	f.setBackground(Color.BLUE);
	f.show();
	
	JFrame jf=new JFrame();
	jf.setTitle("JFrame--jf");
	jf.setSize(300, 250);//���ô��ڴ�С
	jf.setLocation(500, 200);//���ô���λ��
	jf.getContentPane().setBackground(Color.BLUE);//���ô�����ɫ
	jf.show();
	
	jf.setBounds(400, 300, 120, 432);//ͬʱ���ô��ڴ�С��λ��
	
	//ͨ��Dimension���ô��ڴ�С
	Dimension d=new Dimension();
	d.setSize(400, 700);
	jf.setSize(d);
	//ͨ��Point������������
	Point p=new Point();
	p.setLocation(100, 200);
	f.setLocation(p);
	
	
	
	}
}
