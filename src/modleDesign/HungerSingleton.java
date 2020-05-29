package modleDesign;

public class HungerSingleton {
    private static HungerSingleton hungerSingleton = new HungerSingleton();
    private HungerSingleton(){
        System.out.println(Thread.currentThread().getName()+"饿汉单例模式实例");
    }
    public static HungerSingleton getInstance(){
        return hungerSingleton;
    }
}
