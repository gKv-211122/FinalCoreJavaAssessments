package finalassignment;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.*;

public class Ques7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1, 2, 3, 4, 3, 3, 2, 2, 1, 1};
		
		
		 
	       /**
	        * Using Java HashMap
	        */
	 
	        Map<Integer, Integer> arrMap = new HashMap<>();
	 
	        //Traverse an array 
	        for(int i = 0; i < arr.length; i++) {
	            /*
	              if element exists in a map, then increment it's count by 1,
	              otherwise assigned a value 1
	            */ 
	            if(arrMap.containsKey(arr[i])) {
	                arrMap.put(arr[i], arrMap.get(arr[i]) + 1);
	            } else {
	               arrMap.put(arr[i], 1);
	            }
	      }
	 
	       Set<java.util.Map.Entry<Integer, Integer>> entry = arrMap.entrySet();
	 
	       /*
	        *Traverse the map, If any key has value greater than 1
	        *It means, it is duplicate element in an array
	        */ 
	       for(java.util.Map.Entry<Integer, Integer> ent: entry) {
	 
	          if(ent.getValue() > 1) {
	             System.out.println(ent.getKey());
	          }
		

	       }

	}

}
