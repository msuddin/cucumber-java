package application;

public class MainApplication {

    private String message;

    public void setInputString(String inputString) {
        this.message = inputString;
    }

    public String getInputString() {
        return "hello " + this.message;
    }
}
