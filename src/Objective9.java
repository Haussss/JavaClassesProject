
public class Objective9 {
    public static void main(String[] args){
        int k=0;
        int max=0;
        int max1=0;
        int max2=0;
        int i=(int)(Math.random()*20);
        while (i!=0){
            System.out.print(i + " ");
            if(max2<max1&&k<i){
            max2=max1;
            }
            if(max1<max && k<i){
                max1=max;
            }
            if(max<=i){
                max=i;
            }
            k=i;
            i=(int)(Math.random()*20);

        }
        System.out.println("max= "+max+" max1= "+max1+" max2= "+max2);
    }
}
