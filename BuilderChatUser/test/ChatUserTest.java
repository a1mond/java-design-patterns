import org.junit.Assert;
import org.junit.Test;

public class ChatUserTest {
    @Test
    public void test() {
        ChatUser user1 = new ChatUser.ChatUserBuilder(8195719837591736L, "a1mond", "password")
                .phoneNumber("+98175891357")
                .address("aleja ken 99")
                .build();

        ChatUser user2 = new ChatUser.ChatUserBuilder(10587189357178365L, "not a1mond", "not password")
                .build();

        Assert.assertEquals(8195719837591736L, user1.getUUID(), 0);
        Assert.assertEquals("a1mond", user1.getUsername());
        Assert.assertEquals("password", user1.getPassword());
        Assert.assertEquals("+98175891357", user1.getPhoneNumber());
        Assert.assertEquals("aleja ken 99", user1.getAddress());

        Assert.assertEquals(10587189357178365L, user2.getUUID(), 0);
        Assert.assertEquals("not a1mond", user2.getUsername());
        Assert.assertEquals("not password", user2.getPassword());
        Assert.assertNull(user2.getPhoneNumber());
        Assert.assertNull(user2.getAddress());
    }
}
