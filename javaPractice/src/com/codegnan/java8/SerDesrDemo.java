package com.codegnan.java8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerDesrDemo {

	public static void main(String[] args) {
		System.out.println("====Serialization has started================");
		
		
		String filepath="emp.ser";
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try {
			 fos=new FileOutputStream(filepath);
			 oos=new ObjectOutputStream(fos);
			Student s=new Student(101,"venk","ven@email.com","venky123");
			System.out.println("Before  Serialization student details");
			s.displayStudentDetails();
			oos.writeObject(s);
			System.out.println("serialised studentobject :"+s);
			System.out.println("==========Serialization ended====================");
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
			oos.close();
			fos.close();
			}catch(IOException e){
				e.printStackTrace();
				
			}
		}
		
		
		
		
		System.out.println("==========de serialiazion started==============");
		try(FileInputStream fis=new FileInputStream(filepath);
				ObjectInputStream ois=new ObjectInputStream(fis) ){
					Student s2=(Student)ois.readObject();
					System.out.println("Studnet details afetr deserialization ");
					s2.displayStudentDetails();
					System.out.println("de-serialization object: "+s2);
				}catch(IOException |ClassNotFoundException e) {
					e.printStackTrace();
				}
		
	}

}
