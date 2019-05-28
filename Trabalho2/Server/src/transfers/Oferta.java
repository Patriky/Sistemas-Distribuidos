package transfers;

import javax.swing.*;

public class Oferta {
    public Oferta() {
    }

    private float preço;
    private int num_passageiro, tipo_veiculo;

    void insere(){
        this.tipo_veiculo = Integer.parseInt( JOptionPane.showInputDialog("Veiculo:\n1 - Executivo\n2 - Compartilhado\n3 - Exclusivo") );
        this.preço = Float.parseFloat( JOptionPane.showInputDialog("Preço:") );
        this.num_passageiro = Integer.parseInt( JOptionPane.showInputDialog("Número de passageiros:") );

    }
}
