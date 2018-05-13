package com.itheima.job_day09;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo4 {
	/*把一个目录下的所有文件(包括子目录)复制到另一个目录
	 * 注:目录就是文件夹
	 * */
	public static void main(String[] args) throws IOException {
		File src=new File("D:\\develop\\temp\\workspace_javajob");//源路径
		File dest=new File("G:\\temp");// 目标路径
		copyDir(src,dest);
	}

	private static void copyDir(File src, File dest) throws IOException {
		if(src.isDirectory()&&dest.isDirectory()){//传入两个file的都是文件夹
			//先在目标文件夹下创建一个跟源路径src同名的文件夹
			File newDir=new File(dest,src.getName());//newDir=G:temp\temp\workspace_javajob
			if(!newDir.exists()){//在dest中创建与src同名文件夹
				newDir.mkdir();
			}
			File[] files=src.listFiles();//取到源目录下的所有文件和文件夹
			for (File file : files) {//遍历,取到每个文件和文件夹
				if(file.isFile()){//如果是文件,直接复制到目标目录下的相应位置
					//创建输入输出流
					FileInputStream fis=new FileInputStream(file);//file=D:\\develop\\Java\\eclipse\\workspace_javajob\\.metadata
					FileOutputStream fos=new FileOutputStream(new File(newDir,file.getName()));//file.getName()=.metadata
					
					//一次读取一个字节数组
					int len;
					byte[] bys=new byte[1024];
					while((len=fis.read(bys))!=-1){
						fos.write(bys,0,len);
					}
					
					//释放资源
					fis.close();
					fos.close();
					
				}else if(file.isDirectory()){//如果文件夹,递归复制
					copyDir(file,newDir);//file=.metadata,newDir=G:\\temp\\workspace_javajob
				}
			}
		}
	}
}
