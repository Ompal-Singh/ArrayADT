package adt;

public interface ArrayADTInterface {
    //insert at next index
    boolean insert(int element);
    //delete the last element and return that element
    int delete();
    //to print element of array
    void traverse();
    //search given element
    boolean search(int element);
    //sort the existing array
    int[] sort();
    //check for empty array
    boolean isEmpty();
}
