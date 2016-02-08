
public class Objective22 {
    public static void main(String args[]){
        time t = new time(8000);
        time t1= new time(2,15,21);
        System.out.println(t1);
        t1.toSeconds();
        System.out.println(t);
        System.out.println(t1);
        System.out.println(t.compareTo(t1));
        System.out.println(t1.compareTo(t));


    }

}
