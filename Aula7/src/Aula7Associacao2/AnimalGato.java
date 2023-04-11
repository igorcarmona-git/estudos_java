package Aula7Associacao2;

public class AnimalGato {
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
    public String miarGato(){
        return miar;
    }
    public String raivaGato(){
        return raiva;
    }
    public String sonoGato(){
        return sono;
    }
}
