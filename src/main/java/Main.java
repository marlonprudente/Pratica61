
import java.util.*;
import utfpr.dainf.if62c.pratica.Jogador;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Main {
    public static void main(String[] args) {
        
    HashMap<String, Jogador> time1 = new HashMap<>();
    time1.put("Goleiro", new Jogador(1, "Fulano"));
    time1.put("Zagueiro", new Jogador(4, "Ciclano"));
    time1.put("Atacante", new Jogador(10, "Beltrano"));
    
    HashMap<String, Jogador> time2 = new HashMap<>();
    time2.put("Goleiro", new Jogador(1, "Joao"));
    time2.put("Zagueiro", new Jogador(7, "Jose"));
    time2.put("Atacante", new Jogador(15, "Mario"));    

    for(int i = 0; i<time1.size();i++){
        if(time1.keySet()==time2.keySet()){
            System.out.println("T1:" + time1 + "T2:" + time2);
        }
    }
     

}
}