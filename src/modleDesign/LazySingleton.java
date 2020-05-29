package modleDesign;

/**
 * 懒汉式单例模式
 */
public class LazySingleton {
    //声明一个实例却不创建他，在使用时才进行创建
    private static LazySingleton lazySingleton;

    //私有化构造方法，确保只能创建一次
    private LazySingleton(){
        System.out.println(Thread.currentThread().getName()+"懒汉单例的构造方法");
    }

    public static LazySingleton getInstance(){
        if(lazySingleton == null){
            return new LazySingleton();
        }
        return lazySingleton;
    }

}
