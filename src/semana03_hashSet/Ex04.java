package semana03_hashSet;

import java.util.HashSet;
public class Ex04 {
    public static void main(String[] args) {
        HashSet<String> cpfs = new HashSet<>();
        cpfs.add("00123456789");
        cpfs.add("12345678901");
        cpfs.add("33001234567");

        System.out.println(cpfs);
        cpfs.remove("12345678901");
        System.out.println(cpfs);
    }
}
