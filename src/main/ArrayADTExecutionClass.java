/*   Created by IntelliJ IDEA.
 *   Author: Ompal Singh (Ompal-Singh)
 *   Date: 9/30/2021
 *   Time: 6:49 PM
 *   File: ArrayADTExecutionClass.java
 */

package main;

import implementation.ArrayADTImplementationClass;

public class ArrayADTExecutionClass {
    public static void main(String[] args) {
        int size = 10;
        ArrayADTImplementationClass object = new ArrayADTImplementationClass(size);
        object.traverse();
        if(object.insert(234)){
            System.out.println("insert successfully");
        } else {
            System.out.println("array full");
        }
        object.traverse();
        object.insert(12);
        object.insert(343);
        object.insert(245);
        object.insert(98);
        object.traverse();
        object.insert(12345);
        object.traverse();
        object.delete();

        if(object.search(98)) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
        int[] arr = object.sort();
        System.out.println("Printing Elements....");
        for (int i = 0; i < object.getEnd(); i++) {
            System.out.print(arr[i]);
            if (i != object.getEnd() - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        System.out.println("printing original array");
        object.traverse();
    }
}
