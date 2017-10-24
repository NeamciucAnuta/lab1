package lab1;

public class ImagineProxy extends AbstractElem{
	private String filename;
	private Imagine img=null;
	
	ImagineProxy(String filaname){
		this.filename=filename;
	}
	
	public void print(){
		if(img==null){
			this.img=new Imagine(filename);
			
		}
		img.print();
	}

}
