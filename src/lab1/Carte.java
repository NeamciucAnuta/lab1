package lab1;

public class Carte {
    private String[] autori;
    private String titlu;
    private Cuprins cuprins;
    private Capitol[] capitole;

    public Carte(String[] autori, String titlu, Cuprins cuprins, Capitol[] capitole){
        this.autori = autori;
        this.titlu = titlu;
        this.cuprins = cuprins;
        this.capitole = capitole;
    }
}