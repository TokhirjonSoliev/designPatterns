package creational.AbstractFactory;

public class SamsungMobileFactory extends MobileFactory{
    Samsung createSamsungMobile(){
        return new Samsung();
    }
}
