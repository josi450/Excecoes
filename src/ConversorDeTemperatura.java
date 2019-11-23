
public class ConversorDeTemperatura {
    
    public double converterParaCelsiu()throws MenorQueZeroAbsolutoException{
     
    double tempf = -6664.23;
    double conver= (tempf-32)/1.8;
    
    if(tempf < -459.67){
            //Ocorreu a situação indesejada
            
            //Lançar a exceção para avisar o resto
            //do programa que a situação indesejada ocorreu
            
            throw new MenorQueZeroAbsolutoException("Erro:Valor informado menor que zero absoluto.");
        }
    
    return conver;
    
}
    public double converterParaFarenheit()throws MenorQueZeroAbsolutoException{
        double tempc= -5598.56;
        double converter= (tempc * 1.8) + 32;
        if(tempc < -273.15){
            //Ocorreu a situação indesejada
            
            //Lançar a exceção para avisar o resto
            //do programa que a situação indesejada ocorreu
            
            throw new MenorQueZeroAbsolutoException("Erro:Valor informado menor que zero absoluto.");
        }
        
        return converter;
    }
}
