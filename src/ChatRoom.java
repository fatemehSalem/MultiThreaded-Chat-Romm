import java.util.LinkedList;
import java.util.Queue;

public class ChatRoom {
    private Queue<String> messages = new LinkedList<>();

    public synchronized void sendMessage(String message) {
        messages.add(message);
        System.out.println("Message sent: " + message);
        notifyAll(); // Notify all users about the new message
    }

    public synchronized String receiveMessage() throws InterruptedException {
        while (messages.isEmpty()) {
            wait(); // Wait if no messages are available
        }
        String message = messages.poll();
        System.out.println("Message received: " + message);
        return message;
    }
}
