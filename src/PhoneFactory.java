public class PhoneFactory {

    public Phone getPhone(String model){

        if(model == null){
            return null;
        }else if (model.equals("samsung")){
            return new Samsung();
        }else if (model.equals("iphone")){
            return new IPhone();
        }

        return null;
    }
}
