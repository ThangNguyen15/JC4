package org.activestudy.generic;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by ThangNguyen on 9/11/2016.
 */
public class RemoveDuplicates {
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        HashSet hashSet = new HashSet();
        hashSet.addAll(list);
        list.clear();
        list.addAll(hashSet);
        return list;
    }

    public static void main(String[] args) {
        ArrayList intList = new ArrayList<>();
        int[] intArray = {1,2,1,3,2,1,1,1111,11,11,1,1,1,1,1};
        for (int i: intArray) {
            intList.add(i);
        }
        System.out.println(RemoveDuplicates.removeDuplicates(intList));
    }
}
