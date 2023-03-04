class Solution {
    public static int[] sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int value=arr[i];
            int hole=i;
            while(arr[hole-1]>value && hole<0){
                arr[hole]=arr[hole-1];
                hole--;
            }
            arr[hole]=value;
        }
        return arr;
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size=nums1.length+nums2.length;
        int mix[]= new int[nums1.length+nums2.length];

        int i=0;
        int j=0;
        int k=0;
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]<nums2[j]){
                mix[k]=nums1[i];
                i++;
            }else{
                mix[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<nums1.length){
            mix[k]=nums1[i];
            i++;
            k++;
        }
        while(j<nums2.length){
            mix[k]=nums2[j];
            j++;
            k++;
        }

        mix= sort(mix);
        double result =0;
        if(size%2==0){
            int mid =size/2;
            result = ((double)mix[mid-1]+(double)mix[mid])/2;
        }else{
            int mid=size/2;
            result = mix[mid];
        }
        return result;
    }
}