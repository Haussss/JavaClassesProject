
public class time {
    private int s;
    private int m;
    private int h;
    public time(int s){
        this.s=s;
    }
    public time(int h, int m, int s){
        this.h=h;
        this.m=m;
        this.s=s;
    }
    public int toSeconds(){
        s=s+((h*60+m)*60);
        h=0;
        m=0;
        return s;

    }
    public int compareTo(time t){
        return this.s+((this.m+this.h*60)*60)-t.toSeconds();
    }
    @Override
    public String toString(){
       return this.h+" hours "+this.m+" minutes "+this.s+" seconds";
    }
}
