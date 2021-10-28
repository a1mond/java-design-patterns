import java.util.ArrayList;
import java.util.List;

public class ChatTest {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediator();
        User mobUser1 = new MobileUser(100L, "Stephan", mediator, 1531593175137L);
        User mobUser2 = new MobileUser(101L, "Kyle", mediator, 1805117571357L);
        User deskUser1 = new DesktopUser(102L, "Meggie", mediator, "1983jf971h497");
        User deskUser2 = new DesktopUser(103L, "George", mediator, "j1894fn89jf11");

        mediator.addAll(List.of(mobUser1, mobUser2, deskUser1, deskUser2));

        mobUser1.send("Hello everyone!");

        System.out.println();

        deskUser1.send("Wassup");
    }
}
