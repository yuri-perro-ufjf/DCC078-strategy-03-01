public class Action {
    public String runAction(ActionType actionType, String PlayerName){
        return actionType.exec(PlayerName);
    }
}
