public class ActionTypeJump implements ActionType{
    public String exec(String playerName) {
        return "Player: " + playerName + " jumped!";
    }
}
