
public class TestaConversor {
    public static void main(String[] args){
   
        try{
        
        ConversorDeTemperatura c1= new  ConversorDeTemperatura();
        ConversorDeTemperatura c2= new  ConversorDeTemperatura();
        c1.converterParaCelsiu();
        c2.converterParaFarenheit();
                
                
        }catch(MenorQueZeroAbsolutoException ex){
            //Fazer algum tratamento de Exceção
            
            System.out.println(ex.getMessage());
            System.out.println(ex.getMessage());    
        }finally{
          //  
    }
    
       
}
}
