package Furniture;


public class roomF extends furniture{

    public roomF(String madeBy, int power) {
        super(madeBy, power);
    }

    public String isItWorks(){
        if(super.getIsOn()==true){
            return "it works";
        }else return "it doesn't work";
    }

    @Override
    public String toString(){
        return super.toString()+"\n"+" "+isItWorks();
    }

}