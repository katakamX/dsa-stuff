
import java.util.*;
class recursion {
    public static void main(String[] args) {
        message();
    }

    static void message() {
        System.out.println("hello world");
        message1();
    }

    static void message1() {
        System.out.println("hello world1");
        message2();
    }

    static void message2 () {
        System.out.println("hello world2");
        message();
    }
}
