package qqq.q1;
public class BoobleV2 {
	public static void main(String[] args){
		int n = ((int)(Math.random()*10)+1); 
		int[] arr = new int[n]; // Задали массив рандомного размера 
		
		 
		 for(int i = 0; i < arr.length; i++){
		   arr[i] = (int)(Math.random()*100); // Заполнили массив рандомными числами
		  // System.out.println(arr[i]);
		}
		
		doAlgoritm(arr);
		
		//При необходимости запуска программы раскоментировать.
		}
		public static int[] doAlgoritm(int[] arr)
	    {	
		for(int i = 0; i < arr.length-1; i++){
			for(int j = i+1 ; j < arr.length-1; j++){
				if (arr[i]>=arr[j+1]){
				arr[i] = arr[i] + arr[j+1] - (arr[j+1] = arr[i]);			
				}
			}
			System.out.print(arr[i]+ " ");
		}
		// Все проверил! Работает!
		
		
			return arr;
		}

}
