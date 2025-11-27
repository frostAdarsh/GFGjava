package CDAC_PRACTICE_DSA;

public class LinkListOne {
  Node<Integer> head;

    public LinkListOne() {
        this.head = null;
    }
}

class  Node<T>{
    T data;
    Node next;

    Node(){
        this.next = null;
    }
    Node(T data){
        this.next = null;
        this.data = data;
    }
}