package homework.task1.task7.robots;

public enum Bodies {

    ATTACKING_BODY ("нападающий корпус"),
    ENGINEERING_BODY ("инженерный корпус"),
    PROTECTED_BODY ("защитный корпус");

    private final String body;

    Bodies(String body){
        this.body = body;
    }

    public String getBody() {
        return body;
    }

}
