package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet
{	
	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
    }
    
    float playerX = 200;
    float playerY = 100;
    float playerWidth = 50;

    void drawPlayer(float x, float y, float w)
    {
        
    }

    public void keyPressed()
	{
		if (keyCode == LEFT)
		{
			System.out.println("Left arrow pressed");
		}
		if (keyCode == RIGHT)
		{
			System.out.println("Right arrow pressed");
		}
		if (key == ' ')
		{
			System.out.println("SPACE key pressed");
		}
	}
	

}