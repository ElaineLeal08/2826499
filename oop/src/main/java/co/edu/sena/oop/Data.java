package co.edu.sena.oop;

public class Data {

    public Double areaTriangulo(double num1, double num2){
        return (num1 * num2)/2;
    }

    public Double sumanumeros(double num3, double num4){
        return (num3 + num4);
    }

    public Double elevarcuadrado(double num1){
        return (num1 * num1);
    }
    
    public Double convertir(double num2){
    return (num2 * 1.08);
    }

    public double areacuadrado(double num3){
        return (num3 * num3);
    }

    public double perimetrocuadrado(double num3){
        return (num3 * 4);
    }

    //public double areacilindro(double num1, double num2){
        //return ((2 * 3.1416) * num1 *num2) + (2 * 3.1416 * (num1 * num1));
    //}

    public double areacilindro(double num1, double num2){
        return ((2 * Math.PI) * num1 *num2) + (2 * Math.PI * Math.pow(num1, 2));
    }

    //public double volumencilindro(double num1, double num2){
        //return (3.1416 * (num1 *num1)* num2);
    //}

    public double volumencilindro(double num1, double num2){
       return (Math.PI * (Math.pow(num1, 2))* num2);
    }

    public double radiocircunferencia(double num3){
        return (num3 / 2);
     }

    public double areacircunferencia(double num3){
        return (Math.PI * ((num3 / 2)*(num3 / 2)));
     }

     public double longitudcircunferencia(double num3){
        return (num3*Math.PI);
     }

     public double promedio(double num1, double num2,double num3){
        return ((num1+num2+num3)/3);
     }
}
