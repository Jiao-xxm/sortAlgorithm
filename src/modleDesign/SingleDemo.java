package modleDesign;

public class SingleDemo {



        public static void main(String[] args) {
            for (int i = 0; i < 10; i++) {
//                new Thread(LazySingleton::getInstance,i+" ").start();
//                new Thread(Singleton::getInstance,i+" ").start();
                new Thread(HungerSingleton::getInstance,i+" ").start();


            }
        }
    }


