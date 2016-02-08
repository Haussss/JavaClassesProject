
public class Objective11 {
    public static void main(String[] args) {
        int x = 109;
        boolean a=true;
        for (int i = 2; i < x; i++) {
            if (x%i== 0) {
                a=false;
            }
        }
        if(a==true){
            System.out.println(x+" "+"- Simple number");
        }else if(a==false){
            System.out.println(x+" "+"- Not a simple number");
        }
    }

}

