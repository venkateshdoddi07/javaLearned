package com.codegnan;


public class Print2DArray {

	public static void main(String[] args) {

		int [][] numbers= {{1,2,3},{5,30,6},{7,8}};
			for(int i=0;i<numbers.length;i++) {
				
				for(int j=0;j<numbers[i].length;j++) {
					
					
					
					System.out.print(numbers[i][j]+" ");
					
				}
				System.out.println();
			}
		
		//another easy method
			System.out.println("printing 2D array elements usuing enhanced for loop");
			for(int[] num:numbers) {
				
					for(int x:num) {
						
						System.out.print(x+" ");
					}
					System.out.println();
				
			}
			
	}

}
