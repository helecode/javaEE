package S1020IO;

import java.io.File;
import java.io.IOException;

public class S1File {
	public static void main(String[] args) throws IOException {
		File file=new File("E:\\���߰���");
		File file2=new File("E:/���߰���/���߰���1");
		File file3=new File("E:/���߰���/sss");
		file3.mkdir();
		if(file.exists()&& file.isDirectory()){
			System.out.println("�ļ���������Ŀ¼");
			System.out.println("�ļ�����"+file.getName());
			System.out.println("�ļ����·����"+file.getPath());
			System.out.println("�ļ�����·����"+file.getAbsolutePath());
			System.out.println("�ļ����ȣ�"+file.length());
			System.out.println("�ļ����һ�α��޸�ʱ�䣺"+file.lastModified());
			System.out.println("�ļ�·���ָ�����"+file.separator);
		}else{
			System.out.println("�ļ�������");
			if(file.createNewFile()){
				System.out.println("�����ļ��ɹ�");
			}
		}
		File f[]=file.listFiles();
		for(File f1:f){//�������ļ��������ļ�
			System.out.print(f1.getName()+"\t");
		}
		
		
		
	}
}
