package com.itheima.job_day10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo2 {
	/*(�Լ����뷨:)
	 * ʵ��:����Ŀ��Ŀ¼�����ַ�����ȡͼƬ,���������̨
	 * ����:�ַ����޷�ֱ�Ӷ�ȡͼƬ,��Ƶ�ȶ������ļ�,��������Ҫ�õ�ת����
	 * ���:ʧ��--ԭ��:�ַ�ת����ʼ�����ַ����޷����ͼƬ,(�ᶪʧ��Ϣ)
	 * */
	public static void main(String[] args) throws IOException {
		//��:ʹ�ø�Ч��
		BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("liuyan.jpg")));
		//д:ʹ�ø�Ч��
		//BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("G:\\temp\\l.jpg")));
		String line;
		while((line=br.readLine())!=null){
			bw.write(line);
			bw.flush();
		}
		//�ͷ���Դ
		br.close();
		bw.close();
	}
}
