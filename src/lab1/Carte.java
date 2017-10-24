package lab1;

import java.util.Vector;

import javax.swing.text.AbstractDocument.Content;



public class Carte { 
    Vector<Autor> autori;
	Cuprins cuprins;
	Vector<Capitol> capitole;
	String titlu;
	Carte() { }
	Carte(Vector<Autor> autori, Vector<Capitol> capitole, String titlu) {
		this.autori = autori;
		this.capitole = capitole;
		this.titlu=titlu;
	}
	public Vector<Autor> getAutori() {
		return autori;
	}
	public void setAutori(Vector<Autor> autori) {
		this.autori = autori;
	}
	public Cuprins getCuprins() {
		return cuprins;
	}
	public void setCuprins(Cuprins cuprins) {
		this.cuprins = cuprins;
	}
	public Vector<Capitol> getCapitole() {
		return capitole;
	}
	
	public void addContent(Element e){
	}
}