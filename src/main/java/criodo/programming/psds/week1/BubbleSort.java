package criodo.programming.psds.week1;

public class BubbleSort {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {-22 ,-15 ,1 ,7 ,20 ,35 ,55};
		intArray = bubbleSort(intArray);
		for(int i=0;i<intArray.length;i++) {
			System.out.print(" ,"+intArray[i]);
		}
	}
	
	public static void swap(int arr[],int firstNum,int secondNum) {
		if(firstNum==secondNum)
			return;
		int temp;
		 temp = arr[firstNum];
		 arr[firstNum] = arr[secondNum];
		 arr[secondNum] = temp;
		
	}
	
	public static int[] bubbleSort(int[] array) {
		int count=0;
		int alreadySorted =0;
		for(int i=0;i<array.length;i++) {
			for(int j=0; j < array.length-i-1;j++) {
				count++;
				if(array[j]>array[j+1]) {
					swap(array,j,j+1);
					alreadySorted++;
				}
					
			}
			if(alreadySorted==0) {
				break;
			}
		}
		System.out.println(count);
		return array;
	}

}
