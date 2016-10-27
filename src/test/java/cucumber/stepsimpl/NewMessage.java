package cucumber.stepsimpl;

import cucumber.api.java.en.When;
import cucumber.businessobjects.HeaderMenuBO;
import cucumber.businessobjects.NewMessageBO;

/**
 * Created by Roman_Monchyn on 10/26/2016.
 */
public class NewMessage {
    private NewMessageBO newMessageBO;
    private HeaderMenuBO headerMenuBO;

    public NewMessage() {
        newMessageBO = new NewMessageBO();
        headerMenuBO = new HeaderMenuBO();
    }

    //  WHEN

    @When("^user send message to receiver \"([^\"]*)\" with subject \"([^\"]*)\" and message \"([^\"]*)\"$")
    public void user_send_message_to_receiver_with_subject_and_message(String to, String subject, String message) {
        headerMenuBO.openNewMessageObject();

        newMessageBO.sendMessage(to, subject, message);
    }
}
