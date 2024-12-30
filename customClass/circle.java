package java programming.customClass;

public class circle extends shape {

    circle (int dim1,int dim2){
        super(dim1, dim2);
    }
    public double area (int dim1, int dim2)
    {
        return Math.PI *this.dim1*this.dim2;
    }
}
