package designpattersn.singleton;

class ABC {
    public void printInfo() {
        System.out.println("Hello, I am from ABC");
    }
    private static ABC abc = new ABC();
    private ABC(){};
    public static ABC getInstance() {
        return abc;
    }

}

public class SingletonMain {

    public static void main(String args[]) {
        ABC obj = ABC.getInstance();
        obj.printInfo();

    }
    
}
