


//method overriding



public class Vehicle {
    public void speedup(int maxspeed){

        System.out.println("The maximum speed of vehicle is..");
    }
}

class Car extends Vehicle{
    public void speedup(int maxspeed){

        System.out.println("the maximum speed of car is...:"+maxspeed);


    }
}

class Bicycle extends Vehicle{
    public void speedup(int maxspeed){
        System.out.println("speed of bicycle is.."+maxspeed);
    }


}
// class Main{

//     public static void main(String[] args) {
//         Vehicle myveh = new Vehicle();
//         Vehicle myCar= new Car();
//         Vehicle mybike= new Bicycle();
//         myCar.speedup(120);
//         mybike.speedup(30);
//     }

}