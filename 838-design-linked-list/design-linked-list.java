class MyLinkedList {
    private Node head;
    private int length;

    public class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public MyLinkedList() {
        this.head = null;
        this.length = 0;
    }

    public void printNodes(Node head) {
        while (head != null) {
            System.out.println("Node in order:- " + head.val);
            head = head.next;
        }
    }

    public int get(int index) {

        if (index >= length) {
            return -1;
        }

        int result = 0;
        Node temp = head;

        if (index == 0)
            return temp.val;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
            result = temp.val;
        }
        return result;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        length++;
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

    }

    public void addAtTail(int val) {
        if (head == null) {
            addAtHead(val);
        } else {
            Node temp = head;
            Node newElementNode = new Node(val);
            length++;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newElementNode;
        }

    }

    public void addAtIndex(int index, int val) {

        if (index > length)
            return;

        if (index == length) {
            addAtTail(val);
            return;
        }

        if (index == 0) {
            addAtHead(val);
            return;
        }

        Node currentEle = head;
        Node nextEle = head.next;
        int counter = 1;

        while (counter < index) {
            currentEle = currentEle.next;
            nextEle = nextEle.next;
            counter++;
        }

        Node newNode = new Node(val);
        length++;
        currentEle.next = newNode;
        newNode.next = nextEle;

    }

    public void deleteAtIndex(int index) {
        Node currElement = head;

        if (index >= length) {
            return;
        }

        if (index == 0) {
            head = currElement.next;
            length--;
        } else {
            if (index == 1) {
                Node nextElement = currElement.next;
                currElement.next = nextElement.next;
                length--;
            } else {
                Node nextElement = currElement.next;
                for (int i = 1; i < index; i++) {
                    currElement = currElement.next;
                    nextElement = nextElement.next;
                }
                currElement.next = nextElement.next;
                length--;
            }

        }

    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */