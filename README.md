# MultiThreaded-Chat-Romm
We have a ChatRoom class that simulates a chat room, where users can send and receive messages. Each user is represented by a separate thread, which interacts with the chat room by using the sendMessage method to post messages. The receiveMessage method is used by users to retrieve messages from the chat room.

Every user thread sends five messages to the chat room, with a brief delay between each one. The wait() method is employed in the receiveMessage method to make user threads wait when no messages are available in the chat room. The notifyAll() method is used to wake up all waiting user threads whenever a new message is added.
