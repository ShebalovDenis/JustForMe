package qqq.q1;
public class BoobleV2 {
//	public static void main(String[] args){
//		int[] arr = new int[10];
//		
//		 
//		 for(int i = 0; i < arr.length; i++){
//		   arr[i] = (int)(Math.random()*100); 
//		  // System.out.println(arr[i]);
//		}
//		
//		doAlgoritm(arr);
//		
//		При необходимости запуска программы раскоментировать.
//		}
		public static void doAlgoritm(int[] arr)
	    {	
		for(int i = 0; i < arr.length-1; i++){
			for(int j = i+1 ; j < arr.length-1; j++){
				if (arr[i]>=arr[j+1]){
				arr[i] = arr[i] + arr[j+1] - (arr[j+1] = arr[i]);			
				}
			}
			System.out.print(arr[i]+ " ");
		}
		
		
			
		}

}
