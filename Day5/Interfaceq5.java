package Assignment5;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

class TimeServer {
    public static interface Client {
        void updateTime(LocalDateTime now);
    }

    private List<Client> clients = new ArrayList<>();

    public void registerClient(Client client) {
        clients.add(client);
    }

    public void notifyClients() {
        LocalDateTime now = LocalDateTime.now();
        for (Client c : clients) {
            c.updateTime(now);
        }
    }
}

public class Interfaceq5 {

	public static void main(String[] args) {
		TimeServer server = new TimeServer();

        TimeServer.Client digitalClock = new TimeServer.Client() {
            public void updateTime(LocalDateTime now) {
                System.out.println("Digital Clock: " + now);
            }
        };

        TimeServer.Client logger = new TimeServer.Client() {
            public void updateTime(LocalDateTime now) {
                System.out.println("Logger: time updated at " + now);
            }
        };

        server.registerClient(digitalClock);
        server.registerClient(logger);
        server.notifyClients();

	}

}
