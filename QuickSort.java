package Nuts;

public class QuickSort {
	static void quicksort(int [] arr,int low, int high)
	{
		if(low<high) {
			int pivotIndex = partition(arr,low,high);
			
		quicksort(arr,low,pivotIndex-1);
		quicksort(arr,pivotIndex+1,high);
			
		}
		
		
	}
	static int partition (int[] arr,int low,int high) {
		int pivot = arr[high];
		int i =low-1;
		for(int j=low;j<high;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		return i+1;
	}
			static void printArray(int []arr)
			{
				for(int value:arr) {
					System.out.println(value+"");
				}
				System.out.println();
			}
				public static void main(String [] args) {
					int [] numbers = {5,2,9,1,6};
					System.out.println("Before Sorting");
					printArray(numbers);
					quicksort(numbers,0,numbers.length-1);
					System.out.println("After Sorting");
					printArray(numbers);
				}
			}
		
