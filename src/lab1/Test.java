package lab1;

public class Test {
    public static void main(String[] args){
        Element[] elemente = new Element[2];
        elemente[0] = (Element) new Paragraf();
        elemente[1] = (Element) new Imagine(null);

        Sectiune[] sectiuni = new Sectiune[1];
        sectiuni[0] = new Sectiune("Sectiune1", elemente);

        Capitol[] capitole = new Capitol[1];
        capitole[0] = new Capitol("I", sectiuni);

       // Cuprins cuprins = new Cuprins();

        String[] autori = new String[1];
        autori[0] = new String("Liviu Rebreanu");

       // Carte carte = new Carte(autori, "Ion", cuprins, capitole);

    }
}
