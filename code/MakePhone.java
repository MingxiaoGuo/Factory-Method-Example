package Factory;

/**
 * Created by Marshall on 12/11/2015.
 * Creator
 */
public abstract class MakePhone {

    public abstract void buildCPU();
    public abstract void buildROM();

    public void buildPhone() {
        buildCPU();
        buildROM();
    }
}
