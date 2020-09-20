package atividadearthur.alugueldecarro;

import javax.naming.ldap.ControlFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.TooManyListenersException;

public class Cliente extends Financeiro{
    
    private String nome;
    private int idade;    
    private float CPF;

    private Carro carroFavorito;

    

    private List<Carro> Carros = new ArrayList<>();

     public Cliente(String nomeCliente, int idadeCliente, float CPFcliente, int custo, int quantidadeDeDias) {
        super(custo,quantidadeDeDias);
        this.nome = nomeCliente;
        this.idade = idadeCliente;
        this.CPF = CPFcliente; 

    }

//-------------------------------------------------------------

    public void addCarros(Carro novo) {
        this.Carros.add(novo);
    }


    public void mostrarCarroAlugado(){
        System.out.println(nome);
        for (Carro nome : Carros) {
            nome.mostrarCarro();
        }
    }
//--------------------------------------------------------------

    public void carroFavorito(Carro favorito){
        this.carroFavorito = favorito;
    }

    public void mostrarCarroFavorito(){
       carroFavorito.mostrarCarro();
    }
    
//-------------------------------------------------------------
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
    
}
