/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;
import java.io.*;
/**
 *
 * @author mafor5845
 */
public class JavaApplication9 {
    
    /**
     * @param str the command line arguments
     * @throws java.io.IOException
     */
        // TODO code application logic here



  public static void main (String str[]) throws IOException {
    int[] elements = {1, 6, 7, 3, 6, 4, 5, 10, 12, 9, 8};
    
    //Moves "boundary" of unsorted array
    for (int j = 0; j < elements.length -1; j++)
    {
      //Finds the minimum element in the array
      int minIndex = j;
      for (int k = j + 1; k < elements.length; k++)
      {
        if (elements[k] < elements[minIndex])
        {
          minIndex = k;
        }
      }
      //Swap the minimum element with the first element
      int temp = elements[j];
      elements[j] = elements[minIndex];
      elements[minIndex] = temp;
    }
    
    for (int num : elements)
    {
      System.out.println(num);
    }
  }
}
