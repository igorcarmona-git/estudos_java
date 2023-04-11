package aula4;

 //public class AnimalCachorro extends Animal 
// Significa que a Classe AnimalCachorro se extende para Animal
public class AnimalCachorro extends Animal {
    private String latir = "au au au";
    private String raiva = "raaann";
    private String sono = "ZzZzZz....";

    //getters
    public String getLatir() {
        return latir;
    }
    public String getRaiva() {
        return raiva;
    }
    public String getSono() {
        return sono;
    }
    
    //setters
    public void setLatir(String latir) {
        this.latir = latir;
    }
    public void setRaiva(String raiva) {
        this.raiva = raiva;
    }
    public void setSono(String sono) {
        this.sono = sono;
    }
    
    //metodos
    public String emitirLatido(){
        return "O cachorro esta latindo: " + latir;
    }
    public String emitirRaiva(){
        return "O cachorro esta com raiva: " + raiva;
    }
    public String emitirSono(){
        return "O cachorro esta com sono: " + sono;
    }
    
}
