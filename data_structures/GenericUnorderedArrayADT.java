/*  Your name
    Your masc account number
*/

package data_structures;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author steve_000
 * @param <E>
 */
public interface GenericUnorderedArrayADT<E> extends Iterable<E> {   
        public static final int DEFAULT_MAX_CAPACITY = 100;
//  Adds the Object obj to the end of list.  
    public void addLast(E obj);  
//  Adds the Object obj to the beginning of list
    public void addFirst(E obj);    
    //  Removes and returns the parameter object obj in first position in list if the list is not empty,  
//  null if the list is empty. The ordering of the list is preserved.
    public E removeFirst();    
//  Removes and returns the parameter object obj in last position in list if the list is not empty, 
//  null if the list is empty. The ordering of the list is preserved.
    public E removeLast();             
    //  The list is returned to an empty state.
    public void clear();
//  Returns true if the array is empty, otherwise false
    public boolean isEmpty();
//  Returns the number of Objects currently in the array.
    public int size();   
//  Returns an Iterator of the values in the list, presented in
//  the same order as the underlying order of the list. (position #1 first)
    public Iterator<E> iterator();   
}
