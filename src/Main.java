public class Main {

    public static void main(String[] args) {
        Chat chat = new Chat();


        User user1 = new User("Georgi ");
        User user2 = new User("Victoria ");
        User user3 = new User( "Silvia ");

        chat.addUser(user1);
        chat.addUser(user2);
        chat.addUser(user3);

        user1.send("Hi!");
        user2.send("addBot");
        user3.send("cat");







    }
}
