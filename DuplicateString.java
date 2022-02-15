package week1day5class1;

public class DuplicateString {
	
	public static void main(String[] args) {
		int[] arr= {14,12,13,11,15,14,15,17,18};

		for(int i=0;i<arr.length;i++) {
			int count=1;	
			//System.out.println(i);
		for(int j=i+1;j<arr.length;j++) {
			//System.out.println(j);
			if(arr[i]==arr[j]) 
			count++;
		}
		
if(count>1) {
	System.out.println(arr[i]);
}
	
   }
	}
}


	
	


