package S1028GUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class T02JLable {

	public static void main(String[] args) {
		//������������
		JFrame jf=new JFrame("����");
		jf.setBounds(100, 100, 600, 1000);
		jf.setTitle("JLable");
		jf.getContentPane().setBackground(Color.RED);
	
		//���ñ�ǩ����
		JLabel jl=new JLabel();
		jl.setText("������");
		jf.add(jl);//����ǩ���������
		//���ñ�ǩͼƬ�����빹�췽����
		Icon i=new ImageIcon("C:\\Users\\admin\\Pictures\\Camera Roll\\preview (2).jpg");
		JLabel jl1=new JLabel("ͼƬ", i, JLabel.RIGHT);
		jl1.setSize(100, 200);
		jf.add(jl1);
		
		JLabel jl2=new JLabel("�����ʽ");
		jf.add(jl2);
		Font f=new Font("font", Font.BOLD+Font.ITALIC+Font.LAYOUT_LEFT_TO_RIGHT, 54);
		jl2.setFont(f);
		jf.show();
	}

}
