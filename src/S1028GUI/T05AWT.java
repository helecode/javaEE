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
		
		JLabel jl1=new JLabel("用户名");
		jf.add(jl1);
		final JTextField jtf=new JTextField("用户名");
		jf.add(jtf);
		
		JLabel jl2=new JLabel("密码");
		jf.add(jl2);
		final JPasswordField jpf=new JPasswordField("密码");
		jf.add(jpf);
		
		JButton jb=new JButton("登录");
		jf.add(jb);
		
		final JLabel jtinfo=new JLabel("登录信息");
		jf.add(jtinfo);
		jb.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				String uname=jtf.getText(); //用户名
				String upass=jpf.getText(); //密码
				if("yang".equals(uname)&&"123".equals(upass)){
					jtinfo.setText("恭喜你，登录成功!");
					System.out.println("登录成功");
				} else{
					jtinfo.setText("对不起，你登录失败!");
					System.out.println("登录失败");
				}		
			}
		});		
		jf.show();

	}
}
