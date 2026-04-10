package com.homework;
/*19)
StoreMax Stock Balancing
Problem Statement:
In the StoreMax warehouse, stock levels of items are recorded in an array.
To balance stock across sections, the manager wants to equalize stock in specific ranges by setting all values in the range to the median of that range:
Odd-length range: use the middle element after sorting.
Even-length range: use the lower middle (element at index (length - 1) / 2 after sorting).
*
Explanation (Step-by-Step):
Initial array: [10, 50, 30, 20, 40]
Query 1: 1–3 → subarray [10,50,30] → sorted [10,30,50] → median = 30
Update positions 1–3 → [30,30,30,20,40]
Query 2: 2–5 → subarray [30,30,20,40] → sorted [20,30,30,40] → median = 30
Update positions 2–5 → [30,30,30,30,30]
 Final array: [30,30,30,30,30]
Sample Test Cases
 Test Case 1
Input:
5 2
10 50 30 20 40
1 3
2 5
Output:
30 30 30 30 30
Explanation:
Query2 → median 30 → [30,30,30,30,30]



*/
import java.util.Scanner;
public class StoreMaxValue {

		public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int size=scn.nextInt();//5
	int queries=scn.nextInt();
	int[] array=new int [size];
	for(int i=0;i<size;i++) {
		array[i]=scn.nextInt();//10,50,30,20,40
	}
	
	for(int q=1;q<=queries;q++) {//2 iterations
		int L=scn.nextInt();//1
		int R=scn.nextInt();//3
		 int start=L-1;
		 int end=R-1;
		int length=end-start+1;
		
		int[] temp = new int[length];
        for (int i = 0; i < length; i++) {
            temp[i] = array[start + i];
        }
		
        // Step 2: Sort manually (Bubble Sort)
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (temp[j] > temp[j + 1]) {
                    // swap
                    int swap = temp[j];
                    temp[j] = temp[j + 1];
                    temp[j + 1] = swap;
                }
            }
        }
        
        
     // Step 3: Find median
        int medianIndex = (length - 1) / 2;
        int median = temp[medianIndex];

        // Step 4: Update original array
        for (int i = start; i <= end; i++) {
            array[i] = median;
        }
        
     // Print final array
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
	scn.close();
	}






	}



/*
 package com.homework;

import java.util.Scanner;

public class StoreMaxValue {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int size = scn.nextInt();
        int queries = scn.nextInt();

        int[] array = new int[size];

        // Input array
        for (int i = 0; i < size; i++) {
            array[i] = scn.nextInt();
        }

        // Process queries
        for (int q = 0; q < queries; q++) {

            int L = scn.nextInt();
            int R = scn.nextInt();

            int start = L - 1; // convert to 0-based
            int end = R - 1;

            int len = end - start + 1;

            // Step 1: Copy subarray
            int[] temp = new int[len];
            for (int i = 0; i < len; i++) {
                temp[i] = array[start + i];
            }

            // Step 2: Sort manually (Bubble Sort)
            for (int i = 0; i < len - 1; i++) {
                for (int j = 0; j < len - i - 1; j++) {
                    if (temp[j] > temp[j + 1]) {
                        // swap
                        int swap = temp[j];
                        temp[j] = temp[j + 1];
                        temp[j + 1] = swap;
                    }
                }
            }

            // Step 3: Find median
            int medianIndex = (len - 1) / 2;
            int median = temp[medianIndex];

            // Step 4: Update original array
            for (int i = start; i <= end; i++) {
                array[i] = median;
            }
        }

        // Print final array
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        scn.close();
    }
}
 */
