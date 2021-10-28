import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements Mediator {
    private final List<User> users;

    public ChatMediator() {
        users = new ArrayList<>();
    }

    public ChatMediator(List<User> users) {
        this.users = users;
    }

    public void add(User user) {
        users.add(user);
    }

    public void addAll(List<User> users) {
        this.users.addAll(users);
    }

    @Override
    public void send(User from, String msg) {
        for (User user : users)
            if (!user.equals(from))
                user.receive(msg, from);
    }
}
