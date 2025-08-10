package Assignment5;

public class Encapsulationq4 {
	private String lockerId;
    private boolean isLocked = true;
    private final String passcode;


    public Encapsulationq4(String lockerId, String passcode) {
        this.lockerId = lockerId;
        this.passcode = passcode;
    }

    public void lock() {
        isLocked = true;
        System.out.println("Locker is now locked.");
    }

    public boolean unlock(String inputCode) {
        SecurityManager security = new SecurityManager();
        if (security.verifyPasscode(inputCode)) {
            isLocked = false;
            System.out.println("Unlocked successfully.");
            return true;
        } else {
            System.out.println("Incorrect passcode. Locker remains locked.");
            return false;
        }
    }

    public boolean isLocked() {
        return isLocked;
    }

    private class SecurityManager {
        private boolean verifyPasscode(String input) {
            return passcode.equals(input);
        }
    }
	public static void main(String[] args) {
		Encapsulationq4 myLocker = new Encapsulationq4("LCK123", "secure123");

        System.out.println("Is locker locked? " + myLocker.isLocked());
        myLocker.unlock("wrong123");
        System.out.println("Is locker locked? " + myLocker.isLocked());

        myLocker.unlock("secure123");
        System.out.println("Is locker locked? " + myLocker.isLocked());

        myLocker.lock();
        System.out.println("Is locker locked? " + myLocker.isLocked());

	}

}
