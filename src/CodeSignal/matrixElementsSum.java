package CodeSignal;

public class matrixElementsSum {

    public static void main(String[] args) {

    }


    int matrixElementsSum(int[][] matrix) {
        int hunted[] = new int[5];
        int result = 0;
        for(int i = 0 ; i < matrix.length ; i++){
            for(int x = 0 ; x < matrix[i].length ; x++){
                if(matrix[i][x] == 0){
                    hunted[x] = 1;
                    continue;
                }else if(hunted[x] != 1){
                    result+= matrix[i][x];
                }
            }
        }
        return result;
    }

}
