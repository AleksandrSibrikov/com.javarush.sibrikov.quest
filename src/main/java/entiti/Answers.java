package entiti;
import lombok.Getter;

@Getter
public class Answers {
    private final String text;
    private final boolean wrongAnswer;
    private String wrongAnswerEndText;

    public Answers(String text, String wrongAnswerEndText) {
        this.text = text;
        this.wrongAnswerEndText = wrongAnswerEndText;
        this.wrongAnswer = true;
    }

    public Answers(String text) {
        this.text = text;
        this.wrongAnswer = false;
    }
}
