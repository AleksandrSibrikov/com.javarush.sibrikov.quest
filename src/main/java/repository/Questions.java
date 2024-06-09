package repository;
import entiti.Answers;
import entiti.Question;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Questions {
    public final static Map<Integer, Question> questionList = new HashMap<>();

    static {
        init();
    }
    private static void init() {
        int id = 0;
        questionList.put(++id, new Question(id, "Ты потерял память.\nПринять вызов НЛО?", List.of(
                new Answers("Принять вызов"),
                new Answers("Отклонить вызов", "Ты отклонил вызов. Поражение"))));

        questionList.put(++id, new Question(id, "Ты принял вызов. Поднимаешься на мостик к капитану?", List.of(
                new Answers("Подняться на мостик"),
                new Answers("Откзаться подниматься на мостик", "Ты не пошел на переговоры. Поражение."))));

        questionList.put(++id ,new Question(id, "Ты поднялся на мостик.\nТы кто?", List.of(
                new Answers("Солгать о себе", "Твою ложь разоблачили. Поражение."),
                new Answers("Рассказать правду"))));

        questionList.put(++id ,new Question(id, "Ты хочешь вернутся домой?", List.of(
                new Answers("Нет", "Ты улетел с ними. Поражение"),
                new Answers("Да"))));


    }
    public Question getById(int id) {
        return questionList.get(id);
    }
}
