package src.br.com.model.ConversorMoedas;

import javax.swing.*;

public class ConverteMoedas {

    public void converterReaisParaDolares(double valorRecebido) {
        double moedaDolar = valorRecebido / 4.96;
        moedaDolar = (double) Math.round(moedaDolar * 100d) / 100;
        JOptionPane.showMessageDialog(null,"Você tem $ "+moedaDolar+" Dólares");
    }
    
    public void converterReaisParaEuro(double valorRecebido) {
        double moedaEuro = valorRecebido / 5.42;
        moedaEuro = (double) Math.round(moedaEuro * 100d) / 100;
        JOptionPane.showMessageDialog(null,"Você tem $ "+moedaEuro+" Euros");
    }
    
    public void converterReaisParaLibras(double valorRecebido) {
        double moedaLibra = valorRecebido / 6.30;
        moedaLibra = (double) Math.round(moedaLibra * 100d) / 100;
        JOptionPane.showMessageDialog(null,"Você tem $ "+moedaLibra+" Libras");
    }
    
    public void converterReaisParaPesosArg(double valorRecebido) {
        double moedaPesosArg = valorRecebido / 0.014;
        moedaPesosArg = (double) Math.round(moedaPesosArg * 100d) / 100;
        JOptionPane.showMessageDialog(null,"Você tem $ "+moedaPesosArg+" Pesos Argentinos");
    }
    
    public void converterReaisParaPesosChil(double valorRecebido) {
        double moedaPesosChil = valorRecebido / 0.058;
        moedaPesosChil = (double) Math.round(moedaPesosChil * 100d) / 100;
        JOptionPane.showMessageDialog(null,"Você tem $ "+moedaPesosChil+" Pesos Chilenos");
    }

}
