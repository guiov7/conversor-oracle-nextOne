package src.br.com.model.ConversorTemperatura;

import javax.swing.*;

public class FuncaoTemperatura {

    ConverteTemperatura temperatura = new ConverteTemperatura();

    public void converterTemperatura(double temperaturaRecebida) {
        String opcao = (JOptionPane
        .showInputDialog(null, "Escolha sua opção de conversão", "Temperatura", JOptionPane.PLAIN_MESSAGE, null,
            new Object[] { 
                "Graus Celsius a Fahrenheit", "Graus Celsiu a Kelvin",
                "Graus Fahrenheit a Celsius", "Kelvin a Graus Celsius",
                "Kelvin a Graus Fahrenheit", },
            "Escolha")).toString();
        
        switch(opcao) {

            case "Graus Celsius a Fahrenheit":
                temperatura.converterCelsiusParaFahrenheit(temperaturaRecebida);
                break;
            case "Graus Celsiu a Kelvin":
                temperatura.converterCelsiusParaKelvin(temperaturaRecebida);
                break;
            case "Graus Fahrenheit a Celsius":
                temperatura.converterFahrenheitParaCelsius(temperaturaRecebida);
                break;
            case "Kelvin a Graus Celsius":
                temperatura.converterKelvinParaCelsius(temperaturaRecebida);
                break;
            case "Kelvin a Graus Fahrenheit":
                temperatura.converterKelvinParaFahrenheit(temperaturaRecebida);
                break; 
        }

    }

}
