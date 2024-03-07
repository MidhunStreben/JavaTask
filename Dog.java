/**
 * Dog
 */
public class Dog {

    private String name;
    private String breed;

    public Dog(String name,String breed) {
        this.name=name;
        this.breed=breed;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }



    public static void main(String[] args) {

        Dog dog1 = new Dog("malu","german");
        Dog dog2 = new Dog("omana","rot");
        dog1.setName("mikku");
        dog2.setName("manu");

        System.out.println("Dog name:" + dog1.getName());
        System.out.println("Dog breed :"+dog1.getBreed());
        System.out.println("Dog Name :" + dog2.getName());
        System.out.println("Dog Breed :" + dog2.getBreed());


    }
}