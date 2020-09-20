package atividadearthur.alugueldecarro;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AppAluguel {
    public static void main(String[] args) {
        
        Cliente Alana = new Cliente("Alana de Moraes", 23, 52194362, 1800, 3);
        Cliente Bruno = new Cliente("Bruno de Almeida", 35, 28118382, 36000, 5);
        Cliente Lucas = new Cliente("Lucas Alberto", 33, 48718898, 2900, 2);

//------------------------------------------------------------------

        System.out.println("Qual carro deseja alugar ?");

        Carro Cadilac = new Carro("Cadilac", "QBL 2398", 2014, 5300);
        Carro FiatUno = new Carro("Fiat Uno", "RFL 2625", 2002, 900);
        Carro HondaCIVIC = new Carro("Honda Civic", "KAN 9174", 2019, 2450);
        Carro Mustang = new Carro("Mustang 2000", "JAK 0147", 2000, 7200);

//------------------------------------------------------------------

        List<Carro> listaCarros = new ArrayList<>();
        listaCarros.add(Cadilac);
        listaCarros.add(FiatUno);
        listaCarros.add(HondaCIVIC);
        listaCarros.add(Mustang);

        for (Carro nome : listaCarros) {
            System.out.println(nome.toString());
        }
        
//--------------------------------------------------------------------

        Lucas.addCarros(HondaCIVIC);
        Bruno.addCarros(Mustang);
        Alana.addCarros(FiatUno);

        Lucas.mostrarCarroAlugado();
        Bruno.mostrarCarroAlugado();
        Alana.mostrarCarroAlugado();

//-------------------------------------------------------------------
        Lucas.carroFavorito(Mustang);
        Alana.carroFavorito(HondaCIVIC);
        Bruno.carroFavorito(Mustang);

        Lucas.mostrarCarroFavorito();
        Bruno.mostrarCarroFavorito();
        Alana.mostrarCarroFavorito();

        
    }
}
