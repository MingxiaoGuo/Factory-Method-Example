package Factory;

/**
 * Created by Marshall on 12/11/2015.
 */
public class Sumsung extends MakePhone{

    public void buildCPU() {
        new SumsungCPU().showCPU();
    }

    public void buildROM() {
        new SumsungROM().showROM();
    }
}
