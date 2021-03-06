package my.functionnal.methodreference;

// 方法引用和 Runnable 接口结合使用

class Go {
    static void go() {
        System.out.println("Go::go()");
    }
}

public class RunnableMethodReference {
    public static void main(String[] args) {
        
        new Thread(new Runnable() {
            public void run() {
                System.out.println("Anonymous");
            }
        }).start();
        
        new Thread(
            () -> System.out.println("lambda")
        ).start();

        new Thread(Go::go).start();
    }
}
