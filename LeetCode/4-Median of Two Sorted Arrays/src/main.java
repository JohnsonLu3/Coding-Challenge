
//  --HARD--
//  There are two sorted arrays nums1 and nums2 of size m and n respectively.
//  Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
//  You may assume nums1 and nums2 cannot be both empty.


import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double sum = 0;
        double median;

        // find largest arr
        if(nums1.length > nums2.length){
            median = findMedian(nums1, nums2);
        }else{
            median = findMedian(nums2, nums1);
        }


        return median;
    }

    public static double findMedian(int[] l1, int[] l2){
        double median = 0;

        for(int i = 0; i < l1.length; i++){

            // get min and max of both arrays
            ArrayList<Integer> arr = new ArrayList<Integer>();
             arr.add(l1[i]);                 // l1 min
             arr.add(l2[i]);                 // l2 min

            if(l1.length-1 != i)
                arr.add(l1[l1.length-(i+1)]);       // l1 max
            if(l2.length-1 != i)
                arr.add(l2[l2.length-(i+1)]);       // l2 max


        }

        return median;
    }

    public static void main(String[] args) {
        System.out.println(
                findMedianSortedArrays( new int[]{1,2},new int[]{3,4})
        );
    }
}
