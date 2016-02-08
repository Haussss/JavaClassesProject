
public class Objective21 {
    public static void  main(String args[]){
        String str = "";
        StringBuilder str1 = new StringBuilder();
        long d = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            str+="one circle";
        }
        long d2 = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            str1.append("one circle");
        }
        long d3 = System.currentTimeMillis();
        System.out.println((d2-d)+" milliseconds");
        System.out.println((d3-d2)+" milliseconds");
    }
}
