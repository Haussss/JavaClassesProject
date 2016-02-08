package Furniture;

public class kettle extends kitchenF {
    private String color;

    public kettle(String madeBy, int power) {
        super(madeBy, power);
    }

    public String  setColor(String c){
        return this.color = c;
    }
    public void getColor(){
        System.out.println("color: "+this.color);
    }

    @Override
    public String toString(){
        return super.toString()+"\n"+" "+color;
    }
}
