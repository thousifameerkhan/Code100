import java.util.LinkedList;

class linkedlist {
    public static void main(String[] args) {
        System.out.println("Hello world");

        LinkedList<Integer> l = new LinkedList();

        l.add(100);
        l.add(99);
        l.add(98);

        for( int e: l)
        {
            System.out.println(e);
        }

    }

}