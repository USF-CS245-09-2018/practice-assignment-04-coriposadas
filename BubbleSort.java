/*
 *@author Cori Posadas
*/
public class BubbleSort implements SortingAlgorithm{

	public void swap(int a, int b, int [] array){
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

	public void sort(int [] arr){
		boolean swapped = true;
		while(swapped){
			swapped = false;
			for (int i = 0; i < arr.length-1; i++){
				if (arr[i] > arr[i+1]){
					swap(i, i+1, arr);
					swapped = true;
				}
			}
		}
	}
}