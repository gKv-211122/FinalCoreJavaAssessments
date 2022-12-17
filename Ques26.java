package finalassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.StringJoiner;
import java.util.stream.Collectors;

class Product {
	
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }

	public int getId() {  
        return id;  
    }

	public String getName() {  
        return name;  
    }

	public float getPrice() {  
        return price;  
    }
}

public class Ques26 {

	public void optionalClassMethods() {

		String[] str = new String[10];

		str[5] = "JAVA OPTIONAL CLASS ";

		Optional<String> checkNull = Optional.ofNullable(str[5]);

		if (checkNull.isPresent()) { // check for value is present or not

			String lowercaseString = str[5].toLowerCase();
			System.out.print(lowercaseString);

		} else
			System.out.println("string value is not present");

		// It returns an empty instance of Optional class
		Optional<String> empty = Optional.empty();
		System.out.println(empty);

		// It returns a non-empty Optional
		Optional<String> value = Optional.of(str[5]);

		// If value is present, it returns an Optional otherwise returns an empty
		// Optional
		System.out.println("Filtered value: " + value.filter((s) -> s.equals("Abc")));
		System.out.println("Filtered value: " + value.filter((s) -> s.equals("JAVA OPTIONAL CLASS EXAMPLE")));

		// It returns value of an Optional. if value is not present, it throws an
		// NoSuchElementException
		System.out.println("Getting value: " + value.get());

		// It returns hashCode of the value
		System.out.println("Getting hashCode: " + value.hashCode());

		// It returns true if value is present, otherwise false
		System.out.println("Is value present: " + value.isPresent());

		// It returns non-empty Optional if value is present, otherwise returns an empty
		// Optional
		System.out.println("Nullable Optional: " + Optional.ofNullable(str[5]));

		// It returns value if available, otherwise returns specified value,
		System.out.println("orElse: " + value.orElse("Value is not present"));
		System.out.println("orElse: " + empty.orElse("Value is not present"));

		value.ifPresent(System.out::println); // printing value by using method reference

	}

	public void paralleSortDemo() {

		/** ParallelSort */

		// Creating an integer array
		int[] arr = { 5, 8, 1, 0, 6, 9 };
		// Iterating array elements
		for (int i : arr) {
			System.out.print(i + " ");
		}
		// Sorting array elements parallel
		Arrays.parallelSort(arr);
		System.out.println("\nArray elements after sorting");
		// Iterating array elements
		for (int i : arr) {
			System.out.print(i + " ");
		}

		int[] arr1 = { 5, 8, 1, 0, 6, 9, 50, -3 };

		Arrays.parallelSort(arr1, 0, 4);
		System.out.println("\nArray elements after sorting");
		// Iterating array elements
		for (int i : arr1) {
			System.out.print(i + " ");
		}

	}

	public void stringJoinerDemo() {

		// StringJoiner joinNames = new StringJoiner(","); // passing comma(,) as
		// delimiter

		StringJoiner joinNames = new StringJoiner(",", "[", "]"); // passing comma(,) and square-brackets as delimiter

		// Adding values to StringJoiner
		joinNames.add("Rahul");
		joinNames.add("Raju");
		joinNames.add("Peter");
		joinNames.add("Raheem");

		System.out.println(joinNames);

		StringJoiner joinNames2 = new StringJoiner(":", "[", "]"); // passing colon(:) and square-brackets as delimiter

		// Adding values to StringJoiner
		joinNames2.add("java");
		joinNames2.add("core");

		// Merging two StringJoiner
		StringJoiner merge = joinNames.merge(joinNames2);
		System.out.println(merge);

		// Prints nothing because it is empty
		System.out.println(joinNames);

		// We can set default empty value.
		joinNames.setEmptyValue("It is empty");
		System.out.println(joinNames);

		// Adding values to StringJoiner
		joinNames.add("Rahul");
		joinNames.add("Raju");
		System.out.println(joinNames);

		// Returns length of StringJoiner
		int length = joinNames.length();
		System.out.println("Length: " + length);

		// Returns StringJoiner as String type
		String str = joinNames.toString();
		System.out.println(str);

		// Now, we can apply String methods on it
		char ch = str.charAt(3);
		System.out.println("Character at index 3: " + ch);

		// Adding one more element
		joinNames.add("Sorabh");
		System.out.println(joinNames);

		// Returns length
		int newLength = joinNames.length();
		System.out.println("New Length: " + newLength);
	}

	public static void main(String[] args) {
		
		
		List<Product>productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        
        Long noOfElements = productsList.stream()  
                               .collect(Collectors.counting());  
        
        System.out.println("Total elements : "+noOfElements);  
        
        Double average = productsList.stream()  
                .collect(Collectors.averagingDouble(p->p.price));  
        
        System.out.println("Average price is: "+average); 
        
        Double sumPrices =  
        productsList.stream().collect(Collectors.summingDouble(x->x.price));  // collecting as list  
        System.out.println("Sum of prices: "+sumPrices);  
        
        Integer sumId =   
        productsList.stream().collect(Collectors.summingInt(x->x.id));  
        System.out.println("Sum of id's: "+sumId);  
        
        
        Set<Float>productPriceList =   productsList.stream()  
                    .map(x->x.price)         // fetching price  
                    .collect(Collectors.toSet());   // collecting as list  
        
        System.out.println(productPriceList);  
  

	}

}
