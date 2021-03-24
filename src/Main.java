public class Main {
    public static void main(String[] args) {

        PhoneFactory phoneFactory = new PhoneFactory();
        Phone phone1 = phoneFactory.getPhone("samsung");
        Phone phone2 = phoneFactory.getPhone("iphone");

        System.out.println(phone1.toString()+ "\n" + phone2.toString());
    }
}
