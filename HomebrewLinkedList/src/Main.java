import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.LinkedList;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HomebrewLinkedList list = new HomebrewLinkedList();
        list.add(5);
        list.add(7);
        list.add(9);
        System.out.println(list);
        list.remove(0);
        list.add(4);
        list.add(6);
        System.out.println(list);
        list.add(4, 7);
        System.out.println(list);
        list.set(1, 5);
        System.out.println("Size: " + list.size());
        System.out.println("False" + list.isEmpty());
        System.out.println(list);
        System.out.println(list.contains(4) + " " + list.contains(3));
        int [] arr = list.toArray();
        for (int n : arr)
            System.out.print(n + " ");
    }
}