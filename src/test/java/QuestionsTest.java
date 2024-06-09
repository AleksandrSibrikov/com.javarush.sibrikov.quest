import entiti.Answers;
import entiti.Question;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import repository.Questions;

public class QuestionsTest {
    Questions questionManager = new Questions();

    @Test
    public void getByIdTest() {
        int questionId = 1;
        Question question = questionManager.getById(questionId);
        Assertions.assertEquals(questionId, question.getId());
    }

    @Test
    public void allTestHaveAnswersAndOnlyOneIsRight() {
        boolean result = true;
        for (Question question : Questions.questionList.values()) {
            if (question != null && question.getAnswerList().size() > 0) {
                int rightAnswerCount = 0;
                for(Answers answer : question.getAnswerList()) {
                    if (!answer.isWrongAnswer()) {
                        rightAnswerCount++;
                    } else {
                        if (answer.getWrongAnswerEndText() == null) {
                            result = false;
                            break;
                        }
                    }
                }
                if (rightAnswerCount > 1) {
                    result = false;
                    break;
                }
            } else {
                result = false;
                break;
            }
        }
        Assertions.assertTrue(result);
    }

}
