public class Timer {
    private ClockHand seconds;
    private ClockHand hundredths;

    public Timer() {
        seconds = new ClockHand(100);
        hundredths = new ClockHand(100);

    }

    public void advance() {
        seconds.advance();
        if (seconds.value() == 99) {
            // seconds = new ClockHand(100);
            hundredths.advance();
        }
    }

    public String toString() {
        return hundredths + ":" + seconds;
    }
}
