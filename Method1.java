import java.util.Scanner;


public class Method1 {

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
    public static int h (int x){
    	
    	return (int) Math.pow(x, 10);
    }
    public static int f(int x,int y){
    	return x+y;
    }
    public static int g (int x, int y, int z){
    	return (int) (Math.sqrt(x)+Math.abs(y)+Math.pow((double)z, (double)y));
    }
   
}
