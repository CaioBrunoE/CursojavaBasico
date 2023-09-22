package application;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



import entities.Circle;
import entities.Rectagle;
import entities.Shape;
import entities.enums.Colors;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for(int i = 1 ; i<=n ; i++) {
			System.out.println("Shape #"+i+" data ");
			
			System.out.print("Rectangle or Circle (r/c)? ");
		    char ch = sc.next().charAt(0);
		    
		    System.out.print("Color (BLACK/BLUE/RED):");
		    Colors color = Colors.valueOf(sc.next());
		    
		    if(ch =='r') {
		    	System.out.print("Width:");
		    	double width = sc.nextDouble();
		    	
		    	System.out.print("Heigh:");
		    	double heigh = sc.nextDouble();
		    
		    	Rectagle rc = new Rectagle(color, width, heigh);
		    	 list.add(rc);
		    }else {
		    	System.out.print("Radius:");
		    	double radius = sc.nextDouble();
		    	
		    	Circle cr = new Circle(color, radius);
		    	
		    	list.add(cr);
		    }
		}
		System.out.println();
		System.out.println("SHAPE AREAS:");
		
		for(Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()) );
		}
		
		sc.close();

	}

}
