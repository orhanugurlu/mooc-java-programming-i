public class Timer {
    private ClockHand secondsHand;
    private ClockHand hundrethsHand;

    public Timer() {
        secondsHand = new ClockHand(60);
        hundrethsHand = new ClockHand(100);
    }
    
    public void advance() {
        hundrethsHand.advance();
        if (hundrethsHand.value() == 0) {
            secondsHand.advance();
        }
    }

    @Override
    public String toString() {
        return secondsHand.toString() + ":" + hundrethsHand.toString();
    }
    
}
