public class LLone {

    private Node head;
    private Node tail;
    private int size;//size of ll

    private class Node{

        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }

        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }

    public LLone(){
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

    //questions on Insert using recursion
    public  void insertRec(int val,int idx){
        head = insertRec(val,idx,head);
    }


    public Node insertRec(int val, int idx, Node node){
        if(idx==0){
            Node temp=new Node(val,node);
            size++;
            return temp;
        }
        node.next=insertRec(val,idx--,node.next);
        return node;
    }


    public void display(){
        Node temp=head;//we can traverse thorugh head because it change structure of LL
        while(temp!=null){
            System.out.print(temp.value+"=>");
            temp=temp.next;
        }
        System.out.println("end");
    }

    //questions
//   83. remove duplicates from sorted Linkedlist
    public void duplicates(){
        Node node=head;

        while(node.next!=null){
            if(node.value==node.next.value){
                node.next=node.next.next;
                size--;
            }
            else{
                node=node.next;
            }
        }
        tail=node;
        tail.next=null;
    }

    //question: merge two ll
    public static LLone merge(LLone first,LLone second){
        Node f=first.head;
        Node s=second.head;

        LLone mergeLL=new LLone();

        while(f!=null && s!=null){
            if(f.value<s.value){
                mergeLL.insertLast(f.value);
                f=f.next;
            }
            else{
                mergeLL.insertLast(s.value);
                s=s.next;
            }
        }

        while (f!=null){
            mergeLL.insertLast(f.value);
            f=f.next;
        }

        while (s!=null){
            mergeLL.insertLast(s.value);
            s=s.next;
        }

        return mergeLL;
    }

    public static void main(String[] args) {
        //for remove Duplicates
//        LLone list=new LLone();
//        list.insertLast(1);
//        list.insertLast(1);
//        list.insertLast(2);
//        list.insertLast(3);
//        list.insertLast(3);
//        list.insertLast(3);
//
//        list.display();
//        list.duplicates();
//        list.display();

//        for Merge two LL
        LLone first=new LLone();
        LLone second=new LLone();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(1);
        second.insertLast(3);
        second.insertLast(7);
        second.insertLast(111);
        second.insertLast(1000);

        LLone ans = LLone.merge(first,second);
        ans.display();
    }
}
