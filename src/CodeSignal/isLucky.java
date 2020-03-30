package CodeSignal;

public class isLucky {
    public static void main(String[] args) {

        System.out.println(isLucky(2424));

    }

    boolean isLucky2(int n) {

        String s = n+"";
        int sum = 0;

        for(int i=0; i<s.length()/2; i++)
            sum+=( s.charAt(i) - s.charAt(s.length()-1-i ));

        return sum==0;
    }


    static boolean isLucky(int n) {
        String x = ""+n;
        String st1= x.substring(0, x.length()/2);
        String st2= x.substring( x.length()/2 );
//        System.out.println(st1+ "..........." +st2);
        int res1=0,res2=0;
        for (int i = 0 ;  i < x.length()/2 ;i++) {
            res1+=  st1.charAt(i);
            res2+=  st2.charAt(i);
//            System.out.println(res1 + "___" + res2);
        }
        return res1 == res2;
    }

}
