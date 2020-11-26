package S1028GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;

import javax.swing.JFrame;

public class T01Frame {
public static void main(String[] args) {
	Frame f=new Frame("窗口");
	f.setSize(300, 200);
	f.setLocation(100, 100);
	f.setBackground(Color.BLUE);
	f.show();
	
	JFrame jf=new JFrame();
	jf.setTitle("JFrame--jf");
	jf.setSize(300, 250);//设置窗口大小
	jf.setLocation(500, 200);//设置窗口位置
	jf.getContentPane().setBackground(Color.BLUE);//设置窗口颜色
	jf.show();
	
	jf.setBounds(400, 300, 120, 432);//同时设置窗口大小和位置
	
	//通过Dimension设置窗口大小
	Dimension d=new Dimension();
	d.setSize(400, 700);
	jf.setSize(d);
	//通过Point对象设置坐标
	Point p=new Point();
	p.setLocation(100, 200);
	f.setLocation(p);
	
	
	
	}
}
