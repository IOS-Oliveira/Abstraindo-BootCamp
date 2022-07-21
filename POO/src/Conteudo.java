package POO.src;
public abstract class Conteudo{
    
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    public abstract double calcularXp();

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getDescricao(){
        return getDescricao();
    }
    public void setDescricao(String descriçao){
    }

    



}