package Aula7Heranca2;

public class AnimalGato extends Animal {
    private String miar = "miaaaau";
    private String raiva = "shiiii";
    private String sono = "ZzZzZzummm...";

    public String getMiar() {
        return miar;
    }
    public String getRaiva() {
        return raiva;
    }
    public String getSono() {
        return sono;
    }

    public void setMiar(String miar) {
        this.miar = miar;
    }
    public void setRaiva(String raiva) {
        this.raiva = raiva;
    }
    public void setSono(String sono) {
        this.sono = sono;
    }
    
    //metodos
    public String emitirMiar(){
        return "O gato esta miando: " + miar;
    }
    public String emitirRaiva(){
        return "O gato esta com raiva: " + raiva;
    }
    public String emitirSono(){
        return "O gato esta com sono: " + sono;
    }
}
