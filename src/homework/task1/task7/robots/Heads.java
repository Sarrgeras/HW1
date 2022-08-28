package homework.task1.task7.robots;

public enum Heads {
    SINGLE_TASKING_HEAD ("однозадачная голова"),
    MULTITASKING_HEAD ("многозадачная голова"),
    FLAGSHIP_HEAD ("управяющая голова");

    private final String head;

    Heads(String head){
        this.head = head;
    }

    public String getHead() {
        return head;
    }
}
