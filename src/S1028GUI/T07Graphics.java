package S1028GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.*;

import javax.swing.*;

//抽象的画笔对象
class TGraphics extends JFrame{
	
	public void paint(Graphics g){

		//1. 绘制直线
		g.setColor(Color. RED );//设置画笔颜色
		g.setFont(new Font("黑体",Font. BOLD ,20));
		g.drawLine(20, 20, 200, 200); //绘制直线
		g.drawString("你好", 100, 100); //绘制文本内容
		g.drawOval(200, 200, 200, 140); //绘制椭圆
		ImageIcon icon=new ImageIcon("images/01.png");
		Image img=icon.getImage();//实例化
		g.drawImage(img, 100, 100,  null); //绘制图像
		g.fillRect(120,50,60,30);//绘制填充矩形
		g.fillRoundRect(180,100,80,80,20,20);//绘制填充圆角矩形
		g.fillOval(10,100,80,30); //绘制填充椭圆
		g.drawRect(50,50,60,30); //绘制矩形
		g.drawRoundRect(50,100,80,80,20,20);//绘制圆角矩形
		}
		private void setColor(Color red) {
		// TODO Auto-generated method stub
		
	}
		public TGraphics(){
		this.setBounds(10, 10, 600, 500); //设置窗口的大小
		this.getContentPane().setBackground(Color. WHITE );//设置窗口的背景
		this.setVisible( true);//设置窗口是可见的
		}
		}
		public  class T07Graphics {
		public  static void main(String[] args) {
			TGraphics h= new TGraphics();
		}
		}