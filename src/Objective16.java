public class Objective16 {
    public static void main(String args[]){
        int temp=0;
        int leng = (int)(Math.random()*10);
        int mas[] = new int[leng];
        for (int i = 0; i < mas.length-1 ; i++) {
            mas[i]=(int)(Math.random()*10);
        }
        for (int z = 0; z < mas.length ; z++) {
            System.out.print(mas[z] + " ");

        }
        System.out.println(" ");
        int x=mas.length;
        for (int j = 0; j < mas.length/2 ; j++) {
            temp=mas[j];
            mas[j]=mas[mas.length-j-1];
            mas[mas.length-j-1]=temp;

        }
        for (int z = 0; z < mas.length ; z++) {
            System.out.print(mas[z] + " ");
        }
    }
}