package com.Palak;

public class MulTable {
    final static int ROWS = 20;
    final static int COLUMNS = 20;

    public static void main(String[] args) {
        int product[] [] = new int[ROWS][COLUMNS];
        int row, column;
        System.out.println("MULTIPLICATION TABLE");
        System.out.println(" ");
        int i,j;
        for(i =10;i < ROWS; i++){
            for(j =10; j<COLUMNS; j++){
                product [i][j] = i*j;
                System.out.print(" "+ product[i][j]);

            }
            System.out.println(" ");
        }






    }

}
