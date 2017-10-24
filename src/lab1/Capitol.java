package lab1;

public class Capitol {
    private String titlu;
    private Sectiune[] sectiuni;

    public Capitol(String titlu, Sectiune[] sectiuni){
        this.titlu = titlu;
        this.sectiuni = sectiuni;
    }
    
    public void setTitlu(String titlu){
		this.titlu=titlu;
	}
	public String getTitlu(){
		return titlu;
	}
	
	public void setSectiuni(Sectiune [] sectiuni){
		this.sectiuni = sectiuni;
	}
	public Sectiune getNume(){
		Sectiune sectiuni = null;
		return sectiuni;
	}
}
