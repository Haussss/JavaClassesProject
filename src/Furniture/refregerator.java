package Furniture;

public class refregerator extends kitchenF {
    private boolean buildIn;
    private String color;
    public refregerator(String madeBy, int power) {
        super(madeBy, power);
    }

    public String  setColor(String c){
        return this.color = c;
    }
    public void getColor(){
        System.out.println("color: "+this.color);
    }

    public boolean setBuildIn(){
        return this.buildIn = true;
    }


    @Override
    public String toString(){
        return super.toString()+"\n"+" is it build-in "+buildIn+" "+color;
    }

}
