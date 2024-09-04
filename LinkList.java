package wayne;

import java.util.LinkedList;

public class LinkList {
    public static void main(String[] args) {
        LinkedList<String>linkedList=new LinkedList<String>();
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        linkedList.add(4,"E");
        //linkedList.remove("B");

        System.out.println(linkedList);
//String first=linkedList.removeFirst();
    }
}
