import java.util.Scanner;


public class MethodOwnWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter an integer");
		Scanner keyboard =new Scanner(System.in);
		int x=keyboard.nextInt();
		System.out.println("The integer "+x+" after the function h is "+h(x)+".");
		System.out.println("Enter two integers.");
		int x1=keyboard.nextInt();
		int y=keyboard.nextInt();
		System.out.println("The integers "+x1+" "+y+" after the function f is "+f(x1,y)+".");
		System.out.println("Enter three integers.");
		int x2=keyboard.nextInt();
		int y1=keyboard.nextInt();
		int z=keyboard.nextInt();
		System.out.println("The integers "+x2+", "+y1+", and "+z+" after the function g is "+g(x2,y1,z)+".");
		
	}
    public static double h (int x){
    	
    	return power(x,10);
    }
    public static int f(int x,int y){
    	return x+y;
    }
    public static double g (int x, int y, int z){
    	return  power(x,2)+abs(y)+power(z,y);
    }
    public static double sqrt(int number) {
		double t;
	 
		double squareRoot = number / 2;
	 
		do {
			t = squareRoot;
			squareRoot = (t + (number / t)) / 2;
		} while ((t - squareRoot) != 0);
	 
		return squareRoot;
	}
    public static double power (int z, int y){
    	double result =z;
    	while (y!=1){
    		 result= result *z;
    		y--;
    	}
    	return result;
    }
    public static double abs (int x){
    	return sqrt(x*x);
    }
}

