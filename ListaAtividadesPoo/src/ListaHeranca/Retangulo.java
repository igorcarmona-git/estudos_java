package ListaHeranca;

public class Retangulo {
        public double calculoPerimetroRetangulo(double base, double altura){
        double perimetro;
        perimetro = 2 * (base + altura);
        
        return perimetro;
    }
        public double calculoAreaRetangulo(double base, double altura){
        double area; 
        area =  base * altura;
    
        return area;
    }
}
