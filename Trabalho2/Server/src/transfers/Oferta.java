package transfers;

import javax.swing.*;
import java.rmi.Remote;

public class Oferta {

    private double preco;
    private int num_passageiro;
    private int tipo_veiculo;
    private InterfaceMotorista motorista;


    public Oferta(InterfaceMotorista motorista) {
        setMotorista(motorista);
        insere();
    }

    void insere(){
        setTipo_veiculo( Integer.parseInt( JOptionPane.showInputDialog("Veiculo:\n1 - Executivo\n2 - Compartilhado\n3 - Exclusivo") ));
        if (getTipo_veiculo() != 3){
            setNum_passageiro(Integer.parseInt( JOptionPane.showInputDialog("Número de passageiros:") ));
        }else{
            setNum_passageiro(1);
        }

    }


    void printOferta(){
        System.out.println("\n ----OFERTA----");
        System.out.println("Usuario: " + getMotorista().toString());
        System.out.println("Tipo de veiculo: " + this.getTipo_veiculo());
        System.out.println("Num passageiro: " + this.getNum_passageiro());

    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
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

    public Remote getMotorista() {
        return motorista;
    }

    public void setMotorista(InterfaceMotorista motorista) {
        this.motorista = motorista;
    }
}
