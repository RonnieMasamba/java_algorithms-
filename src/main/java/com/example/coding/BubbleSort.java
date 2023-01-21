package com.example.coding;

public class BubbleSort {

      public static void main(String[]args){

          int [] salaries ={2143,15400,1300,147,15,-278};
          sortSalaries(salaries);
          for(int i=0; i<salaries.length;i++){
             System.out.print(salaries[i]+",");
          }
      }

    private static void sortSalaries(int[] salaries) {
          for (int i=0;i<salaries.length-1;i++){

              boolean isSwap =false;
              //Swap
              for(int j=0; j<salaries.length-1-i;j++){
                  if(salaries[j]>salaries[j+1]){
                      int temp = salaries[j];
                      salaries[j]=salaries[j+1];
                       salaries[j+1]=temp;
                       isSwap=true;
                  }
              }
              if (!isSwap){
                  break;
              }
          }
    }

}
