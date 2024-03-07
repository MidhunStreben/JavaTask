interface Animal{
    public void Bark();

}


public class Pig implements Animal {
    public void Bark(){
        System.out.println("the Dog is barking");
    }
    


    public static void main(String[] args) {
        Pig mydog=new Pig();
        mydog.Bark();
    }
}


