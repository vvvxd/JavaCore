public class IfSample {
    public static void main(String args[]) {
        int x, у;
        x = 10;
        у = 20;
        if (x < у) System.out.println("x меньше у ");
        x = x * 2;
        if (x == у) System.out.println("x теперь равно у");
        x = x * 2;
        if (x > у) System.out.println("x теперь больше у");
        if (x == у) System.out.println("вы не увидите э того");
    }
}
