package S1028GUI;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.*;

public class T08CardLayout extends JFrame{
	public T08CardLayout(){
		super.setBounds(100,100,800,600);
		this.setBackground(Color.gray);
		this.setTitle("��Ƭ����");
		CardLayout card=new CardLayout();
		this.setLayout(card);
		this.getContentPane().add(new JLabel("��ǩ1",JLabel.CENTER),"first");
		this.getContentPane().add(new JLabel("��ǩ2",JLabel.CENTER),"second");
		this.getContentPane().add(new JLabel("��ǩ3",JLabel.CENTER),"third");
		this.getContentPane().add(new JLabel("��ǩ4",JLabel.CENTER),"fourth");
		this.getContentPane().add(new JLabel("��ǩ5",JLabel.CENTER),"fifth");
		this.pack();
		this.setVisible(true);
		card.show(super.getContentPane(), "second");
	}
	public static void main(String[] args) {
		new T08CardLayout();

	}

}
