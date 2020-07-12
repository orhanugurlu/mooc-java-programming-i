public class Fitbyte {
    private int age;
    private int restingHeartRate;

    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }
    
    private double maximumHeartRate() {
        return 206.3 - (0.711 * age);
    }
    
    public double targetHeartRate(double percentageOfMaximum) {
        return (maximumHeartRate() - restingHeartRate) * percentageOfMaximum + restingHeartRate;
    }
}
