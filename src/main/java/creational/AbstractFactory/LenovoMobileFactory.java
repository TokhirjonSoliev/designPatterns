package creational.AbstractFactory;

public class LenovoMobileFactory extends MobileFactory{
    Lenovo createLenovoMobile(){
        return new Lenovo();
    }
}
