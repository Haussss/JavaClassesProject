package Furniture;

public class phone extends roomF {
    private String construction = "old style";

    public phone(String madeBy, int power) {
        super(madeBy, power);
    }

    public String setConstructionWireless(){
        return this.construction="wirless phone";
    }
    @Override
    public String toString(){
        return super.toString()+"\n"+" "+construction;
    }
}
