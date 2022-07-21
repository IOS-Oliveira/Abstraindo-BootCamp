package POO.src;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author israe
 */
public class Curso extends CloneNotSupportedException {

    private static final int XP_PADRAO = 0;
    private int cargahoraria;

    /**
     * @return
     */

    public double CalcularXp() {
        return XP_PADRAO + cargahoraria;
    }

    public void curso() {
    }

    // Preciso concerta esta linha
    public int getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;

    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargahoraria +
                '}';
    }

    private String getDescricao() {
        return null;
    }

    private String getTitulo() {
        return null;
    }

    public void setTitulo(String string) {
    }

    public void setDescriçao(String string) {
    }

}
