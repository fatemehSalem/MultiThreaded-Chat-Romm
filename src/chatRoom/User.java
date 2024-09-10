package chatRoom;

class User implements Runnable {
    private String name;
    private ChatRoom chatRoom;

    public User(String name, ChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                String message = "Hello from " + name + " - Message " + i;
                chatRoom.sendMessage(message);
                Thread.sleep(100); // Simulate some work before sending the next message
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
