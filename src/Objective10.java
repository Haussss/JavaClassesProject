
public class Objective10 {

    public static void main(String[] args){
        int x=589654;
        int max=0;
        int sum=0;
        do{
            sum+=x%10;
            if (max<x%10){
                max=x%10;
            }
            x=x/10;
    }while(x/10>0);
        if(x/10==0){
            sum+=x;
            if (max<x){max=x;}
        }
        System.out.println(sum+" max = "+max);
    }
}

