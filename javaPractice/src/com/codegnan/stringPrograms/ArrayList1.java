
package com.codegnan.stringPrograms;


import java.util.*;

public class ArrayList1 {

    // Function to get first and last elements from each row
    public static ArrayList<ArrayList<Integer>> makeEnds2D(ArrayList<ArrayList<Integer>> mat) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int i = 0; i < mat.size(); i++) {
            ArrayList<Integer> row = mat.get(i);
            ArrayList<Integer> temp = new ArrayList<>();

            // handle row with at least 1 element
            temp.add(row.get(0));
            temp.add(row.get(row.size() - 1));

            result.add(temp);
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();

        mat.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        mat.add(new ArrayList<>(Arrays.asList(4, 5, 6, 7)));
        mat.add(new ArrayList<>(Arrays.asList(8)));

        ArrayList<ArrayList<Integer>> output = makeEnds2D(mat);

        System.out.println(output);  // [[1, 3], [4, 7], [8, 8]]
    }
}