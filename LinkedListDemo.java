import java.util.LinkedList;

public class LinkedListDemo {

    /**
     * @param args
     */
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("A");
        list.add("B");
        list.addLast("c");
        list.addFirst("d");
        list.add(2, "E");

        System.out.println(list);

    }

    @Override
    public String toString() {
        return "LinkedListDemo []";
    }
}
