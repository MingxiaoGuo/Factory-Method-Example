package Factory;

/**
 * Created by Marshall on 12/11/2015.
 * Concrete Product
 */
public class Apple extends MakePhone {

    @Override
    public void buildCPU() {
        new AppleCPU().showCPU();
    }

    @Override
    public void buildROM() {
        new AppleROM().showROM();
    }
}
