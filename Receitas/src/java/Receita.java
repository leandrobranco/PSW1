
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RA21551055
 */

public class Receita {

    private String nome;    
    private List<Ingrediente> ingred;
    private String modoPreparo;
    private int pessoas;

    public List<Ingrediente> getIngred() {
        return ingred;
    }

    public void setIngred(List<Ingrediente> ingred) {
        this.ingred = ingred;
    }

    public String getModoPreparo() {
        return modoPreparo;
    }

    public void setModoPreparo(String modoPreparo) {
        this.modoPreparo = modoPreparo;
    }

    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
