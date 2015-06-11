import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class CollectionSort {
	
	public static void main (String[] args){
		
		//collection sort is there ass well
		String[] names = { "Nimal", "Sunil", "Tharaka", "Isuru","Anuradha"};
		int[] intNumbers = { 3, 5, 12, 7, 1, 9};
		double[] doubleNumbers = { 2.34, 45.213, 4.76, 4.23, 8.32};
		
		//sorting String array 'names'
		Arrays.sort(names);
		
		int i=1;
		System.out.println("After sorting String array");
		for(String name:names)
			System.out.println("item"+i+++" - "+name);
		
		//sorting int array 'intNumbers'
		Arrays.sort(intNumbers);
				
		i=1;
		System.out.println("After sorting int array");
		for(int num:intNumbers)
			System.out.println("item"+i+++" - "+num);
				
		//sorting double array 'doubleNumbers'
		Arrays.sort(doubleNumbers);
				
		i=1;
		System.out.println("After sorting double array");
		for(double num:doubleNumbers)
			System.out.println("item"+i+++" - "+num);	
		
		
	}
	

}
