public class DLLfour {
//
    private Node head;//by default this is null

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
   }

   public void insertLast(int val){
        Node node=new Node(val);
        Node lastTemp=head;
        if(head==null){
            node.prev=null;
            head=node;
            return;
        }
        while(lastTemp.next!=null){
            lastTemp=lastTemp.next;
        }
        lastTemp.next=node;
        node.prev=lastTemp;
   }

    public Node find(int value){
        Node node=head;
        while(node!=null){
            if(node.val==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }
   public void insertMiddle(int after,int val){
        Node p=find(after);
        if(p==null){//these are exception
            System.out.println("doesn't exist");
            return;
        }
        Node node=new Node(val);
        node.next=p.next;
        p.next=node;
        node.prev=p;
        if(node.next!=null){
            node.next.prev=node;
        }

   }

   public void display(){
        Node node=head;
        Node last=node;
        while(node!=null){
            System.out.print(node.val+" -> ");
            last=node;
            node=node.next;
        }
        System.out.println("end");

        System.out.println("Print reverse man");
        while(last!=null){
            System.out.print(last.val+" -> ");
            last=last.prev;
        }
        System.out.println("Start");
    }
    private class Node{
        int val;
        Node next;
        Node prev;


        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}