public class ActionTypeSleep implements ActionType{
    public String exec(String playerName) {
        return "Player: " + playerName + " now is sleeping!";
    }
}
