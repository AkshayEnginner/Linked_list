import java.util.*;
class Node
{
    String data;
    Node next;
    
    Node(String data)
    {
        this.data = data;
        this.next = null;
    }
}
class LL
{
    Node head;
    LL()
    {
        head = null;
    }
    void addLast()
    {
        Scanner sc = new Scanner(System.in);
        
        do
        {
            System.out.println("Enter the data");
            String data= sc.nextLine();
            if (data.equals("stop"))
            break;
            Node nnode = new Node(data);
             Node temp;
            if(head == null)
            {
                head = nnode;
            }
            else
            {
                 for(temp = head;temp.next!=null; temp=temp.next)
                 {
                
                 }
                 temp.next = nnode;
                
            }
           
        }
        while(true);
    }
    
    void addfirst()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the newdata to add at first");
        String newdata = sc.nextLine();
       Node nnode = new Node(newdata);
       if(head == null)
       {
          head = nnode;
          return;
       }
       else
       {
           nnode.next = head;
           head = nnode;
       }
     }
        void show()
        {
            Node temp;
           for(temp = head;temp!=null; temp=temp.next)
           {
               System.out.println(temp.data);
           }
        }
        
        
        void addafterdata()
        {
            Node temp;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the data " );
            String newdata = sc.nextLine();
            System.out.println("Enter data afterwhich to enter");
            String awf = sc.nextLine();
            
            Node nnode = new Node(newdata);
             //nnode = head;
            
            if(head == null)
            {
                head = nnode;
                return;
                
            }
            else
            {
            for(temp = head;temp.next!=null;temp=temp.next)
            {
                if(temp.data.equals(awf))
                {
                    nnode.next = temp.next;
                    temp.next = nnode;
                }
            }
            }
        }
        
        void delete()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the data to delete");
            String deldata = sc.nextLine();
            Node temp;
            for(temp = head;temp.next!=null;temp=temp.next)
            {
                if(temp.next.data.equals(deldata) )
                {
                    temp.next = temp.next.next;
                    break;
                }
            }
        }
}

class alllink
{
    public static void main(String args[])
    {
        LL link = new LL();
        link.addLast();
        link.addfirst();
        link.show();
        link.addafterdata();
        link.show();
        link.delete();
        link.show();
    }
}
    
