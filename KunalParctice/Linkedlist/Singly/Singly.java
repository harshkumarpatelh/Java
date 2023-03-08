package KunalParctice.Linkedlist.Singly;

import org.w3c.dom.Node;

public class Singly {

     //initially these two will point to null
    Node1 start;
    Node1 tail;
     private class Node1{ //no need make it private
          int val;
          Node1 link;

          public Node1(int value){
              this.val=value;

          }
//         public void insertfirst(int val){ //for the very first node to create
////             Node1 node = new Node1(val);
////             node.link = tail;
////             tail  =start  = node;
////             if(tail.link == null)
////             {
////                 insertelment(val);
////             }
//             System.out.println(val);
//         }

    }
    Node1 ptr;
    public void insertfirst(int val){ //for the very first node to create
        if(tail != null)
        {
            insertelment(val);
        }
       else{
            Node1 node = new Node1(val);
            node.link = tail;
            tail  =start  = node;
        }

    }
//    void access(int val)
//    {
//        Node1 access =new Node1(val);
//        access.insertfirst(val);
//    }
    void insertelment(int data)
    {
        Node1 node =new Node1(data);
        tail.link = node;
        node.link =null;
        tail = node;
    }
    void display(){
        Node1 ptr =start;
        if(ptr == null)
        {
            return;
        }
        else {
            while(ptr!=null)
            {
                System.out.println(ptr.val +" ");
                ptr= ptr.link;
            }
        }
    }
}

