package src.br.com.model.ConversorMoedas;

import javax.swing.*;

public class ConverteParaReais {
    
    public void converterDolaresParaReais(double valorRecebido) {
        double valorDolar = Math.round(valorRecebido * 4.96);
        JOptionPane.showMessageDialog(null,"Você tem R$"+valorDolar+" Reais"); ;
    }

    public void converterEurosParaReais(double valorRecebido) {
        double valorEuro = Math.round(valorRecebido * 5.42);
        JOptionPane.showMessageDialog(null,"Você tem R$"+valorEuro+" Reais"); ;
    }

    public void converterLibrasParaReais(double valorRecebido) {
        double valorLibra = Math.round(valorRecebido * 6.30);
        JOptionPane.showMessageDialog(null,"Você tem R$"+valorLibra+" Reais"); ;
    }
    
    public void converterPesosArgParaReal(double valorRecebido) {
        double valorPesoArg = Math.round(valorRecebido * 0.014);
        JOptionPane.showMessageDialog(null,"Você tem R$"+valorPesoArg+" Reais"); ;
        if(valorPesoArg < 1) {
            JOptionPane.showMessageDialog(null,"Esta moeda retorna zero, pois sua cotação esta muito abaixo do valor do Real brasileiro"); ;

        }
    }

    public void converterPesosChilParaReal(double valorRecebido) {
        double valorPesoChil = Math.round(valorRecebido * 0.058);
        JOptionPane.showMessageDialog(null,"Você tem R$"+valorPesoChil+" Reais"); ;
        if(valorPesoChil < 1) {
            JOptionPane.showMessageDialog(null,"Esta moeda retorna zero, pois sua cotação esta muito abaixo do valor do Real brasileiro"); ;
        }
    }

}
