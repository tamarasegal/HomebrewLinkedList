public class SamirTester {
    public static void main(String[] args) {
        //Samir's TA test code (minus the initial bugs lol)
        HomebrewLinkedList list = new HomebrewLinkedList();
        System.out.println("Expected: 0");
        System.out.print("Yours: ");
        System.out.println( list.size() );  // should print 0

        System.out.println();

        System.out.println("Expected: []");
        System.out.print("Yours: ");
        list.print();; // []

        System.out.println();

        list.add(0);
        list.add(1);
        list.add(0);
        list.add(2);
        list.add(0);
        list.add(0);

        System.out.println("Expected: [0, 1, 0, 2, 0, 0]");
        System.out.print("Yours: ");
        list.print(); // [0, 1, 0, 2, 0, 0]

        System.out.println();

        System.out.println("Expected: 6");
        System.out.print("Yours: ");
        System.out.println(list.size()); // 6

        System.out.println();

        list.add(2,3);
        System.out.println("Expected: [0, 1, 3, 0, 2, 0, 0]");
        System.out.print("Yours: ");
        list.print(); // [0, 1, 3, 0, 2, 0, 0]

        System.out.println();

        list.remove(2);
        System.out.println("Expected: [0, 1, 0, 2, 0, 0]");
        System.out.print("Yours: ");
        list.print(); // [0, 1, 0, 2, 0, 0]

        System.out.println();

        list.set(4, 5);
        System.out.println("Expected: [0, 1, 0, 2, 5, 0]");
        System.out.print("Yours: ");
        list.print(); // [0, 1, 0, 2, 5, 0]

        System.out.println();

        System.out.println("Expected: false");
        System.out.println("Yours: " + list.isEmpty());

        System.out.println();

        System.out.println("Expected: The 4th element is: 2");
        System.out.println("The 4th element is: " + list.get(3));

        System.out.println();

        System.out.println("Expected: Does this list contain a 2? : True");
        System.out.println("Does this list contain a 2? : " + list.contains(2));

        list.clear();
        System.out.println("Expected: []");
        System.out.print("Yours: ");
        list.print();

        System.out.println();

        System.out.println("Expected: true");
        System.out.println("Yours: " + list.isEmpty());
    }
}
