package atividadearthur.alugueldecarro;

public class Carro {
    
    private String nome;
    private String placa;
    private int preço;  
    private int ano;  

    public Carro(String nomeCarro, String placaCarro, int anoCarro, int preçoCarro){
        this.nome = nomeCarro;
        this.preço = preçoCarro;
        this.placa = placaCarro;
        validarAno(anoCarro);

    }

    public void mostrarCarro(){
        System.out.println("Carro: "+ nome + "," + placa + "," + ano + "," + preço +" ");

    }

    private void validarAno(int ano) {
        if (ano >= 2000) {
            this.ano = ano;
        }
        else{
            throw new RuntimeException("Carro não pode ser de antes de 2000!");
        }
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return nome + placa;
    }
}

