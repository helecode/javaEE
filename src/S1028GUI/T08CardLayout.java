package S1028GUI;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.*;

public class T08CardLayout extends JFrame{
	public T08CardLayout(){
		super.setBounds(100,100,800,600);
		this.setBackground(Color.gray);
		this.setTitle("卡片布局");
		CardLayout card=new CardLayout();
		this.setLayout(card);
		this.getContentPane().add(new JLabel("标签1",JLabel.CENTER),"first");
		this.getContentPane().add(new JLabel("标签2",JLabel.CENTER),"second");
		this.getContentPane().add(new JLabel("标签3",JLabel.CENTER),"third");
		this.getContentPane().add(new JLabel("标签4",JLabel.CENTER),"fourth");
		this.getContentPane().add(new JLabel("标签5",JLabel.CENTER),"fifth");
		this.pack();
		this.setVisible(true);
		card.show(super.getContentPane(), "second");
	}
	public static void main(String[] args) {
		new T08CardLayout();

	}

}
