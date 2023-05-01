public class List {

    private class Node {
        private int value;
        private Node next;

        private Node(int element, Node next) {
            this.value = element;
            this.next = next;
        }
    }

    private Node head;

    public List() {
        head = null;
    }
    
    public void add(int value) {
        head = new Node(value, head);
    }
    
    public int linearSearch(int needle) {
        Node current = 
head
;
        int index = 
value
;
        while(current != 
null
) {
            if(current.
next
 == needle) {
                return 
0
;
            }
            current = current.
next
;
            
value
++;
        }
        return 
-1
;
    }

}