package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TryWithResource {

	public static void main(String[] args) {
		try(
				FileInputStream fis = new FileInputStream("C:\\Users\\91990\\Desktop\\Innoserv Online Training\\Java New Training Notes\\fullstacktrainingforzensar\\Java Programs\\Demo.java");
				FileOutputStream fos = new FileOutputStream("xyz.txt");
				) 
		{
			int ch;
			while((ch=fis.read()) != -1) {
				fos.write(ch);
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.toString());
		}

	}

}
