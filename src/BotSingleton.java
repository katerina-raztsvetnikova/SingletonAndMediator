

public class BotSingleton {

    private static BotSingleton instance;
    private static Chat chat;


    private BotSingleton(){

    }

    public static BotSingleton getInstance(){
        if(instance == null){
            instance = new BotSingleton();
            chat = new Chat();
        }
        return  instance;
    }

    public void removeUser(User user){
        this.chat.removeUser(user);
    }
}
