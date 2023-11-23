package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*Given an array A of positive integers. Your task is to find the leaders in the array. An element of array is leader if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader.

Example 1:

Input:
n = 6
A[] = {16,17,4,3,5,2}
Output: 17 5 2
Explanation: The first leader is 17
as it is greater than all the elements
to its right.  Similarly, the next
leader is 5. The right most element
is always a leader so it is also
included.
Example 2:

Input:
n = 5
A[] = {1,2,3,4,0}
Output: 4 0
Explanation: 0 is the rightmost element
and 4 is the only element which is greater
than all the elements to its right.*/


        // int a[] = {16, 17, 4, 3, 5, 2};
        int a[] = {1, 2, 3, 4, 0};
        List leaderElemet = findLeaderElemet(a);
        System.out.println(leaderElemet);
    }

    private static List findLeaderElemet(int[] a) {
        boolean isTopElement;
        List temp = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {

            isTopElement = true;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] >= a[i]) {
                    isTopElement = false;
                    break;
                }
            }

            if (isTopElement == true) {
                temp.add(a[i]);
            }
        }

        return temp;
    }

}