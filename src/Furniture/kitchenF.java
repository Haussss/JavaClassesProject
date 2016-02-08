package Furniture;

public class kitchenF extends furniture{


    public kitchenF(String madeBy, int power) {
        super(madeBy, power);
    }

    public String isItWorks(){
        if(super.getIsOn()){
            return "it works";
        }else return "it doesn't work";
    }

    @Override
    public String toString(){
        return super.toString()+"\n"+" "+isItWorks();
    }
}

