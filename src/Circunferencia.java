package areaperimetro;

public class Circunferencia {
    static public float area(float raio){
        return (float) (Math.pow(raio,2) * Math.PI);
    }
    static public float perimetro(float raio){
        return (float) (2 * Math.PI * raio);
    }
}
