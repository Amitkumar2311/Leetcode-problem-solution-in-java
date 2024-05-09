/* 4. MADIAN OF TWO SORTED ARRAY
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 

Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106
 * 
 */
// SOLUTION
public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int arr[] = new int[nums1.length+nums2.length];
     int j =0;
    for(int i=0; i<arr.length; i++){
       
        if(nums1.length>i){
            arr[i] = nums1[i];
        }else{
            arr[i]= nums2[j];
            j++;
        }
    }
    Arrays.sort(arr);
    int l = arr.length;
    if(l%2 == 1){
        return (double)arr[l/2];
    }else{
        int middle1 = arr[l/2];
        int middle2 = arr[l/2-1];
        return ((double)middle1 + (double)middle2)/2.0;
    }
    
}
}