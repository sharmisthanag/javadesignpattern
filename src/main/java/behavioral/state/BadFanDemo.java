package behavioral.state;

public class BadFanDemo {
    public static void main(String[] args) {
        fan_badstate fan=new fan_badstate();
        fan.pullChain();
        System.out.println(fan);
        fan.pullChain();
        System.out.println(fan);
        fan.pullChain();
        System.out.println(fan);
        fan.pullChain();
        System.out.println(fan);
    }
}
