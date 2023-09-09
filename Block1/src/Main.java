
public class Main {
    public static void main(String[]args){
        System.out.println(convert(x: 5));
        System.out.println(convert(x: 3));
        System.out.println(convert(x: 8));
        System.out.println();



    }
    public static String convert(int x){
        String a = String.format("%4f", x * 3.87541);
        return a;
    }
}