public class Cylinder {
    private double height;
    private double radius;

    // Constructor
    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Height must be positive.");
        }
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Radius must be positive.");
        }
    }

    // Method to calculate volume
    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    // Method to calculate surface area
    public double getSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
}
public class Cylinder1 {
    public static void main(String[] args) {
        // Create a Cylinder object
        Cylinder cylinder = new Cylinder(10, 5);

        // Set values
        cylinder.setHeight(12);
        cylinder.setRadius(6);

        // Get values
        System.out.println("Height: " + cylinder.getHeight());
        System.out.println("Radius: " + cylinder.getRadius());

        // Calculate and display volume and surface area
        System.out.println("Volume: " + cylinder.getVolume());
        System.out.println("Surface Area: " + cylinder.getSurfaceArea());
    }
}
