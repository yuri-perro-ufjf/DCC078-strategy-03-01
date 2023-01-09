public class Player {
    private String name;
    private String lastAction;

    public String getName(){
        return this.name;
    }

    public String getLastAction(){
        return this.lastAction;
    }

    public Player(String name){
        this.name = name;
    }

    public void run(){
        Action action = new Action();
        this.lastAction = action.runAction(new ActionTypeRun(), this.name);
    }

    public void jump(){
        Action action = new Action();
        this.lastAction = action.runAction(new ActionTypeJump(), this.name);
    }

    public void sleep(){
        Action action = new Action();
        this.lastAction = action.runAction(new ActionTypeSleep(), this.name);
    }
}
