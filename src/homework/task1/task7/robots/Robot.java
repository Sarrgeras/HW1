package homework.task1.task7.robots;

public class Robot<T> {

    private T name;
    Bodies body;
    Heads head;

    public Robot(){

    }

    public Robot(T name, Bodies body, Heads head){
        this.name = name;
        this.body = body;
        this.head = head;
    }

    @Override
    public String toString() {
        return "Имя робота: " + name +
                '\n' + "Характеристики: " + body.getBody() + "," +
                '\n' + head.getHead();
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public Bodies getBody() {
        return body;
    }

    public void setBody(Bodies body) {
        this.body = body;
    }

    public Heads getHead() {
        return head;
    }

    public void setHead(Heads head) {
        this.head = head;
    }
}
