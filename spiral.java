import java.util.*;
class spiral
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    
    int startRows=0,endRows,startCol=0,endCol,counter=1;
    System.out.println("Input");
    int endr=sc.nextInt();
    int endc=sc.nextInt();
    int mat[][]=new int[endr][endc];
    endRows=endr-1;
    endCol=endc-1;
    while (startRows <= endRows && startCol <= endCol){
    for (int i = startCol; i <= endCol; i++){
        mat[startRows][i] = counter;
        counter++;
    }
    startRows++;

    for (int j = startRows; j <= endRows; j++){
        mat[j][endCol] = counter;
        counter++;
    }
    endCol--;

    if (startRows > endRows) {
        break;
    }
    for (int l = endCol; l >= startCol; l--){
        mat[endRows][l] = counter;
        counter++;
    }
    endRows--;

    if (startCol > endCol) {
        break;
    }
    for(int y = endRows; y >= startRows; y--){
        mat[y][startCol] = counter;
        counter++;
    }
    startCol++;
}

    for(int i=0;i<endr;i++) 
    {
        for(int j=0;j<endc;j++)
        {
           System.out.print(" \t" +mat[i][j]);
        }
        System.out.println();
    }
 }
}