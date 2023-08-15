package src.br.com.model.ConversorMoedas;

import javax.swing.*;

public class ConverteParaReais {
    
    // optei por arredondar para baixo, tendo que em uma viagem a pessoa precisa ter a quantia maior ou igual para comprar algo
    public void converterDolaresParaReais(double valorRecebido) {
        double valorDolar = Math.floor(valorRecebido * 4.96);

        JOptionPane.showMessageDialog(null,"Você tem R$"+valorDolar+" Reais"); ;
    }

    public void converterEurosParaReais(double valorRecebido) {
        double valorEuro = Math.floor(valorRecebido * 5.42);

        JOptionPane.showMessageDialog(null,"Você tem R$"+valorEuro+" Reais"); ;
    }

    public void converterLibrasParaReais(double valorRecebido) {
        double valorLibra = Math.floor(valorRecebido * 6.30);

        JOptionPane.showMessageDialog(null,"Você tem R$"+valorLibra+" Reais"); ;
    }

    public void converterPesosArgParaReal(double valorRecebido) {
        double valorPesoArg = Math.floor(valorRecebido * 0.014);

        JOptionPane.showMessageDialog(null,"Você tem R$"+valorPesoArg+" Reais"); ;
    }

    public void converterPesosChilParaReal(double valorRecebido) {
        double valorPesoChil = Math.floor(valorRecebido * 0.058);

        JOptionPane.showMessageDialog(null,"Você tem R$"+valorPesoChil+" Reais"); ;
    }

}
