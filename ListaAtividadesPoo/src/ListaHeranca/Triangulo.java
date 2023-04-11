package ListaHeranca;

public class Triangulo {
        public double calculoAreaTriangulo(double base, double altura){
            double area;
            area = (base * altura) / 2;

            return area;
        }
        public double calculoPerimetroTriangulo(double ladoA, double ladoB, double ladoC){
            double area;
            area = ladoA + ladoB + ladoC;

            return area;
        }
}
