package day4;

public class ExplicitTypeCasting {

    public static void main(String[] args) {
        double d = 120.45;
        float f = (float) d;
        long L = (long) f;
        int i = (int) L;
        short s = (short) i;
        byte b = (byte)  s;

        System.out.println(d);
        System.out.println(f);
        System.out.println(L);
        System.out.println(i);
        System.out.println(s);
        System.out.println(b);


    }
}
