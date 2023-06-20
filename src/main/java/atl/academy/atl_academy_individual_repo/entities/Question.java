package atl.academy.atl_academy_individual_repo.entities;

import java.util.List;

public class Question {
    private String category;
    private String question;
    private List<String> options;
    private Integer answer;
    private String explanation;

    public Question(){

    }

    public Question(String category, String question, List<String> options, Integer answer, String explanation){
        this.category = category;
        this.question = question;
        this.options = options;
        this.answer = answer;
        this.explanation = explanation;
    }

    public String getCategory() {
        return category;
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getOptions() {
        return options;
    }

    public Integer getAnswer() {
        return answer;
    }

    public String getExplanation() {
        return explanation;
    }
}
