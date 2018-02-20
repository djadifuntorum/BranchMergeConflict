import java.util.*;
/**
 * Main
 */
public class Main {

    static Exercises exercise3 = new Exercises();

    /**
     * Write a Java program to create a new array list,
     * add some colors (string) and print out the collection.
     */
    public static void exercise1(){

        System.out.println("<-----------Exercise 1----------->");

        Exercises exercise1 = new Exercises();

        exercise1.addColor("Red");
        exercise1.addColor("Orange");
        exercise1.addColor("Yellow");
        exercise1.addColor("Green");
        exercise1.addColor("Blue");
        exercise1.addColor("Indigo");
        exercise1.addColor("Violet");

        exercise1.printColors();
    }
    //add method just adds an element to the end of the arrayList.


    /**
     * Write a Java program to iterate through all elements in a array list.
     */
    public static void exercise2(){

        System.out.println("<-----------Exercise 2----------->");

        Exercises exercise2 = new Exercises();

        exercise2.setColor(0, "Red");
        exercise2.setColor(1, "Orange");
        exercise2.setColor(2, "Yellow");
        exercise2.setColor(3, "Green");
        exercise2.setColor(4, "Blue");
        exercise2.setColor(5, "Indigo");
        exercise2.setColor(6, "Violet");

        exercise2.getColor();
    }
    //add(index, element) adds the element at the specified index

    /**
     * Write a Java program to insert an element into the array
     * list at the first position.
     */
    public static void exercise3(){

        System.out.println("<-----------Exercise 3----------->");

        exercise3.addColor("Red");
        exercise3.addColor("Orange");
        exercise3.addColor("Yellow");
        exercise3.addColor("Green");
        exercise3.addColor("Blue");
        exercise3.addColor("Indigo");
        exercise3.addColor("Violet");

        exercise3.setColor(0,"Violet");

        exercise3.printColors();
    }

    //add(index, element) incase the index has already an existing value/element,
    //it will replace that element, and moves the replaces element to the next index.

    /**
     * Write a Java program to retrieve an element (at a specified index)
     * from a given array list.
     */
    public static void exercise4(){

        System.out.println("<-----------Exercise 4----------->");
        System.out.println(exercise3.getColor(2));
    }
    //get(index) returns the value of the given index

    /**
     * Write a Java program to update specific array element by given element.
     */
    public static void exercise5(){

        System.out.println("<-----------Exercise 5----------->");
        int index = exercise3.getIndex("Blue");
        String oldColor = exercise3.setNewColor(index, "Pink");
        exercise3.printColors();

    }
    //indexOf returns the index of the specified Object passed
    //set(index, element) returns the old element of the given index,
    //while REPLACING it with the new given element

    /**
     * Write a Java program to remove the third element from a array list.
     */
    public static void exercise6(){

        System.out.println("<-----------Exercise 6----------->");
        String removedColor = exercise3.removeColor(4);
        exercise3.printColors();

    }
    //remove(index) removes the element with the given index.
    //the next element(if there is any) is then moved to that index.

    /**
     * Write a Java program to search an element in a array list.
     */
    public static void exercise7(){

        System.out.println("<-----------Exercise 7----------->");
        exercise3.searchColor("Yellow");
        exercise3.searchColor("Black");

    }
    //contains(element) returns boolean values if the element is contianed or not
    //in the list.

    /**
     * Write a Java program to sort a given array list.
     */
    public static void exercise8(){

        System.out.println("<-----------Exercise 8----------->");
        exercise3.sortColor();

    }
    //sort(List) sorts out the list

    /**
     * Write a Java program to copy one array list into another.
     */
    public static void exercise9(){

        System.out.println("<-----------Exercise 9----------->");
        ArrayList<String> newColorList = exercise3.copyColorsList();
        System.out.println(newColorList);

    }

    /**
     * Write a Java program to shuffle elements in a array list.
     */
    public static void exercise10(){

        System.out.println("<-----------Exercise 10----------->");
        exercise3.shuffleColor();

    }
    //shuffle(List) shuffles out the list

    /**
     * Write a Java program to reverse elements in a array list.
     */
    public static void exercise11(){

        System.out.println("<-----------Exercise 11----------->");
        exercise3.reverseColor();

    }
    //reverse(List) reverses out the list

    /**
     * Write a Java program to extract a portion of a array list.
     */
    public static void exercise12(){

        System.out.println("<-----------Exercise 12----------->");
        List<String> newColorList = exercise3.partOfList(1,5);
        System.out.println(newColorList);

    }
    //list a portion of the list depending on the start and end index.

    public static void main(String[] args) {

        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
        exercise6();
        exercise7();
        exercise8();
        exercise9();
        exercise10();
        exercise6(); //again for conflict purposes
        exercise11();
        exercise12(); //This is to create a conflict

        int[] age = new int[10];
        System.out.println(Arrays.toString(age));
    }
}


