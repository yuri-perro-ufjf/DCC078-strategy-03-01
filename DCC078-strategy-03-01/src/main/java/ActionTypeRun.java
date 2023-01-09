public class ActionTypeRun implements ActionType{
    public String exec(String playerName) {
        return "Player: " + playerName + " now is running!";
    }
}
