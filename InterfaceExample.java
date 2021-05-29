interface Animal
{
    void animalEat();
} 

class Cow implements Animal
{
    public void animalEat()
    {
        System.out.println("Cow eats Grass");
    }
}

class Lion implements Animal
{
    public void animalEat()
    {
        System.out.println("Lion eats Meat");
    }
}

class InterfaceExample
{
    public static void main(String[] args)  
    {
        Animal cow = new Cow();
        cow.animalEat();

        Animal lion = new Lion();
        lion.animalEat();
    }
}