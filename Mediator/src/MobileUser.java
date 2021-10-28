public class MobileUser extends User {
    private final Long deviceId;

    public MobileUser(Long id, String name, Mediator mediator, Long deviceId) {
        super(id, name, mediator);
        this.deviceId = deviceId;
    }

    @Override
    public String toString() {
        return "[" + super.getId() + ", " + super.getName() + "][DEV_ID: " + deviceId + "]";
    }

    @Override
    public void receive(String msg, User from) {
        System.out.println("" + this + " received: '" + msg + "' from id '" + from.getId() + "'");
    }
}
