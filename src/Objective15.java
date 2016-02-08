public class Objective15 {
    public static void main(String args[]) {
        int summ=0;
        int minIndex=0;
        int maxIndex=0;
        int leng = (int)(Math.random()*20);
       // int mas[] = new int[]{4,2,3,1,5,6,7,8,9,};
        int mas[] = new int[leng];
        for (int i = 0; i < mas.length ; i++) {
            mas[i]=(int)(Math.random()*10);
        }
        for (int z = 0; z < mas.length ; z++) {
            System.out.print(mas[z] + " ");

        }

        int min = mas[0];
        for (int k = 0; k < mas.length; k++) {
            if(min>mas[k]){
                min=mas[k];
                minIndex=k;
            }
        }
        int max = mas[0];
        for (int j = minIndex; j < mas.length; j++) {
            if(max<mas[j]){
                max=mas[j];
                maxIndex=j;

            }
        }
        System.out.print("Min = " + mas[minIndex]+" ");
        System.out.println("Max = " + mas[maxIndex]);
        for (int v = (minIndex+1); v < maxIndex ; v++) {
            summ += mas[v];
        }
        System.out.println("Summ "+summ);
    }
}