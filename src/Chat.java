import java.util.ArrayList;
import java.util.List;

public class Chat {

    private List<User> users;
    private List<String> messages;
    private BotSingleton botSingleton;

    public Chat() {
        users = new ArrayList<>();
        messages = new ArrayList<>();
    }

    public void addUser(User user){
        users.add(user);
        user.setChat(this);
        System.out.println("New user added to chat is: " + " "+ user.getName());
    }

    public void removeUser(User user){
        users.remove(user);
    }

    public void addMessage(User user, String message){
        for(User chatUser: this.users){
            if(user != chatUser){
                chatUser.receive(user,message);
            }
        }
        if(botSingleton == null ) {
            if (message.equals("addBot")){
                this.botSingleton = BotSingleton.getInstance();
            System.out.println(user.getName() + "added a bot to the chat. ");
            }
        } else if(botSingleton != null) {
            if (message.equals("cat")) {
                botSingleton.removeUser(user);
                System.out.println("Cat is forbidden word and " + " " + user.getName() + "is removed from the chat.");
            }
        }
        messages.add(message);
    }



}
