package Furniture;

public class furniture {
    protected static int summPower;
    private boolean isOn;
    private int power;
    private String madeBy;
    public furniture(String madeBy, int power){
        this.madeBy=madeBy;
        this.power=power;

    }
    public boolean setIsOn(){
        return this.isOn=true;
    }

    public boolean getIsOn(){
        return this.isOn;
    }

    public int setPower(int x){
        return this.power=x;
    }

    public int getPower(){
        if(isOn==true){
        return this.summPower+=this.power;
        }
        else return 0;
    }

    public String setMadeBy(String str){
        return this.madeBy="made by"+str;
    }

    public void getMadeBy(){
        System.out.println(this.madeBy);
    }

    @Override
    public String toString(){
        return " is it on: " +this.isOn+"\n"+" it's power = "+this.power+"Watt"+"\n"
                +" made by :"+this.madeBy;
    }
}
