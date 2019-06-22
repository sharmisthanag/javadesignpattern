package structural.flyweight;

public class test {

    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf(10);
        Integer i3 = Integer.valueOf(5);
        System.out.println(System.identityHashCode(i1));
        System.out.println(System.identityHashCode(i2));
        System.out.println(System.identityHashCode(i3));
    }
}
