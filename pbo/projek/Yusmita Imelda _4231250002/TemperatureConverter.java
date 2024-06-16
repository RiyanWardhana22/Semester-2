public abstract class TemperatureConverter {
    protected double temperature;

    public TemperatureConverter(double temperature) {
        this.temperature = temperature;
    }

    public abstract double toCelsius();
    public abstract double toFahrenheit();
    public abstract double toKelvin();
    public abstract double toReaumur();
}

// Abstrak
