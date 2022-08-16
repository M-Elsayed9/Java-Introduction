import java.util.Arrays;
import java.util.Scanner;

public class Search_And_Sort {


    // LINEAR SEARCH 
    public static int LinearSearch(int arr[], int n){
    	//loop through the array
        for(int i = 0; i < arr.length; i++){
        	//if found return the index 
            if(arr[i] == n)
            	System.out.println("Found");
                return i;
        }
        //if not found return 
        System.out.println("Not Found");
        return -1;
    }
    
    
    // Binary SEARCH 
    public static int BinarySearch(int arr[], int searchValue){
        //sort the array using the built sort method from the Arrays class
    	Arrays.sort(arr);
    	
        int low  = 0, high = arr.length-1 , mid;
        
        //
        while(high >= low){
            mid = low + ((high - low) / 2);
            if(arr[mid] == searchValue) {
            	System.out.println("Found");
                return mid;		//return the position 
            }else if(arr[mid] > searchValue) 		//if mid is bigger than searchValue 
                high = mid - 1;						
            else					//if mid is smaller than searchValue
                low = mid + 1;
        }
        System.out.println("Not Found");
        return -1;
    }
    
    
    // Binary SEARCH Recursion 
    public static int BinarySearchRecursion(int arr[], int s, int e, int n){
        Arrays.sort(arr);
        
        if(s <= e){
            int mid = s + ((e - s) / 2);
            if(arr[mid] == n)
                return mid;
            else if(arr[mid] > n)
                return BinarySearchRecursion(arr, s, mid - 1, n);
            else
                return BinarySearchRecursion(arr, mid + 1, e, n);
        }
        return -1;
    }
    
    // SWAP FUNC 
    public static void swap(int[] arr, int i, int j)
    {
    	//store the first element value in the variable temp
        int temp = arr[i];
        //assign the second element value to the first variable
        arr[i] = arr[j];
        //assign the first element value stored in temp in the second variable
        arr[j] = temp;
    }
    
    // Bubble Sort 
    public static void bubbleSort(int arr[]){
        boolean isSwaped = true;
        int i = 0;
        while(isSwaped){
            isSwaped = false;
            for(int j = 0; j < (arr.length) - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                    isSwaped = true;
                }
            }
            i++;
        }
    }
    
    // Selection Sort 
    public static void selectionSort(int arr[]){
        int min_indx;
        for(int i = 0; i < arr.length-1; i++){
            min_indx = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[min_indx] > arr[j])
                    min_indx = j;
            }
            swap(arr, min_indx, i);
        }
    }
    
    
    // Insertion Sort 
    public static void inserionSort(int arr[]){
        int k, i, j;
        for(i = 1; i < arr.length; i++){
            k = arr[i];
            j = i - 1;
            while(j >= 0 && arr[j]>k){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = k;
        }
    }
    
    // Merge Sort
    public static void mergeSort(int arr[], int s, int e){
        int m;
        if(e > s){
            m = s + ((e - s)/2);
            mergeSort(arr, s, m);
            mergeSort(arr, m+1, e);
            merge(arr, s, m, e);
        }
    }
    // MERGE 
    public static void merge(int arr[], int l, int m, int r){
        int n1 = m - l + 1, n2 = r - m;
        
        int L[] = new int[n1], R[] = new int[n2];
        for(int i = 0; i < n1; i++){
            L[i] = arr[l + i];
        }
        
        for(int i = 0; i < n2; i++){
            R[i] = arr[m + 1 + i];
        }
        
        int i = 0, j = 0, k = l;
        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        
        while(i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
        
    }
    
   
    // Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int arr2[] = {5, 2, 8, 1, 3, 7};
        int arr3[] = {1, 2, 8, 7, 9, 17, 55, 4};
        int arr4[] = {1, 2, 8, 7, 9, 17, 55, 4, 9};
        int arr5[] = {1, 2, 8, 7, 9, 17, 55, 4, 9, 5};
        int arr6[] = {1, 2, 8, 7, 9, 17, 55, 4, 9, 5};
        
        //prompt the user to enter the first element
        System.out.println("Enter Array Element : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            System.out.println("Enter Array Element : ");
        }
        
        //Print the array before invoking any of the method 
        System.out.println(Arrays.toString(arr));
        
        System.out.println("==============LinearSearch================");
        System.out.println(LinearSearch(arr, 5));
        System.out.println("==============BinarySearch================");
        System.out.println(BinarySearch(arr, 5));
        System.out.println(Arrays.toString(arr));
        System.out.println("==============BinarySearchRecu.================");
        System.out.println(BinarySearchRecursion(arr, 0, arr.length-1, 5));
        System.out.println("==============BubleSort.================");
        bubbleSort(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println("==============SelectionSort.================");
        selectionSort(arr3);
        System.out.println(Arrays.toString(arr3));
        System.out.println("==============insertionSort.================");
        inserionSort(arr4);
        System.out.println(Arrays.toString(arr4));
        System.out.println("==============MergeSort.================");
        mergeSort(arr5, 0, arr5.length-1);
        System.out.println(Arrays.toString(arr5));
        
        
    }
}