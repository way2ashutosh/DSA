package core.programming.datastructures.sorting;

import java.util.Arrays;
import java.util.LinkedList;

public class Iprog {
    public static void main(String[] args)
    {
        // Create a LinkedList of Strings
        LinkedList<String> list = new LinkedList<String>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("date");
        list.add("elderberry");

        // Convert LinkedList to Array
        String[] array
                = list.toArray(new String[list.size()]);

        // Print the elements of the Array
        for (String fruit : array) {
            System.out.println(fruit);
        }

        //--------------------------------------------------------------------------------------------------

        // Converting LinkedList to Array
        Object[] objArray = list.toArray();
        // Convert Object[] to String[]
        String[] array1 = Arrays.copyOf(objArray, objArray.length,String[].class);
// Print the String Array
        System.out.println("Array: " + Arrays.toString(array1));
//--------------------------------------------------------------------------------------------------

    }



  /*  Exception Handling
    Validation
            HATEOAS*/
/*
- Spring Cloud config and Bus
- Load Balance with Ribbon and Feign
- Implement Name Server with Eureka
- Implement API Gateway with Zuul
- Distributed Traceing with Zipkin
- Fault Tolerance with Histrics
-*/





}
