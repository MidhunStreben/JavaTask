//method overriden

/**
 * Baccount
 */
public class Baccount {



    public void deposite(int balance){
        System.out.println("deposite amount :"+balance);

    }

    public void withdrawal(int balace){
        System.out.println("the amount want to widthdraw");
    }




}


class SavingsAaccount extends Baccount{

    public void withdrawal(int balance){
        if(100<balance){
            System.out.println("you can withdraw the money");
        }else{
            System.out.println("cannot widthraw money");
          
        }
    }
}


class Main{
    public static void main(String[] args) {
        Baccount o1=new Baccount();
        Baccount o2=new SavingsAaccount();
        o1.deposite(1200);
        
        o2.withdrawal(101);
    }
}