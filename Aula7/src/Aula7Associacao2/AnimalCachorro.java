package Aula7Associacao2;

public class AnimalCachorro {
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
    public String latirCachorro(){
        return latir;
    }
    public String raivaCachorro(){
        return raiva;
    }
    public String sonoCachorro(){
        return sono;
    }
    
}
