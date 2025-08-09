package com.wipro.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileDemo {
	public static void main(String[] args) {
		String Input = "E:\1-29.png";
		String Output = "E:\\copy.png";
		
		try (FileInputStream fi = new FileInputStream(Input);
			FileOutputStream fo = new FileOutputStream(Output);){
			int Data;
			while((Data = fi.read())!= -1) {
				fo.write(Data);
			}
			System.out.println("Image Copied");
		} catch (Exception e) {
			System.out.println("Error in copying : " + e.getMessage());
		}
		
		
	}
}
