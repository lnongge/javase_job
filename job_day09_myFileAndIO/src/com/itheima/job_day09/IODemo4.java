package com.itheima.job_day09;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo4 {
	/*��һ��Ŀ¼�µ������ļ�(������Ŀ¼)���Ƶ���һ��Ŀ¼
	 * ע:Ŀ¼�����ļ���
	 * */
	public static void main(String[] args) throws IOException {
		File src=new File("D:\\develop\\temp\\workspace_javajob");//Դ·��
		File dest=new File("G:\\temp");// Ŀ��·��
		copyDir(src,dest);
	}

	private static void copyDir(File src, File dest) throws IOException {
		if(src.isDirectory()&&dest.isDirectory()){//��������file�Ķ����ļ���
			//����Ŀ���ļ����´���һ����Դ·��srcͬ�����ļ���
			File newDir=new File(dest,src.getName());//newDir=G:temp\temp\workspace_javajob
			if(!newDir.exists()){//��dest�д�����srcͬ���ļ���
				newDir.mkdir();
			}
			File[] files=src.listFiles();//ȡ��ԴĿ¼�µ������ļ����ļ���
			for (File file : files) {//����,ȡ��ÿ���ļ����ļ���
				if(file.isFile()){//������ļ�,ֱ�Ӹ��Ƶ�Ŀ��Ŀ¼�µ���Ӧλ��
					//�������������
					FileInputStream fis=new FileInputStream(file);//file=D:\\develop\\Java\\eclipse\\workspace_javajob\\.metadata
					FileOutputStream fos=new FileOutputStream(new File(newDir,file.getName()));//file.getName()=.metadata
					
					//һ�ζ�ȡһ���ֽ�����
					int len;
					byte[] bys=new byte[1024];
					while((len=fis.read(bys))!=-1){
						fos.write(bys,0,len);
					}
					
					//�ͷ���Դ
					fis.close();
					fos.close();
					
				}else if(file.isDirectory()){//����ļ���,�ݹ鸴��
					copyDir(file,newDir);//file=.metadata,newDir=G:\\temp\\workspace_javajob
				}
			}
		}
	}
}
