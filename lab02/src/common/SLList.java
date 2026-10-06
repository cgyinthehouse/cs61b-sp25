package common;

public class SLList {

    /*
    A simple rule of thumb is that if you don't use any instance members of
    the outer class, make the nested class static.
    */
    public static class IntNode {

        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    private int size;
    private IntNode sentinel;

    public SLList(int x) {
        sentinel = new IntNode(0, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    public SLList() {
        sentinel = new IntNode(0, null);
        size = 0;
    }

    public void addFirst(int x) {
        sentinel.next = new IntNode(x, sentinel.next);
        size += 1;
    }

    public int getFirst() {
        return sentinel.next.item;
    }

    public void addLast(int x) {
        size += 1;

        IntNode p = sentinel;
        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        final SLList list = new SLList();
        list.addFirst(9);
        System.out.println(list.getFirst());
        list.addFirst(10);
        list.addLast(13);
        System.out.println(list.size());
    }
}
