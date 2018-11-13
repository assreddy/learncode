package Arrays.Matrixs;

public class TwoDimArray {

  public static void printMartix( int[][] mat , int r, int c){
    int i,j;
    for(i=0; i<r; i++ ){
      for(j=0; j<c; j++){
        System.out.print(mat[i][j] +" ");
      }
      System.out.println();

    }

  }

  public static void main(String args[]){

    int[] row = new int[3];
    int[] col = new int[3];

    int[][] mat = { {1, 0, 0, 1},        {0, 0, 1, 0},        {0, 0, 0, 0},};


    for(int i=0; i< row.length; i++){
      System.out.println(row[i]);
    }

    System.out.println("======================");
    for(int i=0; i< col.length; i++){
      System.out.println(col[i]);
    }

    for(int i=0; i<row.length; i++){
      for(int j=0; j< col.length;j++){
        if(mat[i][j] == 1){
          row[i] = 1;
          col[j] = 1;
        }
      }
    }

    for(int i=0; i< row.length ; i++){
      for(int j=0; j<col.length;j++){
        if(row[i] == 1|| col[j] == 1){
          mat[i][j]=1;
        }
      }
    }

    printMartix(mat, 3,3);

  }


}


