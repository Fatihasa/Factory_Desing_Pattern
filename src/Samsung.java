public class Samsung implements Phone{

    private String screenSize = "";
    private int prize;
    private String modelVersion = "";

    public Samsung() {
        properties();
    }

    @Override
    public void properties() {

        screenSize = "5.8";
        prize = 2000;
        modelVersion = "S8";
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "screenSize='" + screenSize + '\'' +
                ", prize=" + prize +
                ", modelVersion='" + modelVersion + '\'' +
                '}';
    }
}
