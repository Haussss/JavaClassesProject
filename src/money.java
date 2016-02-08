public class money {
    private int twenty;
    private int fifty;
    private int hundred;

    public money(int a, int b, int c){
        this.twenty=a;
        this.fifty=b;
        this.hundred=c;
    }
   public int addTwenty(int a){
       this.twenty=this.twenty+a;
       return this.twenty;
   }
    public int addFifty(int b){
        this.fifty=this.fifty+b;
        return this.fifty;
    }
    public int addHundred(int c){
        this.hundred=this.hundred+c;
        return this.hundred;
    }

    public boolean withdraw(int x){
        if((this.twenty*20+this.fifty*50+this.hundred*100)>x){
            if(x%100==20 || x%100==40 || x%100==50 || x%100==60 || x%100==70 || x%100==80 || x%100==90){
                 if(x>=100){
                    int count=0;
                     do{
                         if(this.hundred<=0){
                             break;
                         }
                    this.hundred--;
                    x=x-100;
                    count++;
                    }while(x>=100);
                System.out.println("100$ - "+count);
                }
                if(x>=50){
                     int count=0;
                     do{
                        if(this.fifty<=0){
                            break;
                        }
                    this.fifty--;
                    x=x-50;
                    count++;
                    }while(x>50);
                System.out.println("50$ - "+count);
                }
                if(x>=20){
                    int count=0;
                     do{
                        if(this.twenty<=0){
                            break;
                        }
                    this.twenty--;
                         x=x-20;
                    count++;
                    }while(x>0);
                System.out.println("20$ - "+count);
                }
            }
            else{
                System.out.println("Can't process this operation ");
                }
            return true;
        }
        else {
            System.out.println("Not enough cash ");
            return false;
        }
    }
    @Override
    public String toString(){
        return "Cash machine balance = "+((this.twenty*20)+(this.fifty*50)+(this.hundred*100)+"$");
    }
}
