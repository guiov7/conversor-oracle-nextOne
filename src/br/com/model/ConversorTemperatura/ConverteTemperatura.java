package src.br.com.model.ConversorTemperatura;

import javax.swing.*;

public class ConverteTemperatura {
    
    public double converterCelsiusParaFahrenheit(double temperaturaRecebida) {
        double celsiusParaFahrenheit = temperaturaRecebida * 1.8 + 32;
        celsiusParaFahrenheit = (double) Math.round(celsiusParaFahrenheit * 100d) / 100;
        JOptionPane.showMessageDialog(null,temperaturaRecebida+" Celsius são "+celsiusParaFahrenheit+" graus Fahrenheit");
        return celsiusParaFahrenheit;
    }

    public double converterCelsiusParaKelvin(double temperaturaRecebida) {
        double celsiusParaKelvin = temperaturaRecebida + 273.15;
        celsiusParaKelvin = (double) Math.round(celsiusParaKelvin * 100d) / 100;
        JOptionPane.showMessageDialog(null,temperaturaRecebida+" Celsius são "+celsiusParaKelvin+" Kelvin");
        return celsiusParaKelvin;
    }

    public double converterFahrenheitParaCelsius(double temperaturaRecebida) {
        double fahrenheitParaCelsius = (temperaturaRecebida - 32) / 1.8;
        fahrenheitParaCelsius = (double) Math.round(fahrenheitParaCelsius * 100d) / 100;
        JOptionPane.showMessageDialog(null,temperaturaRecebida+"Graus Fahrenheit são "+fahrenheitParaCelsius+" Celsius");
        return fahrenheitParaCelsius;
    }

    public double converterKelvinParaCelsius(double temperaturaRecebida) {  
        double kelvinParaCelsius = (temperaturaRecebida - 273.15);
        kelvinParaCelsius = (double) Math.round(kelvinParaCelsius * 100d) / 100;
        JOptionPane.showMessageDialog(null,temperaturaRecebida+" Kelvin são "+kelvinParaCelsius+" Celsius");
        return kelvinParaCelsius;
    }
    
    public double converterKelvinParaFahrenheit(double temperaturaRecebida) {
        double kelvinParaFahrenheit = (temperaturaRecebida - 273.15) * 1.8000 + 32.0;
        kelvinParaFahrenheit = (double) Math.round(kelvinParaFahrenheit * 100d) / 100;
        JOptionPane.showMessageDialog(null,temperaturaRecebida+" Kelvin são "+kelvinParaFahrenheit+" graus Fahrenheit");
        return kelvinParaFahrenheit;
    }
    
}
