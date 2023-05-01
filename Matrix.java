public class Matrix {
    public static void main(String[] args) {
        int [] [] matrixA ={
            {1, 2, 3, 4},
            {9, 5, 4, 6},
            {13, 43, 45, 23},
        };

        int c = 5 ;
        for(int zeilenIndex = 0; zeilenIndex <  matrixA.length; zeilenIndex++){
            for (int spaltenIndex = 0 ; spaltenIndex < matrixA[zeilenIndex].length;spaltenIndex++ ){
                matrixA[zeilenIndex][spaltenIndex] *= c;
            }

        }
        for( int [] zeile : matrixA){
            for(int element : zeile){
                System.out.print(element + " , ");
            }
            System.out.println();
            
        }
    }
    
}
