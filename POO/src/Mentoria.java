package POO.src;


import java.time.LocalDate;
import java.util.ResourceBundle.Control;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author israe
 */
public class Mentoria extends Control {
   
   private static final double XP_PADRAO = 0;
   private LocalDate data;

   
    public double calcularXp(){
        return XP_PADRAO + 20d;
    }
   
   public void mentoria(){
   
   }
   
     public LocalDate getData(){
      return data;
     }
     
     public void setData(LocalDate data){
         this.data = data;
     }
     
 @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }                                

    private String getTitulo() {
    return null;
}

    private String getDescricao() {
    return null;
}

    void getData(LocalDate now) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setTitulo(String string) {
    }

    public void setDescriçao(String string) {
    }

   
}
    