package com.company;

public class PiramidSort {
    public static int[] A = {15,9,8,1,4,11,7,12,13,6,5,3,16,2,10,14};

    public static void main(String[] args) {
        sort();
    }

    public static void sort(){
        buildHeap();
        for (int i=A.length-1; i>=1;i--){
            swap(0,i);
            heapify(0,i);
        }
    }

    public static void buildHeap(){
        int n = A.length-1;
        for(int i=n/2 - 1; i>=0;i--){
            heapify(i,n);
        }
    }

    public static void heapify(int idx, int max){
        int largest = idx;
        int left = 2*idx + 1;
        int right = 2*idx + 2;

        if((left < max)&&(A[left]>A[idx])){
            largest = left;
        }
        if((right<max)&&(A[right]>A[largest])){
            largest = right;
        }
        if(largest!=idx){
            swap(idx,largest);
            heapify(largest, max);
        }
    }

    public static void swap(int idx1, int idx2){
        int temp = A[idx1];
        A[idx1] = A[idx2];
        A[idx2] = temp;
    }
}
