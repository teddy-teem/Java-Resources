package designpattersn.factory.phone;

public class OperatingSystemFactory {
    public OS getInstance(String name) {
        if(name.compareTo("Android")==0) {
            return new Android();
        } else {
            return new IOS();
        }
    }
}
