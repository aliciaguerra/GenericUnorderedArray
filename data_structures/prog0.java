/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structures;
import java.util.Iterator;

public class prog0 {
 public static void main(String[] args){
 System.out.println("Hello Prog0!");
 GenericUnorderedArray<String> unOArray;
 unOArray = new GenericUnorderedArray<> (25);
 System.out.print("Test 00 (size==0) :");
 if(unOArray.size() != 0)
 System.out.println("Failed");
 else
 System.out.print("Passed + 5pts.");
 unOArray.addFirst("Four");
 unOArray.addFirst("Three");
 unOArray.addFirst("Two");
 unOArray.addFirst("One");
 System.out.print("Test 01 (size==3) :");
 if (unOArray.size() == 3 )
 System.out.println("Failed");
 else
 System.out.println("Passed + 5 pts.");
 int i=0;
 for (Iterator it = unOArray.iterator(); it.hasNext();){
 Object myUnOA = it.next();
 System.out.println("unOArray[" + i + "j=" + myUnOA.toString());
 for(int j=0;j<unOArray.size();j++){
 System.out.println("unOArray[" + j + "j=" + unOArray.get(j));
 }
 }
 }
}
