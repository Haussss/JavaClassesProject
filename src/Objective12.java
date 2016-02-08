
public class Objective12 {
    public static void main(String[] args){
        int x=8945;
        String str= "";
        do{
        int a= x%1000;
        x=x/1000;
        str = a + " " + str;}
        while(x%1000>0);
        System.out.println(str);
    }
}
