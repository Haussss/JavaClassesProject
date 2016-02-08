package Furniture;
public class aFurniture {
    public static void main(String args[]){
        kettle kettle = new kettle("Samsung",2000);
        phone phone=new phone("Philips",200);
        refregerator refregerator = new refregerator("Atlant",1500);
        tv tvSet = new tv("LG",1000);
        kettle.setIsOn();
        kettle.setColor("yellow");
        phone.setIsOn();
        refregerator.setIsOn();
        tvSet.setIsOn();
        phone.getPower();
        tvSet.getPower();
        refregerator.getPower();
        kettle.getPower();

        System.out.println(phone+"\n"+" Summary power = "+furniture.summPower);

    }
}
