package SortingAlgorithm;

import java.util.Arrays;
//Selection Sort 
public class SelectionSort {
	


public static void main(String[] args) {
		int[] arr= {7,8,2,3,5,1,10,24,15,66,6};
		
		for(int i=0;i<arr.length-1;i++) {
		     
		 int minIndex=i;
		
		     for(int j=i+1; j<arr.length;j++) {
					if(arr[j]<arr[minIndex]) {
						minIndex=j;
					}
				}
				
		     int temp = arr[i];
		     arr[i]=arr[minIndex];
		     arr[minIndex]=temp;
				
			}
		System.out.println(Arrays.toString(arr));
		
		}
   
		

	}


