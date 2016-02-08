
public class Objective14 {
    public static void main(String args[]){
        int num=0;
        int leng = (int)(Math.random()*20);
        int marks[] = new int[leng];
        for (int i = 0; i < marks.length ; i++) {
            marks[i]=(int)(Math.random()*10);
        }
        for (int k = 0; k < marks.length ; k++) {
            System.out.print(k+"-"+marks[k] + " ");

        }
        for (int j = 0; j <marks.length ; j++) {
            int max = marks[0];
            if(max<marks[j]){
                num=j;}
        }
        System.out.println("Max number index is - "+num);
    }

}