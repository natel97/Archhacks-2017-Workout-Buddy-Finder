package archhacks.io.workoutbuddy;

/**
 * Created by natel on 10/28/2017.
 */

public class Message {

    private int messageFrom;
    private String messageBody;
    private int messageTo;

    public Message(int from, int to, String body){
        this.messageBody = body;
        this.messageFrom = from;
        this.messageTo = to;
    }

    public int getSender(){return messageFrom;}
    public int getReceiver(){return messageTo;}
    public String getBody() {return messageBody;}

}
