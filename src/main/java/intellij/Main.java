package intellij;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // LinkedList and ArrayLists
        // they have the same methods
        // LinkedList is slower than ArrayList in getting a certain element
        // LinkedList is faster in adding or removing an element - arrayList is slower
        // Applications: retrieving elements and no change either additions or removing then ArrayList
        // Program focused more on add/ removing more than retrieving use LinkedList



        LinkedList<String> namesLinkedList = new LinkedList<>();
        // adding
        namesLinkedList.add("John");
        namesLinkedList.add("Paul");
        namesLinkedList.add("Peter");
        namesLinkedList.add("Mark");
        namesLinkedList.add("Matthew");
        namesLinkedList.add("Luke");

        System.out.println(namesLinkedList.get(2));
        System.out.println(namesLinkedList);
        namesLinkedList.add(1, "Jerry");



        ArrayList<String> nameArrayList = new ArrayList<>();
        nameArrayList.add("John");
        nameArrayList.add("Paul");
        nameArrayList.add("Peter");
        nameArrayList.add("Mark");
        nameArrayList.add("Matthew");
        nameArrayList.add("Luke");

        System.out.println(nameArrayList);
//        System.out.println(nameArrayList.get(2));
        System.out.println(namesLinkedList.peek());
        System.out.println(namesLinkedList.peekLast());







    }
}