package src.br.com.model.ConversorMoedas;

import src.br.com.model.ConversorMoedas.ConverteMoedas;
import src.br.com.model.ConversorMoedas.ConverteParaReais;

import javax.swing.JOptionPane;
import java.util.Objects;

public class Funcao {

    ConverteMoedas moedas = new ConverteMoedas();
    ConverteParaReais reais = new ConverteParaReais();

    public void converterMoedas(double valorRecebido) {

        String opcao = (JOptionPane.showInputDialog(null, "Escolha a moeda a qual deseja converter", "Moedas",
                JOptionPane.PLAIN_MESSAGE, null,
                new Object[] { "De Reais para Dólares", "De Reais para Euros", "De Reais para Libras Esterlinas",
                        "De Reais para Pesos Argentinos", "De Reais para Pesos Chilenos",
                        "De Dólares para Reais", "De Euros para Reais", "De Libras Esterlinas para Reais",
                        "De Pesos Argentinos para Reais", "De Pesos Chilenos para Reais" },
                "Escolha: ")).toString();

        switch (opcao) {
            case "De Reais para Dólares":
                moedas.converterReaisParaDolares(valorRecebido);
                break;
            case "De Reais para Euros":
                moedas.converterReaisParaEuro(valorRecebido);
                break;
            case "De Reais para Libras Esterlinas":
                moedas.converterReaisParaLibras(valorRecebido);
                break;
            case "De Reais para Pesos Argentinos":
                moedas.converterReaisParaPesosArg(valorRecebido);
                break;
            case "De Reais para Pesos Chilenos":
                moedas.converterReaisParaPesosChil(valorRecebido);
                break;
            case "De Dólares para Reais":
                reais.converterDolaresParaReais(valorRecebido);
                break;
            case "De Euros para Reais":
                reais.converterEurosParaReais(valorRecebido);
                break;
            case "De Libras Esterlinas para Reais":
                reais.converterLibrasParaReais(valorRecebido);
                break;
            case "De Pesos Argentinos para Reais":
                reais.converterPesosArgParaReal(valorRecebido);
                break;
            case "De Pesos Chilenos para Reais":
                reais.converterPesosChilParaReal(valorRecebido);
                break;
        }
    }
}
