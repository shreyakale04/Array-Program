package com.advanced;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class MaxSlidingWindow {

	public static void main(String[] args) {

        int[] arr = {1, 3, -1, 3, 5, 4, 2, 3, 1};
        int k = 3;

        int[] result = maxSlidingWindow(arr, k);

        System.out.println(Arrays.toString(result));
    }


    public static int[] maxSlidingWindow(int[] arr, int k) {

        int n = arr.length;

        int[] result = new int[n - k + 1];

        Deque<Integer> deque = new LinkedList<>();
        
        int index = 0;


        for (int i = 0; i < n; i++) {


        	
            // Remove elements outside current window
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.removeFirst();
            }


            // Remove smaller elements
            while (!deque.isEmpty() &&
                    arr[deque.peekLast()] <= arr[i]) {

                deque.removeLast();
            }


            // Add current index
            deque.addLast(i);


            // Store maximum after first window
            if (i >= k - 1) {

                result[index++] = arr[deque.peekFirst()];
            }
        }

        return result;
    }
}
