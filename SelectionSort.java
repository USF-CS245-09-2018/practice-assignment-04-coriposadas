/*
 *@author Cori Posadas
*/
public class SelectionSort implements SortingAlgorithm{

	public int findMin(int position, int [] array){
		int min = position;
		for (int k = position+1; k< array.length; k++){
			if (array[k] < array[min]){
				min = k;
			}
		}
		return min;
	}

	public void swap(int a, int b, int [] array){
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

	public void sort(int [] arr){
		for (int i = 0; i < arr.length-1; i++){
			swap(i, findMin(i, arr), arr);
		}
	}
}