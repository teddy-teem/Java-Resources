import designpattersn.buider.Phone;

public class PhoneShop {
    public static void main( String a[]){
        Phone phone = new PhoneBuilder().setOs("iOS").setBattary(4100).getPhone();
        System.out.println(phone);
    }
}