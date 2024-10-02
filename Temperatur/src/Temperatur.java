public class Temperatur {
    // Datakerne: Temperaturen gemt som en double i Celsius
    private double temperaturICelsius;

    // Default-konstruktor (sætter temperaturen til 0°C)
    public Temperatur() {
        this.temperaturICelsius = 0.0;
    }

    // Copy-konstruktor (kopierer temperaturen fra et andet Temperatur-objekt)
    public Temperatur(Temperatur andenTemperatur) {
        this.temperaturICelsius = andenTemperatur.temperaturICelsius;
    }

    // Set-metode for Celsius (sætter temperaturen i Celsius)
    public void setCelsius(double celsius) {
        this.temperaturICelsius = celsius;
    }

    // Get-metode for Celsius (henter temperaturen i Celsius)
    public double getCelsius() {
        return this.temperaturICelsius;
    }

    // Set-metode for Fahrenheit (sætter temperaturen i Fahrenheit og konverterer til Celsius)
    public void setFahrenheit(double fahrenheit) {
        this.temperaturICelsius = (fahrenheit - 32) * 5 / 9;
    }

    // Get-metode for Fahrenheit (henter temperaturen i Fahrenheit ved at konvertere fra Celsius)
    public double getFahrenheit() {
        return (this.temperaturICelsius * 9 / 5) + 32;
    }

    // equals metode (sammenligner om to temperaturer er ens)
    public boolean equals(Temperatur andenTemperatur) {
        return this.temperaturICelsius == andenTemperatur.temperaturICelsius;
    }

    // toString metode (returnerer en læsbar streng med temperaturen i både Celsius og Fahrenheit)
    public String toString() {
        return "Temperaturen er " + temperaturICelsius + "°C (" + getFahrenheit() + "°F)";
    }

    // Testanvendelse
    public static void main(String[] args) {
        // Opret en temperatur med default-konstruktoren (0°C)
        Temperatur temp1 = new Temperatur();
        System.out.println(temp1);  // Temperaturen er 0.0°C (32.0°F)

        // Sæt temperaturen i Celsius
        temp1.setCelsius(25.0);
        System.out.println(temp1);  // Temperaturen er 25.0°C (77.0°F)

        // Sæt temperaturen i Fahrenheit
        temp1.setFahrenheit(98.6);
        System.out.println(temp1);  // Temperaturen er 37.0°C (98.6°F)

    }
}
