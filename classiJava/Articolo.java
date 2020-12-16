package classiJava;

public class Articolo{

    String categoria;
    String marca;
    String modello;
    String colore;
    String dimensioni;
    double peso;
    double prezzo;
    boolean disponibile;

    public Articolo(String categoria, String marca, String modello, string colore, string dimensioni, double peso, double prezzo, boolean disponibile) {
        this.categoria = categoria;
        this.marca = marca;
        this.modello = modello;
        this.colore = colore;
        this.dimensioni = dimensioni;
        this.peso = peso;
        this.prezzo = prezzo;
        this.disponibile = disponibile;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(string colore) {
        this.colore = colore;
    }

    public String getDimensioni() {
        return dimensioni;
    }

    public void setDimensioni(string dimensioni) {
        this.dimensioni = dimensioni;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public boolean isDisponibile() {
        return disponibile;
    }

    public void setDisponibile(boolean disponibile) {
        this.disponibile = disponibile;
    }
}