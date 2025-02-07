class Node<T>{
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
        this.next = null;
    }
}

public class CustomLinkedList<T> {
    private Node<T> head;

    CustomLinkedList(){
        head = null;
    }

    public void add(T data){
        Node<T> temp = head;
        Node<T> newNode = new Node<T>(data);
        temp.next = newNode;
        if (temp == null){
            temp = newNode;
        } else{
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void print(){
        Node<T> temp = head;
        while (temp.next != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    public void remove(T data){
        Node<T> temp = head;
        if (temp == null) return;

        if (temp.data.equals(data)){
            temp = temp.next;
            return;
        }

        while (temp.next != null && !temp.next.data.equals(data)){
            temp = temp.next;
        }

        if (temp.next != null){
            temp.next = temp.next.next;
        }
    }
}
