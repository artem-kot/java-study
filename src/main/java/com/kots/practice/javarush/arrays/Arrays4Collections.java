package com.kots.practice.javarush.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * There is a Collections framework which helps to do many things.
 *
 */
public class Arrays4Collections extends Arrays0Utils {

    /*
    Declaration and Initialisation.
    We can initialise List using ArrayList or List.of(...) static method.
     */

    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>(6);
    List<Integer> list3 = List.of(5, 16, -1, 12, 9, 3);

    Integer[] list4numbers = {5, 16, -1, 12, 9, 3};
    List<Integer> list4 = List.of(list4numbers);

    List<Integer> list5 = new ArrayList<>(List.of(list4numbers));
    List<Integer> list6 = new ArrayList<>(list4);

    /*
    Copying.
    We can copy existing List using List.copyOf(...)
     */
    List<Integer> copyOfList3 = List.copyOf(list3);

    /*
    Sorting.
    We can utilise List.sort(...) method to sort things.
     */
    public static void main(String[] args) {
        Arrays4Collections task = new Arrays4Collections();
        System.out.println(task.list5);
        task.list5.sort(null);
        System.out.println(task.list5);
    }

}
