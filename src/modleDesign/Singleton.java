package modleDesign;

public class Singleton {
    //加上volatile关键字，进制指令重排
    private static volatile Singleton singleton;
    //构造方法私有化，防止客户端随意创建
    private Singleton(){
        System.out.println(Thread.currentThread().getName()+"Singleton 构造方法");
    }
    public static Singleton getInstance(){
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                    return singleton;
                }
            }
        }
        return singleton;
    }
}
