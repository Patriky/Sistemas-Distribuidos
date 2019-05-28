package transfers;

import javax.swing.*;

public class Cotacao {

    Cotacao() {
        insere();
    }   

    private String etinerario;
    private float preço;
    private int num_passageiro, tipo_veiculo;

    void insere(){
        this.etinerario = JOptionPane.showInputDialog("Etinerário:");
        this.tipo_veiculo = Integer.parseInt( JOptionPane.showInputDialog("Veiculo:\n1 - Executivo\n2 - Compartilhado\n3 - Exclusivo") );
        this.preço = Float.parseFloat( JOptionPane.showInputDialog("Preço:") );
        this.num_passageiro = Integer.parseInt( JOptionPane.showInputDialog("Número de passageiros:") );

    }

    public String getEtinerario() {
        return etinerario;
    }

    public void setEtinerario(String etinerario) {
        this.etinerario = etinerario;
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
}
