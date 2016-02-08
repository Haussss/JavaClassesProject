
public class Objective12noStr {
    public static void main(String args[]){
        int x=21231234;
        int count=0;
        int b,c,d,a;
        for (d = x; d>0 ;) {
            d=d/10;
            count++;
        }
        int count1 = count;
        for (int i = (count-1); i >0; i--) {
            a=1;
            for (int j = i; j > 0 ; j--) {
                a=a*10;
            }
            b=x;
            b = b%a;
            c = (x-b)/a;
            x=b;
            count1=count1-1;
            System.out.print(c);
            if(count1%3==0){
                System.out.print(" ");
            }
            if(x<10){
                System.out.print(x%10);
            }
        }
}}
