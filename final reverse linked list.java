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
            String data = sc.nextLine();
            if (data.equals("stop"))
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
    
    void reverse(Node temp)
    {
        if(temp != null)
        {
            reverse(temp.next);
            System.out.println(temp.data);
            
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
        
        System.out.println("reverse is");
        link.reverse(link.Head);
    }
}
