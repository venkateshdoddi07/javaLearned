package com.codegnan.java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class IPFinder {
   public static void main(String []args) throws IOException {
//       try {
//           InetAddress address = InetAddress.getLocalHost();
//           System.out.println("IP Address: " + address.getHostAddress());
//       } catch (UnknownHostException e) {
//           e.printStackTrace();
//       }
       
       
       
       
       
       String name;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter host name : ");
		name = br.readLine();
		try {
			InetAddress addr = InetAddress.getByName(name);
			System.out.println("IP of the host : " + addr);
		} catch (UnknownHostException e) {
			System.out.println("Exception : " + e);
		}

		
   }
}
