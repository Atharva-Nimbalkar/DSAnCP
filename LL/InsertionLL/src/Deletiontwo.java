public class Deletiontwo {

    private Node head;
    private Node tail;
    private int size;//size of ll

    public Deletiontwo(){
        this.size=0;
    }
    public void insertFirst(int val){
        Node node =new Node(val);//creat new node and insert value into it
        node.next=head;//node's next pointer head to head;
        head=node;//head alwyas refer to first node

        if(tail==null){
            tail=head;
        }

        size+=1;
    }

    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node=new Node(val);//create
        tail.next=node;//current tail will point to new one
        tail=node;//tail will be now new node
        size++;
    }

    public void insertMiddle(int val,int index){
        if(head==null){
            insertFirst(val);
            size++;
        }
        if(tail==null){
            insertLast(val);
            size++;
        }
        Node temp=head;//for traversing created temp node
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;
    }

//    *******************************************************************


    public int deleteFirst(){
        int val= head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }

//    public int deleteLast(){
//        Node previous=head;
//        Node temp=head.next;
//        while(temp.next!=null){
//            previous=previous.next;
//        }
//        previous.next=null;
//        delete temp;
//        tail=previous;
//
//    }

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast=get(size-2);
        int val=tail.value;
        tail=secondLast;
        tail.next=null;
        return val;
    }

    public Node find(int value){
        Node node=head;
        while(node!=null){
            if(node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }
    public Node get(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }

    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node prev=get(index-1);
        int val=prev.next.value;
        prev.next=prev.next.next;
        return val;
    }
    public void display(){
        Node temp=head;//we can traverse thorugh head because it change structure of LL
        while(temp!=null){
            System.out.print(temp.value+"=>");
            temp=temp.next;
        }
        System.out.println("end");
    }
    private class Node{

        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }

        public Node(int value, Node next){
            this.value=value;
            this.next=next;
        }
    }

}
