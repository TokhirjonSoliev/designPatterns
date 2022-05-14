package creational.singleton;

public class Singleton {
    //Eager Initialization
    //Below instance is guaranteed to be thread safe.

    private static Singleton uniqueInstance= new Singleton();

    private Singleton() { }

    public static Singleton getInstance() {

        //We have already got an instance, so just return it.

        return uniqueInstance;

    }
}
