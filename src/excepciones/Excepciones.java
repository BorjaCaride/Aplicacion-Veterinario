package excepciones;

public class Excepciones extends Exception{
    
    String error;
    
    public Excepciones(String error){
        
        super(error);
        this.error = error;
        
    }
    
    @Override
    public String toString(){
        
        return this.error;
        
    }
    
}
