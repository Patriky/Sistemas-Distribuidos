package transfers;

import javax.swing.*;
import java.rmi.Remote;

public class Cotacao {



    Cotacao(InterfaceCliente cliente) {
        this.setCliente(cliente);
        insere();
    }   

    private String itinerario;
    private float preço;
    private int num_passageiro;
    private int tipo_veiculo;
    private InterfaceCliente cliente;

    void insere(){
        setItinerario(JOptionPane.showInputDialog("Itinerário:"));
        setTipo_veiculo( Integer.parseInt( JOptionPane.showInputDialog("Veiculo:\n1 - Executivo\n2 - Compartilhado\n3 - Exclusivo") ));
        if (getTipo_veiculo() != 3){
            setNum_passageiro( Integer.parseInt( JOptionPane.showInputDialog("Número de passageiros:") ));
        }else {
            setNum_passageiro(1);
        }
        setPreço( Float.parseFloat( JOptionPane.showInputDialog("Preço:") ));

    }

    void printCotacao(){

        System.out.println("\n ----COTAÇÃO----");
        System.out.println("Usuario: " + getCliente().toString());
        System.out.println("Itinerario: " + this.getItinerario());
        System.out.println("Tipo de veiculo: " + this.getTipo_veiculo());
        System.out.println("Preço: "+ this.getPreço());
        System.out.println("Num passageiro: " + this.getNum_passageiro());

    }

    public String getItinerario() {
        return itinerario;
    }

    public void setItinerario(String itinerario) {
        this.itinerario = itinerario;
    }

    public float getPreço() {
        return preço;
    }

    public void setPreço(float preço) {
        this.preço = preço;
    }

    public int getNum_passageiro() {
        return num_passageiro;
    }

    public void setNum_passageiro(int num_passageiro) {
        this.num_passageiro = num_passageiro;
    }

    public int getTipo_veiculo() {
        return tipo_veiculo;
    }

    public void setTipo_veiculo(int tipo_veiculo) {
        this.tipo_veiculo = tipo_veiculo;
    }

    public Remote getCliente() {
        return cliente;
    }

    public void setCliente(InterfaceCliente cliente) {
        this.cliente = cliente;
    }
}
