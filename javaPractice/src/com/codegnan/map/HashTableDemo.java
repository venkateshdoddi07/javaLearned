package com.codegnan.map;

import java.util.Hashtable;

public class HashTableDemo {
	public static void main(String[] args) {

		Hashtable<Temp, String> h = new Hashtable<>();
		h.put(new Temp(5),"A");
		h.put(new Temp(6),"B");

		h.put(new Temp(15),"C");

		h.put(new Temp(23),"D");

		h.put(new Temp(16),"E");
		
		System.out.println(h);

		

	}

}
class Temp{
	int i;
	Temp(int i){
		this.i=i;
	}
	public int hashCode() {
		return i;
	}
	public String toString() {
		return i+" ";
	}
}