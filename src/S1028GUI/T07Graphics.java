package S1028GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.*;

import javax.swing.*;

//����Ļ��ʶ���
class TGraphics extends JFrame{
	
	public void paint(Graphics g){

		//1. ����ֱ��
		g.setColor(Color. RED );//���û�����ɫ
		g.setFont(new Font("����",Font. BOLD ,20));
		g.drawLine(20, 20, 200, 200); //����ֱ��
		g.drawString("���", 100, 100); //�����ı�����
		g.drawOval(200, 200, 200, 140); //������Բ
		ImageIcon icon=new ImageIcon("images/01.png");
		Image img=icon.getImage();//ʵ����
		g.drawImage(img, 100, 100,  null); //����ͼ��
		g.fillRect(120,50,60,30);//����������
		g.fillRoundRect(180,100,80,80,20,20);//�������Բ�Ǿ���
		g.fillOval(10,100,80,30); //���������Բ
		g.drawRect(50,50,60,30); //���ƾ���
		g.drawRoundRect(50,100,80,80,20,20);//����Բ�Ǿ���
		}
		private void setColor(Color red) {
		// TODO Auto-generated method stub
		
	}
		public TGraphics(){
		this.setBounds(10, 10, 600, 500); //���ô��ڵĴ�С
		this.getContentPane().setBackground(Color. WHITE );//���ô��ڵı���
		this.setVisible( true);//���ô����ǿɼ���
		}
		}
		public  class T07Graphics {
		public  static void main(String[] args) {
			TGraphics h= new TGraphics();
		}
		}