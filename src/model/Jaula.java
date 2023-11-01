package model;

//There is a denpendency call Lombok where you can adding annotation on the top of the class
//and it can automaticcally create getter and setter, constructor and toString method for you 




public class Jaula {
    String norte = "Norte";
    String sur = "Sur";
    String grande = "Grande";
    String mediana = "Mediana";
    String pequena = "Pequena";
    int capacidad_grande = 10;
    int capacidad_mediana = 6;
    int capacidad_pequena = 2;
    String sector;
    String tamano;



    public Jaula(String norte, String sur, String grande, String mediana, String pequena, int capacidad_grande,
            int capacidad_mediana, int capacidad_pequena, String sector, String tamano) {
        this.norte = norte;
        this.sur = sur;
        this.grande = grande;
        this.mediana = mediana;
        this.pequena = pequena;
        this.capacidad_grande = capacidad_grande;
        this.capacidad_mediana = capacidad_mediana;
        this.capacidad_pequena = capacidad_pequena;
        this.sector = sector;
        this.tamano = tamano;
    }



    public String getNorte() {
        return norte;
    }



    public void setNorte(String norte) {
        this.norte = norte;
    }



    public String getSur() {
        return sur;
    }



    public void setSur(String sur) {
        this.sur = sur;
    }



    public String getGrande() {
        return grande;
    }



    public void setGrande(String grande) {
        this.grande = grande;
    }



    public String getMediana() {
        return mediana;
    }



    public void setMediana(String mediana) {
        this.mediana = mediana;
    }



    public String getPequena() {
        return pequena;
    }



    public void setPequena(String pequena) {
        this.pequena = pequena;
    }



    public int getCapacidad_grande() {
        return capacidad_grande;
    }



    public void setCapacidad_grande(int capacidad_grande) {
        this.capacidad_grande = capacidad_grande;
    }



    public int getCapacidad_mediana() {
        return capacidad_mediana;
    }



    public void setCapacidad_mediana(int capacidad_mediana) {
        this.capacidad_mediana = capacidad_mediana;
    }



    public int getCapacidad_pequena() {
        return capacidad_pequena;
    }



    public void setCapacidad_pequena(int capacidad_pequena) {
        this.capacidad_pequena = capacidad_pequena;
    }



    public String getSector() {
        return sector;
    }



    public void setSector(String sector) {
        this.sector = sector;
    }



    public String getTamano() {
        return tamano;
    }



    public void setTamano(String tamano) {
        this.tamano = tamano;
    }



   



    

}
