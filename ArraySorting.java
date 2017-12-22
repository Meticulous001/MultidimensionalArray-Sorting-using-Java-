/**
 
 * NAME:RAHEEM, Muiz Olalekan
 * 
 * MATRIC NUMBER: 15/52HA069
 * 
 * DEPARTMENT: COMPUTER SCIENCE
 * 
 * COURSE TITLE: CSC317(Data Structure and Algorithm)
 * 
  
 **/
package arraysorting;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author RAHEEM Muiz Olalekan
 */
public class ArraySorting {

      static  Scanner sc = new Scanner(System.in);   
    
      
      ///the main method
    public static void main(String[] args)
    {
        System.out.println("enter the array row size");
        int row = sc.nextInt();
        
        System.out.println("enter the array column size");
        int column = sc.nextInt();


        int array[][] = new int[row][column];
        
        fillArray(array);
        displayArray(array); ///this will display the array in as the user input the elements 
        
        System.out.println("    ");
        sort(array);
         displayArray(array); /// this will print the elements of the array when sorted
         
         sc.close();
    } ///end of the main method
    
    ///this will prompt the user to enter the elements of the array; row after row
    public static void fillArray(int[][] array)
    {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j <array[i].length; j++)
            {
              System.out.println("enter the element "+ "row "+(i+1) +" " +" column "+ (j+1));
              array[i][j] = sc.nextInt();
            }
        {
            
        }
        
    }
    
       
    
    ///this method sorts the rows then the columns
    public static void sort(int[][] arr)
    {
        for (int i = 0; i <arr.length; i++)
        {
            Arrays.sort(arr[i]); //this sorts the rows
        }
        
        ///to sort the column
        
        for (int i = 0; i < (arr.length-1); i++) 
            for (int j = i+1 ; j < arr.length; j++) 
                
            {     
              
                 /// this checks the first column of each row
                
                if (arr[i][0] > arr[j][0])
              
            {
                int[] tempArr = arr[i];
                arr[i]=arr[j];
                arr[j]= tempArr;
            }
            }
            
         
    }
        /// this function will display the elements of the array
          public static void displayArray(int[][] array)
    {
        for (int i = 0; i < array.length; i++) 
        {
            for (int j = 0; j < array[i].length; j++) 
            System.out.print(array[i][j] + " ");
            System.out.println();
        }
        
    }
        
                
    
}

