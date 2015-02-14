/*
**Alicia Guerra
**Professor Steve Price
**CS 310: Data Structures
**masc 0879
*/
package data_structures;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class GenericUnorderedArray<E> implements GenericUnorderedArrayADT<E> {
    private int currentSize, maxSize;
    private E[] storage;

    public GenericUnorderedArray() {
    currentSize=0;
    maxSize=DEFAULT_MAX_CAPACITY;
    storage=(E[]) new Object[DEFAULT_MAX_CAPACITY];
}

public GenericUnorderedArray(int size){

/*Adds the Object obj to the end of the list.*/
    public void addLast(E obj){
if(currentSize==maxSize){
/*If there's no space, we double the capacity via the
growStorage method.*/
growStorage();
storage[currentSize++]=obj;
}
}

/*Adds the Object obj to the beginning of the list.*/
public void addFirst(E obj){
/*Valid index, we have to make sure we have space.*/
if(currentSize==maxSize){
/*If there's no space, we double the capacity via the
growStorage method.*/
growStorage();
/*To add an object to the beginning of the list, we 
have to shift elements to the right one position.*/
for(int i=currentSize-1;i>=1;i--){
storage[i+1]=storage[i];
storage[0]=theStorage;
currentSize++;
}

public void growStorage(){
        if (currentSize == maxSize) {
            setMaxSize(maxSize * 2);
        } 
        else if (currentSize <= maxSize / 4) 
        {
            setMaxSize(maxSize / 2);
        }
        E[] tempStorage = (E[]) new Object[maxSize];
        for (int i = 0; i < currentSize; i++) {
            tempStorage[i] = storage[i];
        }
        storage = tempStorage;
    }
 private void setMaxSize(int size) {
        maxSize = size;
    }

/*Removes and returns the parameter Object obj in the first position of the list
if the list is not empty, null if the list is empty. The ordering of the list
is preserved.*/
public E removeFirst(){
if(currentSize==0){
return null;
E tempStorage=storage[0];
for(int i=currentSize;i>1;i--){
storage[i]=storage[i-1];
}
currentSize--;
}
return tempStorage;
}
/*Removes and returns the parameter object obj in the last position if the list
is not empty, null if empty. The ordering of the list is preserved.*/
public E removeLast(){
}

/*The list is returned to an empty state.*/
public void clear(){
currentSize=0;
}

/*Returns true if the array is empty, otherwise false.*/
public boolean isEmpty(){
return currentSize==0;
}

/*Returns the number of objects currently in the array.*/
public int size() {
return currentSize;
}

/*Returns an iterator of the values in the list, presented in the
same order as the underlying order of the list.*/
public Iterator<E> iterator() {
        return new IteratorHelper();
    }

    class IteratorHelper implements Iterator<E> {

        int iterIndex;

        public IteratorHelper() {
            iterIndex = 0;
        }

        public boolean hasNext() {
            return iterIndex < currentSize;
        }

        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return storage[iterIndex++];
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }