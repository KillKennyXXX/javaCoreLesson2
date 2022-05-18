public class HomeWorkApp2 {

    public static void main(String[] args) {
        System.out.println( checkSum(3,5));
        printInt(5);
        System.out.println(checkInt(-5));
        printStrX("Хорошего дня",5);
        System.out.println(checkYear(2004));
    }

    public static boolean checkSum(int x, int y) {
        boolean checkI = (x + y >= 10 && x + y <= 20);
        //System.out.println("x: " + x + ", y: " + y + ", check: " + checkI);
        return checkI ;
    }

    public static void printInt(int x) {
        String checkStr ;
        if(x >= 0)
            checkStr = "положительное";
        else
            checkStr = "отрицательное";

        System.out.println("x: " + x +  ", число " + checkStr +  ".");
        return ;
    }
    public static boolean checkInt(int x) {
        boolean checkI = !(x>=0);
       // System.out.println("x: " + x +  ", check: " + checkI);
        return checkI ;
    }
    public static void printStrX(String str,int x ) {
        for (int i=0;i<x;i++){
            System.out.println(str);
        }

        return ;
    }

    public static boolean checkYear( int year ) {
        if (year % 400 == 0) return true;
        else if  (year % 100 == 0) return false;
        else if  (year % 4 == 0) return true;
        return false;
    }

}
