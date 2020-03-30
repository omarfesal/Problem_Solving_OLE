package CodeSignal;

public class shapeArea {

    public static void main(String[] args) {

        System.out.println(shapeArea(100));

    }



    static int shapeArea(int n) {
        int result = 0 , counter = 1;
        for (int i = 0; i < n ; i++) {
            if(i==n-1)
                result+= counter;
            else{
                result += counter*2;
                counter+=2;
            }
        }
        return result;
    }


}

