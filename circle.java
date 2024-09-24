package circle;

public class circle {
	public double radius;
	public String color;

	public circle(double radius1, String color1) { 

	this.color = color1;

	this.radius= radius1;

	}

	
	public circle() { 

	this.color="red";

	this.radius = 1.0;

	}

	public double getRadius() { 

	return radius;

	}
	public void setRadius (double radius) { 

	this.radius = radius;

	}

	public String getColor() { 

	

	return color;

	}

	public void setColor(String color) { 

	this.color = color;

	}

	
	public String toString() {

	return "circle [radius=" + radius + ",color =" + color + "]";

	}

	public double getArea(){ 

	return Math.PI *radius * radius;

	}

	

	

}
