package designpattersn.factory;

import designpattersn.factory.phone.OperatingSystemFactory;
import designpattersn.factory.phone.OS;

public class FactoryMain {
    public static void main(String args[]) {
        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS os = osf.getInstance("Android");
        os.specification();
    }
}
