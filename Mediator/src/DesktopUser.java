public class DesktopUser extends User {
    private final String deskId;

    public DesktopUser(Long id, String name, Mediator mediator, String deskId) {
        super(id, name, mediator);
        this.deskId = deskId;
    }

    @Override
    public String toString() {
        return "[" + super.getId() + ", " + super.getName() + "][DESK_ID: " + deskId + "]";
    }

    @Override
    public void receive(String msg, User from) {
        System.out.println("" + this + " received: '" + msg + "' from id '" + from.getId() + "'");
    }
}
