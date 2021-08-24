package demo02;

public class Demo01MainThread {
    public static void main(String[] args) {
        Person p1=new Person("小强");
        p1.run();
        System.out.println(0/0);
        Person p2=new Person("旺财");
        p2.run();

    }
}
