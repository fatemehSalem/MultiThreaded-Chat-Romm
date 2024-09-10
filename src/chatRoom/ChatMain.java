package chatRoom;

public class ChatMain {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        Thread user1Thread = new Thread(new User("chatRoom.User 1", chatRoom));
        Thread user2Thread = new Thread(new User("chatRoom.User 2", chatRoom));

        user1Thread.start();
        user2Thread.start();

        try {
            user1Thread.join();
            user2Thread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}