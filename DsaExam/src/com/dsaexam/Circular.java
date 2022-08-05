package com.dsaexam;

import java.util.Scanner;

class CircularLink
{
	
	static class Node
   {
	   int data;
	   Node next;
	   
	   public Node(int data)
	   {
		 this.data=data;
		 next=null;
	   }   
   }
   
   Node head=null;
   Node tail=null;
   public void LLCreation()
   {
	   int data,a;
	   Scanner Sc=new Scanner(System.in);
	   
	   System.out.println("Enter data element");
	   data=Sc.nextInt();
	   
	   Node NEW_nd= new Node(data);
	   
	   if(head==null)
	   {
		head=NEW_nd;  
		tail=head;
		
	   }
	   else
	   {
		   NEW_nd.next=head;
		   head=NEW_nd;
		   tail.next=head;
		   
	   }
	   
   }
   
   
   public void printLL()
   {
	   Node temp=head;
	   if(head==null)
	   {
		   System.out.println("LINKED LIST NOT FOUND...!!!");
	   }
	   else
	   {
		   do
		   {
			   System.out.println("\n "+temp.data );
			   temp=temp.next;
		   }while(temp!=head);
	   }
   }
   
   public void deleteLL()
   {
	   Node D=head;
	   D=D.next;
	   head=D;
	   tail.next=head;
   }
}

class Circular{
   public static void main(String args[])
   {
	   int choice=0;
	   CircularLink C=new CircularLink();
 do {
	   Scanner Sc=new Scanner(System.in);
	   System.out.println("CHOOSE OPTION :");
	   System.out.println("1. Create/add Node ");
	   System.out.println("2. Display linked list ");
	   System.out.println("3. Delete Node");
	   System.out.println("4. try again");
	   System.out.println("5. Exit");
	   choice=Sc.nextInt();
	   
	   switch(choice)
	   {
	   case 1:
	   {
		   C.LLCreation();
		   break;
	   }
	   case 2:
	   {
		   C.printLL();
		   break;
	   }
	   case 3:
	   {   
		   C.deleteLL();
		   break;
	   }
	   case 4:
	   {
		   System.out.println("try again");
		   break;
	   }
	   
	   }
	   
   }while(choice!=5);
   }
}
