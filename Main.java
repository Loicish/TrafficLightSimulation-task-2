void main() {
    class Main {

        public static void main(String[] args) {

            TrafficLightSimulation simulator =
                    new TrafficLightSimulation(TrafficLight.RED);

            for (int i = 0; i < 10; i++) {
                System.out.println(simulator.toString());
                simulator.changeColor(simulator.getCurrentLight());
            }
        }
    }
}