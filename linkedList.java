public class linkedList {
    Node head;
    public class Node{
        int data;
       Node next;
        public Node(int data) {
            this.data = data;
            this.next=null;
        }
    }
    public Node insertNode(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return head;
        }
        newNode.next=head;
        head=newNode;
        return head;
    }
    public void displayLL(){
        if(head==null){
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data +"-->");
            currNode=currNode.next;
        }
        System.out.print("null");
        return;
    }
    public void reverseLL(){
        if(head==null || head.next==null){
            return;
        }
        Node currNode=head.next;
        Node prev=head;
        while(currNode!=null){
            Node last=currNode.next;
            currNode.next=prev;
            prev=currNode;
            currNode=last;
        }
        head.next=null;
        head=prev;
        return;
    }
    public static void main(String args[]){
        linkedList ll=new linkedList();
        ll.insertNode(4);
        ll.insertNode(3);
        ll.insertNode(2);
        ll.insertNode(1);
        ll.insertNode(0);
        ll.displayLL();
        System.out.println();
        ll.reverseLL();
        ll.displayLL();

    }
}
