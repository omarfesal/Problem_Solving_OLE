package CodeSignal;

public class centuryFromYear {

    public static void main(String[] args) {
        System.out.println(centuryFromYear(1700));
    }

    static int centuryFromYear(int year) {
        return (int) Math.ceil(year/100d) ;
    }
}
