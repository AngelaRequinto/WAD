/*
 LinearSearch.java
 Angela Mikaela R. Requinto
 Bsis-2
 Github.com/AngelaRequinto
 September 8,2016
 */

import java.util.Scanner;
import java.util.Random;

   public class LinearSearch{ 

           private int []array;
           private int search;
           private int size;

        private LinearSearch (int num ){

              Size=num;
              array=new int [size];


}

        public void Input(){

             Scanner input=new Scanner(System.in);
             for(i=0;i<size;i++){
                 Random rand = new Random();
                 array[i]= rand.nextInt(1000);
                    System.out.println("Enter number to find: ");
                        search= input.nextInt();
         }



}
        public void SearchNumber(){
              for (i=0;i<size;i++){
                  if (array[i]==search)
                      System.out.println("FOUND: "+search+" is at "+" array["+i+"]");
                          break;
         }
            if (i==size)
                System.out.println("NOT FOUND: "+search+" is not in the array.");

}
      public static void main(String[]args){

           Scanner input =new Scanner(System.in);
           int value=0;
              System.out.println("Enter array size: ");
                value=input.nextInt();
            LinearSearch LinearSearch=new LinearSearch(value);
             LinearSearch.Input();
             LinearSearch.SearchNumber();
}


}
