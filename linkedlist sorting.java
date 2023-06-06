import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class LL
{
    Node Head;
    LL()
    {
        Head = null;
    }
    
    void addLast()
    {
        Scanner sc = new Scanner(System.in);
        
        do
        {
            System.out.println("Enter the data");
            int data = sc.nextInt();
            if (data == 00)
            break;
            Node nnode = new Node(data);
            Node temp;
        
           if(Head == null)
           {
               Head = nnode ;
               
            }
            else
            {
                for(temp = Head;temp.next != null;temp = temp.next)
               {
            
               }
               temp.next = nnode;
            
            }
        
        }
        while(true);
        }
    
    void show()
    {
        Node temp;
         if(Head == null)
        {
            System.out.println("Empty list");
        }
        
         for(temp = Head;temp != null;temp = temp.next)
        {
            System.out.println(temp.data);
        }
    }
    
    void sorting()
    {
        int val;
        Node temp,temp1;
        
        for(temp1 = Head;temp1.next != null;temp1 =temp1.next)
        {
            for(temp = Head;temp.next != null;temp =temp.next)
            {
                if(temp.data > temp .next.data)
                {
                   val = temp.data ;
                   temp.data = temp.next.data;
                   temp.next.data = val;
                }
                
            }
        }
        
    }
}

class main
{
    public static void main(String args[])
    {
        LL link = new LL();
        link.addLast();
        link.show();
        link.sorting();
        link.show();
       
    }
}
