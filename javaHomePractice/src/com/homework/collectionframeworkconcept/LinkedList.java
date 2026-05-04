package com.homework.collectionframeworkconcept;

import java.util.Scanner;

class Node{
	int id;
	int quantity;
	Node next;
	Node(int id,int quantity){
		this.id=id;
		this.quantity=quantity;
		this.next=null;
		
	}
}

public class LinkedList {
	
	static Node updateStock(Node head,int targetId, int newQuantity) {
		if(targetId<=0) return head;
		if(newQuantity>10000) {
			newQuantity=10000;
		}
		if(head==null) {
			return new Node(targetId,newQuantity);
		}
		Node current=head;
		Node prev=null;
		
		while(current !=null) {
			if(current.id==targetId) {
				current.quantity=newQuantity;
				return head;
			}
			prev=current;
			current=current.next;
		}
		prev.next=new Node(targetId,newQuantity);
		return head;
		
	}
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		Node head=null;
		Node tail=null;
		for(int i=0;i<n;i++) {
			int id=scn.nextInt();
			int qty=scn.nextInt();
			Node newNode=new Node(id,qty);
			if(head==null) {
				head=newNode;
				tail=newNode;
				
			}else {
				tail.next=newNode;
				tail=newNode;
			}
		}
		int targetId=scn.nextInt();
		int newQuantity=scn.nextInt();
		head=updateStock(head,targetId,new)
	}

}
