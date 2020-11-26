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
		//容器属性设置
		JFrame jf=new JFrame("窗口");
		jf.setBounds(100, 100, 600, 1000);
		jf.setTitle("JLable");
		jf.getContentPane().setBackground(Color.RED);
	
		//设置标签属性
		JLabel jl=new JLabel();
		jl.setText("姓名：");
		jf.add(jl);//将标签加入组件中
		//设置标签图片并放入构造方法中
		Icon i=new ImageIcon("C:\\Users\\admin\\Pictures\\Camera Roll\\preview (2).jpg");
		JLabel jl1=new JLabel("图片", i, JLabel.RIGHT);
		jl1.setSize(100, 200);
		jf.add(jl1);
		
		JLabel jl2=new JLabel("多个样式");
		jf.add(jl2);
		Font f=new Font("font", Font.BOLD+Font.ITALIC+Font.LAYOUT_LEFT_TO_RIGHT, 54);
		jl2.setFont(f);
		jf.show();
	}

}
