package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TryWithOutResource {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos  = null;
		try {
			fis = new FileInputStream("C:\\Users\\91990\\Desktop\\Innoserv Online Training\\Java New Training Notes\\fullstacktrainingforzensar\\Java Programs\\Demo.java");
			fos = new FileOutputStream("xyz.txt");
			int ch;
			while((ch=fis.read()) != -1) {
				fos.write(ch);
			}	
		} catch (Exception e) {
			System.err.println(e);
		}finally {
			try {
			fis.close();
			fos.close();
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
