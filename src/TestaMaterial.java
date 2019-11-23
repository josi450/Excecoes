
public class TestaMaterial {
    public static void main(String[] args){
        
        try{
        
        Material m1= new Material("Caderno", -5);
        
        }catch(QuantidadeInvalidaException ex){
            //Fazer algum tratamento de Exceção
            
            System.out.println(ex.getMessage());
                 
        }finally{
          //  
    }
    
}
    
}

    

