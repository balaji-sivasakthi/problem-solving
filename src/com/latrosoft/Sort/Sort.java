package com.latrosoft.Sort;

public class Sort {
    int[] arr;

    public Sort(int[] arr){
        this.arr=arr;
    }
    public void insertionSort(){
                for(int i=1;i< arr.length;i++){
                    int value= arr[i];
                    int hole = i;
                    while (hole>0&&arr[hole-1]>value){
                        arr[hole]=arr[hole-1];
                        hole--;
                    }
                    arr[hole]=value;
                }
    }
    public void selectionSort(){
        for(int i=0;i<arr.length;i++){
            int min = i;
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
    public void bubbleSort(){

    }
    public void mergeSort(){

    }

    public void printArr(){
                for (int i=0;i<arr.length;i++){
                    System.out.print(arr[i]+" ");
                }

    }

}
