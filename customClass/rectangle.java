package java programming.customClass;

public class rectangle extends shape {
    rectangle (int dim1,int dim2){
        super(dim1, dim2);
    }
    public double area (int dim1, int dim2)
    {
        return this.dim1*this.dim2;
    }
    
}
