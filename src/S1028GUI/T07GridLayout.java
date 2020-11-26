package S1028GUI;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

public class T07GridLayout extends JFrame {
	public T07GridLayout() {
		super.setBounds(200, 200, 400, 300);
		this.setLayout(new GridLayout(3, 4));
		this.setBackground(Color.gray);
		for (int i = 0; i < 12; i++) {
			this.add(new JButton("°´Å¥_" + (i+1)));
		}
		this.pack();
		this.setVisible(true);

	}
	public static void main(String[] args) {
		new T07GridLayout();
	}
}
