import java.util.NoSuchElementException;

public class HomebrewLinkedList {
    private ListNode front;

    public HomebrewLinkedList() {
        front = null;
    }

    public void add(int data) {
        if (front == null) {
            front = new ListNode(data);
            return;
        }
        ListNode ptr = front;
        while (ptr.next != null)
            ptr = ptr.next;
        ptr.next = new ListNode(data);
    }

    public void add(int i, int data) {
        if (i == 0) {
            ListNode temp = new ListNode(data);
            temp.next = front;
            return;
        }
        if (front == null)
            throw new NoSuchElementException();
        ListNode ptr = front;
        while (i > 1) {
            if (ptr.next == null)
                throw new IndexOutOfBoundsException();
            ptr = ptr.next;
            i--;
        }
        ListNode temp = ptr.next;
        ptr.next = new ListNode (data);
        ptr.next.next = temp;
    }

    public void remove(int i) {
        if (front == null)
            throw new NoSuchElementException();
        if (i == 0) {
            front = front.next;
            return;
        }
        ListNode ptr = front;
        while (i > 1) {
            if (ptr.next == null)
                throw new IndexOutOfBoundsException();
            ptr = ptr.next;
            i--;
        }
        ptr.next = ptr.next.next;
    }

    public void print() {
        System.out.println(this);
    }
    public void clear() {
        front = null;
    }

    public boolean contains(int n) {
        ListNode ptr = front;
        while (ptr != null) {
            if (ptr.data == n)
                return true;
            ptr = ptr.next;
        }
        return false;
    }

    public int get(int i) {
        if (front == null)
            throw new IndexOutOfBoundsException();
        ListNode ptr = front;
        while (ptr.next != null && i > 0) {
            ptr = ptr.next;
            i--;
        }
        if (i > 0)
            throw new IndexOutOfBoundsException();
        return ptr.data;

    }

    public int [] toArray() {
        int length = 0;
        ListNode ptr = front;
        while (ptr != null) {
            length++;
            ptr = ptr.next;
        }
        ptr = front;
        int [] arr = new int[length];
        length = 0;
        while(ptr != null) {
            arr[length] = ptr.data;
            length++;
            ptr = ptr.next;
        }
        return arr;
    }

    public void set(int i, int n) {
        ListNode ptr = front;
        int pos = 0;
        while (ptr != null && pos < i) {
            ptr = ptr.next;
            i--;
        }
        if (pos < i)
            throw new IndexOutOfBoundsException();
        ptr.data = n;
    }
    public int size() {
        int size = 0;
        ListNode ptr = front;
        while (ptr != null) {
            size++;
            ptr = ptr.next;
        }
        return size;
    }
    public boolean isEmpty() {
        return front == null;
    }
    public void remove() {
        if (front == null)
            throw new NoSuchElementException();
        if (front.next == null) {
            front = null;
            return;
        }
        ListNode ptr = front;
        while(ptr.next.next != null)
            ptr = ptr.next;
        ptr.next = null;
    }

    @Override
    public String toString() {
        String result = "";
        result += "[";
        if (front == null)
            return result + "]";
        ListNode ptr = front;
        while (ptr.next != null) {
            result += ptr.toString() + ", ";
            ptr = ptr.next;
        }
        return result + ptr.toString() + "]";
    }
    private class ListNode {
        public ListNode next;
        public int data;

        public ListNode() {
            this(0, null);
        }

        public ListNode(int data) {
            this(data, null);
        }

        public ListNode(int data, ListNode next) {
            this.data = data;
            this.next = next;
        }

        @Override
        public String toString() {
            return data + "";
        }
    }
}