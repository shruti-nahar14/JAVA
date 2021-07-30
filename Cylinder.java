/////////////////////////////
/*class:Cylinder
 *Input:--
 *Output:12
          9
         1187.5220230569416
         3053.628059289279
 *Description: Display the surface area and volume of cylinder
 *Date:30-July-2021
 *Author Name:Shruti Nahar
 *///////////////////////////////
package practiceset4;
public	class Cylinder{
	    private int radius;
	    private int height;

	    public Cylinder(int radius, int height) {
	        this.radius = radius;
	        this.height = height;
	    }

	    public int getRadius() {
	        return radius;
	    }

	    public void setRadius(int radius) {
	        this.radius = radius;
	    }

	    public int getHeight() {
	        return height;
	    }

	    public void setHeight(int height) {
	        this.height = height;
	    }
	    public double surfaceArea(){
	        return 2* Math.PI* radius * radius + 2*Math.PI*radius*height;
	    }
	    public double volume(){
	        return Math.PI * radius * radius * height;
	    }


	    public static void main(String[] args) {
	        
	        Cylinder myCylinder = new Cylinder(9, 12);
	        myCylinder.setHeight(12);
	        System.out.println(myCylinder.getHeight());
	        myCylinder.setRadius(9);
	        System.out.println(myCylinder.getRadius());
	        System.out.println(myCylinder.surfaceArea());
	        System.out.println(myCylinder.volume());
	        
	    }
	}



