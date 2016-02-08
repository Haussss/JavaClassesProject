
public class Objective13 {
    public static void main(String args[]){
        int x=110;
        boolean a=true;
        for (int i = 2; i < x; i++) {
            if (x%i==0){
                a=false;
                break;
            }
        }
        if(a==true){
            System.out.println(x+" "+"- Simple number");
        }else if(a==false){
            System.out.println(x+" "+"- Not a simple number");
        }
    }
}
