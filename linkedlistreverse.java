import java.util.*;
class node
{
    int data;
    node next;
    
    node(int data)
    {
        this.data = data;
        this.next = null;
    }
    
}
class linkedlist
{
    node head;
    linkedlist()
    {
         head = null;
    }
    
    void create()
    {
        Scanner sc =new Scanner(System.in);
        do
        {
             
             System.out.println("Enter the data");
             int data = sc.nextInt();
             if(data == 00)
             {
                break;
             }
             node newnode = new node(data);
             node temp;
             if(head == null )
             {
                 head = newnode;
             }
             else
             {
                 for(temp = head;temp.next != null;temp = temp.next)
                 {
                     
                 }
                 temp.next = newnode;
             }
        }
        while(true);
    }
    void show()
    {
        node temp;
        for(temp = head;temp != null;temp = temp.next)
        {
            System.out.println(temp.data);
                     
        }
    }
    void reverse(node temp)
    {
        if(temp !=null)
        {
            reverse(temp.next);
            System.out.println(temp.data);
        }
    }
    }
}
class reverselist
{
    public static void main(String args[])
    {
        linkedlist l = new linkedlist();
        l.create();
        l.show();
        l.reverse(head);
        l.show();
    }
}