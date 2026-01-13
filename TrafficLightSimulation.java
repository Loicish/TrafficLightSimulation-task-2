public class TrafficLightSimulation {

    private TrafficLight currentLight;

    public TrafficLightSimulation(TrafficLight currentLight) {
        this.currentLight = currentLight;
    }

    public void changeColor(TrafficLight light) {
        switch (light) {
            case RED:
                currentLight = TrafficLight.GREEN;
                break;
            case GREEN:
                currentLight = TrafficLight.YELLOW;
                break;
            case YELLOW:
                currentLight = TrafficLight.RED;
                break;
        }
    }

    public TrafficLight getCurrentLight() {
        return currentLight;
    }

    @Override
    public String toString() {
        return "Current traffic light color: " + currentLight;
    }
}
