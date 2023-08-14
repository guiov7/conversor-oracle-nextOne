import javax.swing.*;

public class Funcao {
    
    ConversorMoedas moedas = new ConversorMoedas();

    public void converterMoedas(double valorRecebido) {

        String opcao = JOptionPane.showInputDialog(null,"Escolha a moeda para a qual deseja converter seu dinheiro ","Moedas",
         JOptionPane.PLAIN_MESSAGE,null,
         new Object[]{"De Reais a Dolares","De Reais a Euros","De Reais a Pesos Argentinos",
          "De Dolares a Reais", "De Euros a Reais","De Pesos Argentinos a Reais"},
          "Escolha"
        ).toString();
        switch(opcao) {
            case "De Reais a Dolares":
                moedas.converterReaisADolar(valorRecebido);
                break;
            case "De Reais a Euros":
                moedas.converterReaisAEuro(valorRecebido);
                break;
            /*
             ,"De Reais a Euros","De Reais a Pesos Argentinos",
             "De Dolares a Reais", "De Euros a Reais","De Pesos Argentinos a Reais"
             */
        }
    }
}
