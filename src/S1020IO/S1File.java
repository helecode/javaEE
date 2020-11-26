package S1020IO;

import java.io.File;
import java.io.IOException;

public class S1File {
	public static void main(String[] args) throws IOException {
		File file=new File("E:\\乱七八糟");
		File file2=new File("E:/乱七八糟/乱七八糟1");
		File file3=new File("E:/乱七八糟/sss");
		file3.mkdir();
		if(file.exists()&& file.isDirectory()){
			System.out.println("文件存在且是目录");
			System.out.println("文件名："+file.getName());
			System.out.println("文件相对路径："+file.getPath());
			System.out.println("文件绝对路径："+file.getAbsolutePath());
			System.out.println("文件长度："+file.length());
			System.out.println("文件最后一次被修改时间："+file.lastModified());
			System.out.println("文件路径分隔符："+file.separator);
		}else{
			System.out.println("文件不存在");
			if(file.createNewFile()){
				System.out.println("创建文件成功");
			}
		}
		File f[]=file.listFiles();
		for(File f1:f){//遍历该文件下所有文件
			System.out.print(f1.getName()+"\t");
		}
		
		
		
	}
}
