package S1028GUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class T05AWT {

	public static void main(String[] args) {
		JFrame jf=new JFrame("jframe");
		jf.setBounds(10, 10, 1000, 500);
		jf.setBackground(Color.gray);
		
		jf.setLayout(new FlowLayout(3,3,5));
		
		JLabel jl1=new JLabel("�û���");
		jf.add(jl1);
		final JTextField jtf=new JTextField("�û���");
		jf.add(jtf);
		
		JLabel jl2=new JLabel("����");
		jf.add(jl2);
		final JPasswordField jpf=new JPasswordField("����");
		jf.add(jpf);
		
		JButton jb=new JButton("��¼");
		jf.add(jb);
		
		final JLabel jtinfo=new JLabel("��¼��Ϣ");
		jf.add(jtinfo);
		jb.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				String uname=jtf.getText(); //�û���
				String upass=jpf.getText(); //����
				if("yang".equals(uname)&&"123".equals(upass)){
					jtinfo.setText("��ϲ�㣬��¼�ɹ�!");
					System.out.println("��¼�ɹ�");
				} else{
					jtinfo.setText("�Բ������¼ʧ��!");
					System.out.println("��¼ʧ��");
				}		
			}
		});		
		jf.show();

	}
}
