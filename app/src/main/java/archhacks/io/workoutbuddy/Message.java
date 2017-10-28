package archhacks.io.workoutbuddy;

/**
 * Created by natel on 10/28/2017.
 */

public class Message {

    private String messageFrom;
    private String messageBody;

    public Message(String fr, String bo){
        this.messageBody = bo;
        this.messageFrom = fr;
    }

    public String getSender(){return messageFrom;}
    public String getBody() {return messageBody;}

}
