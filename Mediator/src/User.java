import java.util.Objects;

public abstract class User {
    private final Mediator mediator;
    private final String name;
    private final Long id;

    public User(Long id, String name, Mediator mediator) {
        this.id = id;
        this.name = name;
        this.mediator = mediator;
    }

    public void send(String msg) {
        System.out.println("" + this + " sent: '" + msg + "'");
        mediator.send(this, msg);
    }

    public Mediator getMediator() {
        return mediator;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public abstract String toString();
    public abstract void receive(String msg, User from);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return Objects.equals(name, user.name) && Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
