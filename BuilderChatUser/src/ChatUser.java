import java.util.Objects;

public class ChatUser {
    private final Long UUID;
    private final String username;
    private final String password;

    private final String phoneNumber;
    private final String address;

    private ChatUser(ChatUserBuilder builder) {
        this.UUID = builder.UUID;
        this.username = builder.username;
        this.password = builder.password;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
    }
    public static class ChatUserBuilder {
        private final Long UUID;
        private final String username;
        private final String password;

        private String phoneNumber;
        private String address;

        public ChatUserBuilder(Long UUID, String username, String password) {
            this.UUID = UUID;
            this.username = username;
            this.password = password;
        }
        public ChatUserBuilder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public ChatUserBuilder address(String address) {
            this.address = address;
            return this;
        }
        public ChatUser build() {
            return new ChatUser(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ChatUser chatUser)) return false;
        return Objects.equals(UUID, chatUser.UUID) && Objects.equals(username, chatUser.username) && Objects.equals(password, chatUser.password) && Objects.equals(phoneNumber, chatUser.phoneNumber) && Objects.equals(address, chatUser.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(UUID, username, password, phoneNumber, address);
    }

    public Long getUUID() {
        return UUID;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }
}
