import java.util.Arrays;
import java.util.Scanner;

public class Search_And_Sort {

    //LINEAR SEARCH 
    //unsorted array
    public static int LinearSearch(int arr[], int searchValue){
    	//loop through the array
        for(int i = 0; i < arr.length; i++){
        	//if found return the index 
            if(arr[i] == searchValue) {
            	System.out.print("Found at position: ");
                return i;
            }
        }
        //if not found return 
        System.out.println("Not Found");
        return -1;
    }
    
    // Binary SEARCH 
    //this is the most efficient iterative version 
    //needs to be sorted
    public static int BinarySearch(int arr[], int searchValue){
        //sort the array using the built sort method from the Arrays class
    	Arrays.sort(arr);
    	
        int low  = 0, high = arr.length-1 , mid;
        
        
        while(high >= low){
            mid = low + ((high - low) / 2);
            if(arr[mid] == searchValue) {
            	System.out.print("Found at position: ");
                return mid;		//return the position 
            }else if(arr[mid] > searchValue) 		//if mid is bigger than searchValue 
                high = mid - 1;						
            else					//if mid is smaller than searchValue
                low = mid + 1;
        }
        System.out.println("Not Found");
        return -1;
    }
    
    // Binary SEARCH Recursion is easier to implement but is slower
    public static int BinarySearchRecursion(int arr[], int low, int high, int searchValue){
        Arrays.sort(arr);
        
        if(low <= high){
            int mid = low + ((high - low) / 2);
            if(arr[mid] == searchValue)
                return mid;
            else if(arr[mid] > searchValue)
                return BinarySearchRecursion(arr, low, mid - 1, searchValue);
            else
                return BinarySearchRecursion(arr, mid + 1, high, searchValue);
        }
        System.out.println("Not Found");
        return -1;
    }
    
    // SWAP FUNC 
    //swaps two elements in an array
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
    /*Bubble sort and insertion sort is suitable for sorting a small dataset. 
     * Both have lower efficiency when compared to other 
     * advanced sorting algorithms such as quicksort and merge sort. 
     */
    public static void bubbleSort(int arr[]){
        boolean isSwaped = true;
        int i = 0;
        while(isSwaped){
            isSwaped = false;
            for(int j = 0; j < (arr.length) - i - 1; j++){
            	
                if(arr[j] > arr[j+1]){
                	int temp = arr[j];
                	arr[j] = arr[j+1];
                	arr[j+1] = temp;
                    //swap(arr, j, j+1);
                    isSwaped = true;
                }
            }
            i++;
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
    
    // Selection Sort 
    /*Use selection sort in the following scenarios:

	1-When the array is NOT partially sorted
	2-When we have memory usage constraints
	3-When a simple sorting implementation is desired
	4-When the array to be sorted is relatively small
	
	*Avoid using Selection sort when:
	
	The array to be sorted has a large number of elements
	The array is nearly sorted
	You want a faster run time and memory is not a concern.
    */
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
    
 
    // Merge Sort
    /* Merge sort is a sorting algorithm based on the Divide and conquer strategy.
     * The basic logic flows as follows:
		1-If the array length is one, since it is trivially sorted, the array is returned.
		2-If the array length is larger than one, we split the array in half.
		3-Now, we recursively call merge sort on each of those halves.
		4-On the return of these recursive calls, we combine the two already sorted half arrays to form a new sorted array.
		5-As the recursive calls return from the stack, the eventual product is a fully sorted array.
     * 
     */
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
    //this program has an int array of 5 elements which the users enters
    //and 5 more arrays already declared and initiliazed to demonstarte the use of each of the sorting methods 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int arr2[] = {5, 2, 8, 1, 3, 7};//unsorted array
        int arr3[] = {1, 2, 8, 7, 9, 17, 55, 4};//unsorted array
        int arr4[] = {1, 2, 8, 7, 9, 17, 55, 4, 9};//unsorted array
        int arr5[] = {1, 2, 8, 7, 9, 17, 55, 4, 9, 5};//unsorted array
        int arr6[] = {1, 2, 8, 7, 9, 17, 55, 4, 9, 5};//unsorted array
        
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