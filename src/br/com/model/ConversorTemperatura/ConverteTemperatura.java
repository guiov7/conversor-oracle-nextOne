package src.br.com.model.ConversorTemperatura;

import javax.swing.*;

public class ConverteTemperatura {
    
    public double converterCelsiusParaFahrenheit(double temperaturaRecebida) {
        double celsiusParaFahrenheit = temperaturaRecebida * 1.8 + 32;
        celsiusParaFahrenheit = (double) Math.round(temperaturaRecebida * 100d) / 100;
        JOptionPane.showMessageDialog(null,temperaturaRecebida+" Celsius são "+celsiusParaFahrenheit+" graus Fahrenheit");
        return celsiusParaFahrenheit;
    }

    public double converterCelsiusParaKelvin(double temperaturaRecebida) {
        double celsiusParaKelvin = temperaturaRecebida + 273.15;
        celsiusParaKelvin = (double) Math.round(temperaturaRecebida * 100d) / 100;
        JOptionPane.showMessageDialog(null,temperaturaRecebida+" Celsius são "+celsiusParaKelvin+" Kelvin");
        return celsiusParaKelvin;
    }

    public double converterFahrenheitParaCelsius(double temperaturaRecebida) {
        double fahrenheitParaCelsius = (temperaturaRecebida - 32) / 1.8;
        fahrenheitParaCelsius = (double) Math.round(temperaturaRecebida * 100d) / 100;
        JOptionPane.showMessageDialog(null,temperaturaRecebida+"Graus Fahrenheit são "+fahrenheitParaCelsius+" Celsius");
        return fahrenheitParaCelsius;
    }

    public double converterKelvinParaCelsius(double temperaturaRecebida) {  
        double kelvinParaCelsius = (temperaturaRecebida - 273.15);
        kelvinParaCelsius = (double) Math.round(kelvinParaCelsius * 100d) / 100;
        JOptionPane.showMessageDialog(null,temperaturaRecebida+" Kelvin são "+kelvinParaCelsius+" Celsius");
        return kelvinParaCelsius;
    }
    
}
