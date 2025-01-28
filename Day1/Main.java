import java.util.*;

class Types {
    byte by;
    short sh;
    int n;
    long l;
    float f;
    double d;
    boolean b;
    char c;

    Types(byte by,
    short sh,
    int n,
    long l,
    float f,
    double d,
    boolean b,
    char c){
        this.by = by;
        this.sh = sh;
        this.n = n;
        this.l = l;
        this.f = f;
        this.d = d;
        this.b = b;
        this.c = c;
    }
}

public class Main {
    // static byte by;
    // static short sh;
    // static int n;
    // static long l;
    // static float f;
    // static double d;
    // static boolean b;
    // static char c;
    
    public static void main(String[] args) {
        // System.out.println(by);
        // System.out.println(sh);
        // System.out.println(n);
        // System.out.println(l);
        // System.out.println(f);
        // System.out.println(d);
        // System.out.println(b);
        // System.out.println(c);
    
        
        // System.out.println("Changed Vars...");
        // by = 10;
        // sh = 66;
        // n = 102;
        // l = 202920292;
        // f = 192.2f;
        // d = 292.92892;
        // b = true;
        // c = 'c';
        
        // System.out.println(by);
        // System.out.println(sh);
        // System.out.println(n);
        // System.out.println(l);
        // System.out.println(f);
        // System.out.println(d);
        // System.out.println(b);
        // System.out.println(c);
        
        
        
        System.out.println();
        System.out.println("Using Class");

        Types t = new Types((byte)10, (short)66, 102290, 38929201, 192.3f, 293.18292, true, 'f');
        System.out.println(t.by);
        System.out.println(t.sh);
        System.out.println(t.n);
        System.out.println(t.l);
        System.out.println(t.f);
        System.out.println(t.d);
        System.out.println(t.b);
        System.out.println(t.c);
    }
}