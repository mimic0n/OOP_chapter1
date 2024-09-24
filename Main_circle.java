package circle;

public class Main_circle {

	public static void main(String[] args) {
		circle c1 = new circle(radius1= 5.0, colorl= "Violet");

		System.out.println(c1);

		c1.setRadius (2.0);

		System.out.println(c1);

		circle c2 = new circle(radius1= 4.0, color1= "green");

		System.out.println(c2);

		c2.setColor("dark");

		System.out.println(c2);

	

		System.out.println("color="+c2.getColor());

	}

}
