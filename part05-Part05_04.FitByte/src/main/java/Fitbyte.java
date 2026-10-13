public class Fitbyte {
    // (maximum heart rate - resting heart rate) * (target heart rate percentage) +
    // resting heart rate
    private double restingHeartRate;
    private int age;

    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    public double targetHeartRate(double percentageOfMaximum) {
        double maximumHeartRate = 206.3 - (0.711 * this.age);
        return (maximumHeartRate - this.restingHeartRate) * percentageOfMaximum + this.restingHeartRate;
    }
}
