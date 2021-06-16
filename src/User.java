public class User {

    protected String name;
    protected Chat chat;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public void send(String message){
        System.out.println(this.name + "sending message: " + " "+ message);
        this.chat.addMessage(this, message);
    }

    public void receive(User user, String message){
        System.out.println(this.name + "received message from"+ " " + user.getName() + " - " + message);

    }


}
