
public class Material {

    private String nome;
    private int quant;
    
    public Material(String n, int q) throws QuantidadeInvalidaException{
        this.setNome(n);
        this.setQuant(q);
    }

    public String getNome() {
        return this.nome;
    }

    public int getQuant() {
        return this.quant;
    }

    public void setNome(String n) {
        this.nome = n;
    }
    public final void setQuant(int q)
        throws QuantidadeInvalidaException{
        
        if(q < 0){
            //Ocorreu a situação indesejada
            
            //Lançar a exceção para avisar o resto
            //do programa que a situação indesejada ocorreu
            
            throw new QuantidadeInvalidaException("Erro:Quantidade informada menor que zero.");
        }
     
        this.quant = q;
    }
    
    
}

