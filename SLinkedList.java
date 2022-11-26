import java.util.Scanner;

public class SinglyLinkedList {
    class Node{
        int data;
        Node next;
        Node(int data){                     //constructor
            this.data=data;
        }

    }
    public Node head=null;
    public Node tail=null;
    public void addfront(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    public void addback(int data){
        
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
            
        }

    }
    public void display(){
        if(head==null){
            System.out.println("Empty");
            return;
        }
        Node temp=head;
        System.out.println("-------------------------------------------------------------------------------------");
        while(temp!=null){
            
            System.out.print("\t "+temp.data);
            
            
            temp=temp.next;
        }System.out.println("\n");
        System.out.println("-------------------------------------------------------------------------------------");
    }
    public void delete(int data){
        Node temp=head;
        Node prev=null;
        if(temp!=null && temp.data==data){
            head=temp.next;
            return;
        }
        while(temp!=null && temp.data!=data){
            prev=temp;
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Element not found");
        }
        else if(temp==tail){
            tail=prev;
            tail.next=null;
        }
        else{
            prev.next=temp.next;
        }
    } 
    public static void main(String arg[]) {
        
        SinglyLinkedList list=new SinglyLinkedList();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elemtnts to be added");
        int n=sc.nextInt();
        outloop:
        while(true){
            System.out.println(" 1 For adding at front \n 2 For adding at back \n 3 For delete by value \n 4 for display");
            int ch=sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter the Elemtnt");
                    int data=sc.nextInt();
                    list.addfront(data);
                    break;
                case 2:
                    System.out.println("Enter the Elemtnt");
                    data=sc.nextInt();
                    list.addback(data);
                    break;
                case 3:
                    System.out.println("Enter the value to be deleted");
                    data=sc.nextInt();
                    list.delete(data);
                    break;
                case 4:
                    System.out.println("Elemtns are ");
                    list.display();
                    break;
                default:
                    System.out.println("Wrong Choice");
                    break outloop;
            }

        }
        
        
    }
    


    
}
