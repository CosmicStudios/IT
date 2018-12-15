import java.util.Scanner;

public class abc {
	
	public static void solv(float a, float b, float c){
	    
        float sq = (float) Math.sqrt((b * b) + (4f * a * c));
        //System.out.println(sq);
        
        float x1 = 0f;
        float x2 = 0f;
        
        if (sq > 0f) {
        	x1 = ((-b) + (float)Math.sqrt((b * b) + (4f * a * c))) / (2f * a);
        	x2 = ((-b) - (float)Math.sqrt((b * b) + (4f * a * c))) / (2f * a);
        	System.out.println("The solve is: " + System.lineSeparator() + "x1: " + x1 + System.lineSeparator() + "x2: " + x2);
        }
        else if (sq == 0f) {
        	x1 = ((-b) + (float)Math.sqrt((b * b) + (4 * a * c))) / (2f * a);
        	System.out.println("There is only one real root" + x1);
        }
    	else {
    		System.out.println("The equation has no solution!");
    	}
        System.out.println("This programm was written by CosmicStudios! Copyright 15th Dezember 2018");
    	//float[] erg = {x1, x2};
		//return erg;
    	
    }

    public static void main(String[] args){
    	
    	System.out.println("Hi! This program will solve quadratic functions" + System.lineSeparator() + "(f(x)=ax²+bx+c) according to the abc formula!");
    	
    	Scanner key = new Scanner(System.in);
    	
    	System.out.println("Enter a: ");
    	float a = key.nextFloat();
    	
    	System.out.println("Enter b: ");
    	float b = key.nextFloat();
    	
    	System.out.println("Enter c: ");
    	float c = key.nextFloat();
    	
    	solv(a, b, c);
      
    }
}
