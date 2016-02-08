package Furniture;

public class tv extends roomF {
    private String technology;

    public tv(String madeBy, int power) {
        super(madeBy, power);
    }

    public String setTechnologyPlasma(){
        return this.technology="plasma";
    }
    public String setTechnologyLCD(){
        return this.technology="LCD";
    }
    @Override
    public String toString(){
        return super.toString()+"\n"+"technology: "+technology;
    }
}
