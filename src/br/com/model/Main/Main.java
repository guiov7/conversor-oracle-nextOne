package src.br.com.model.Main;

import src.br.com.model.ConversorMoedas.ConverteMoedas;
import src.br.com.model.ConversorMoedas.Funcao;
import src.br.com.model.ConversorTemperatura.ConverteTemperatura;
import src.br.com.model.ConversorTemperatura.FuncaoTemperatura;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        
        Funcao moedas = new Funcao();
        FuncaoTemperatura temperaturas = new FuncaoTemperatura();

        while (true) {

            String opcao = JOptionPane.showInputDialog(null, "Escolha uma opção ", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Conversor de Moeda", "Conversor de Temperatura"}, "Escolha").toString();

            switch (opcao) {
                case "Conversor de Moeda":
                    String coinInput = JOptionPane.showInputDialog("Insira um valor: ");
                    if (checar(coinInput)) {
                        double valorRecebido = Double.parseDouble(coinInput);
                        moedas.converterMoedas(valorRecebido);

                        int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
                        if (JOptionPane.OK_OPTION == resposta) {
                            System.out.println("Escolha opção Afirmativa");
                        } else {
                            JOptionPane.showMessageDialog(null, "Programa finalizado");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    }
                break;

                case "Conversor de Temperatura":
                    String tempInput = JOptionPane.showInputDialog("Insira a temperatura: ");
                    if(checar(tempInput)) {
                        double temperaturaRecebida = Double.parseDouble(tempInput);
                        temperaturas.converterTemperatura(temperaturaRecebida);

                        int resposta = JOptionPane.showConfirmDialog(null,"Deseja coontinuar?");
                        if(JOptionPane.OK_OPTION == resposta) {
                            System.out.println("Escolha opção afirmativa");
                        }else{
                            JOptionPane.showMessageDialog(null,"Programa finalizado");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    }
                break;
            }
   
        }

    }
    public static boolean checar(String input) {
        try {
            double x = Double.parseDouble(input);
            if (x >= 0 || x < 0) ;
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}