package ie.tudublin;

public class Cat extends Animal
{
    private int numLives = 9;

    public void setNumLives(int lives)
    {
        this.numLives = lives;
    }
    public int getNumLives()
    {
        return numLives;
    }

    public void kill()
    {
        while(numLives > 0)
        {
            numLives = numLives -1;
            if(numLives >= 0)
            {
                System.out.println("Ouch, I only have " + numLives + " left");
            }
        }
        System.out.println("Dead");
    }

    public void speak()
    {
        System.out.println("Meow!");
    }
}