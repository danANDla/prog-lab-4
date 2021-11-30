package enums;

public enum understanding {
    DEFAULT("usual knowledge"),
    PRACTICAL("practical knowledge"),
    THEORETICAL("theoretical knowledge");

    private String knowledge;

    understanding(String knowledge) {
        this.knowledge = knowledge;
    }

    public String getKnowledge() {
        return knowledge;
    }
}
