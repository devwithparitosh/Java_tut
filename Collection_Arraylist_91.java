/*An ArrayList is like a resizable array.

It is part of the java.util package and implements the List interface.

The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one). While elements can be added and removed from an ArrayList whenever you want.

*/

import java.util.ArrayList;

public class Collection_Arraylist_91 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        ArrayList<Integer> list2=new ArrayList<>();

        list2.add(12);
        list2.add(65);
        list2.add(90);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(8);

        list.add(0,82);            //it take  the position of the value but not replace it(index,value )

        list.addAll(list2);         //it add the list 2 value in list 1 at the end of the list 1.

        //list.addAll(0,list2);        //(index , list value you want to add)

        //list.clear();                 //it clear all the value.

        System.out.println(list.contains(5));

        System.out.println(list.indexOf(12));

        list.remove(0);   //it remove the value at particular index

        list.set(0,2);          //it replace the value at the index and Set the given value.

        System.out.println(list.get(4));

        for (int i=0;i<list.size();i++){

            System.out.print(list.get(i));       //get method is used to access the array index
            System.out.print(", ");

        }
    }
}
