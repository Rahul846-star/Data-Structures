
public class occurance { 
//-------by ashish------
  Node prev1;
	static Node head; 

	static class Node { 

		int data; 
		Node next, prev; 

		Node(int d) { 
			data = d; 
			next = prev = null; 
		} 
	} 

	void occurance(Node head)
	{ 
	    Node head1=head;
	    Node head2=head;
	    int count;
	    Node temp;
while(head1!=null)
{
    System.out.print(head1.data+" occurance is " );
      head2=head1.next;
      count=0;
      while(head2!=null)
      {
          if(head1.data==head2.data)
          {
              count++;
          }
          head2=head2.next;
      }
      System.out.println(count);
       head2=head1.next;
       while(head2!=null)
       {
           if(head1.data==head2.data)
           {
               if(head2.next==null)
               {
                   head2.prev.next=null;
               }
               else
           {
               head2.prev.next=head2.next;
               head2.next.prev=head2.prev;
           }
           }
           head2=head2.next;
       }
     
     head1=head1.next;
}

	} 

	void push(int data)
	{ 

	  Node k=new Node(data);
    
        if(head==null)
        {
            prev1=k;
            head=k;
        }
        else
        {
            prev1.next=k;
            k.prev=prev1;
            prev1=k;
        }
	} 
	void printList(Node node) 
	{ 
		while (node != null) { 
			System.out.println(node.data + " "); 
			node = node.next; 
		} 
	} 

	public static void main(String[] args) { 
		occurance list = new occurance(); 


		list.push(1); 
		list.push(2); 
		list.push(1); 
		list.push(1); 
			list.push(2); 
		list.push(2); 
		list.push(2); 
		list.push(2); 

		list.occurance(head); 
	
	} 
} 

