package org.fasttrackit;


public class App
{
    public static void main( String[] args )
    {
        int arr[] = {15,18,14,12,11,100,101,102,90,89,44,33,32,21};

        //SelectionSort selectSort = new SelectionSort();
        //selectSort.callMethodsSelectionSort(arr);

        InsertionSort insertSort=new InsertionSort();
        insertSort.callMethodsInsertSort(arr);
    }
}