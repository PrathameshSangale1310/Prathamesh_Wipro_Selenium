package Assignment6;

interface State {
    State next();
}

enum TrafficLight implements State {
    RED {
        public TrafficLight next() {
            return GREEN;
        }
    },
    GREEN {
        public TrafficLight next() {
            return YELLOW;
        }
    },
    YELLOW {
        public TrafficLight next() {
            return RED;
        }
    };
}


public class Q11 {

	public static void main(String[] args) {
		TrafficLight tl = TrafficLight.RED;

        System.out.println("Traffic Light:");
        for (int i = 1; i <= 6; i++) {
            System.out.println("Step " + i + ": " + tl);
            tl = (TrafficLight) tl.next();
        }

	}

}
