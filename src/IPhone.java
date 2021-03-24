public class IPhone implements Phone{

    private String screenSize = "";
    private int prize;
    private String modelVersion = "";

    public IPhone() {
        properties();
    }

    @Override
    public void properties() {

        screenSize = "4.7";
        prize = 3500;
        modelVersion = "8";
    }

    @Override
    public String toString() {
        return "IPhone{" +
                "screenSize='" + screenSize + '\'' +
                ", prize=" + prize +
                ", modelVersion='" + modelVersion + '\'' +
                '}';
    }
}
