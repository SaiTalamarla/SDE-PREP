package criodo.programming.psds.week1;

public class SelecttionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {-22 ,-15 ,1 ,7 ,20 ,35 ,55};
		intArray = selectionSort(intArray);
		for(int i=0;i<intArray.length;i++) {
			System.out.print(" ,"+intArray[i]);
		}
	}
	
	private static int[] selectionSort(int[] intArray) {
		// TODO Auto-generated method stub
		int count=0;
		for(int lastUnsortedIndex = intArray.length-1;
					lastUnsortedIndex>0;lastUnsortedIndex--) {
			count++;
			
			int largestIndex=0;
			for(int i=1;i<= lastUnsortedIndex;i++) {
				
				if(intArray[i]> intArray[largestIndex])
					largestIndex=i;
			}
			swap(intArray, lastUnsortedIndex, largestIndex);
			
		}
		System.out.println(count);
		return intArray;
	}

	public static void swap(int arr[],int firstNum,int secondNum) {
		if(firstNum==secondNum)
			return;
		int temp;
		 temp = arr[firstNum];
		 arr[firstNum] = arr[secondNum];
		 arr[secondNum] = temp;
		
	}
}
