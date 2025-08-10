package Assignment4;

abstract class SmartDevice {
    abstract void turnOn();
    abstract void turnOff();
    abstract void performFunction();
}


class SmartPhone extends SmartDevice {

    void turnOn() {
        System.out.println("SmartPhone is turning on...");
    }

    void turnOff() {
        System.out.println("SmartPhone is turning off...");
    }

    void performFunction() {
        System.out.println("SmartPhone is calling and browsing.");
    }
}


class SmartWatch extends SmartDevice {

    void turnOn() {
        System.out.println("SmartWatch is turning on...");
    }

    void turnOff() {
        System.out.println("SmartWatch is turning off...");
    }

    void performFunction() {
        System.out.println("SmartWatch is tracking fitness and showing time.");
    }
}


class SmartSpeaker extends SmartDevice {

    void turnOn() {
        System.out.println("SmartSpeaker is turning on...");
    }

    void turnOff() {
        System.out.println("SmartSpeaker is turning off...");
    }

    void performFunction() {
        System.out.println("SmartSpeaker is playing music and responding to voice commands.");
    }
}


public class Combinedq1 {

	public static void main(String[] args) {
		SmartDevice phone = new SmartPhone();
        SmartDevice watch = new SmartWatch();
        SmartDevice speaker = new SmartSpeaker();

        System.out.println("--- SmartPhone ---");
        phone.turnOn();
        phone.performFunction();
        phone.turnOff();

        System.out.println("\n--- SmartWatch ---");
        watch.turnOn();
        watch.performFunction();
        watch.turnOff();

        System.out.println("\n--- SmartSpeaker ---");
        speaker.turnOn();
        speaker.performFunction();
        speaker.turnOff();

	}

}
