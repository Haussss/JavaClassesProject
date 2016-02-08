
public class firstClass {
    public static void main(String[] args){
        int max=0;
        int max2=0;
        int max3=0;
        int x= (int)(Math.random()*20);
        while(x!=0){
            if(max<x){
                max3=max2;
                max2=max;
                max=x;
            }
            x= (int)(Math.random()*20);
        }
        System.out.print(max3+","+max2+","+max);
    }
}
