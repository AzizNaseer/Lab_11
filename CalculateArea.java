package lab11;

public class CalculateArea  {
    public shape[] shapes;
    public CalculateArea(){
    }

    public double[] arr(shape[] x){
        double array[]=new double[x.length];
        for (int i=0;i<x.length;i++){
            array[i]=x[i].area();
        }
        return array;
    }
}
