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
        setEtinerario(JOptionPane.showInputDialog("Etinerário:"));
        System.out.println("Etinerario: " + getEtinerario());
        setTipo_veiculo( Integer.parseInt( JOptionPane.showInputDialog("Veiculo:\n1 - Executivo\n2 - Compartilhado\n3 - Exclusivo") ));
        System.out.println("Tipo de veiculo: " + getTipo_veiculo());
        setPreço( Float.parseFloat( JOptionPane.showInputDialog("Preço:") ));
        System.out.println("Preço: "+ getPreço());
        setNum_passageiro( Integer.parseInt( JOptionPane.showInputDialog("Número de passageiros:") ));
        System.out.println("Num passageiro: " + getNum_passageiro());

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
