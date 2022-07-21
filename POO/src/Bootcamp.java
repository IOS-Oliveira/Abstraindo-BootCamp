package POO.src;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descriçao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();
    private Set<Dev> devsIncritos;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getDesciçao(){
        return descriçao;
    }
    public void setDescriçao(String descriçao){
        this.descriçao = descriçao;
    }
    public LocalDate getDataInicial(){
        return dataInicial;
    }
    public LocalDate getDataFinal(){
        return dataFinal;
    }
    public Set<Dev> getDevsInscritos(){
        return devsInscritos;

    }
    public void setDevsInscritos(Set<Dev> devssInscritos){
        this.devsIncritos = devsInscritos;
    }
    public Set<Conteudo> getConteudos(){
        return conteudos;
    }
    public void setConteudos(Set<Conteudo> conteudos){
        this.conteudos =  conteudos;
    }
   @Override
   public boolean equals(Object o){
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Bootcamp bootcamp = (Bootcamp) o;
    return Objects.equals(nome, bootcamp.nome) && Objects.equals(descriçao, bootcamp.descriçao) && Objects.equals(dataInicial, bootcamp.dataFinal);
   }
   @Override
   public int hashCode(){
    return Objects.hash(nome, descriçao,dataInicial, dataFinal,devsIncritos,conteudos);
   }
 
}
