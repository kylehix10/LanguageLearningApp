package com.model;

// Translation Exercise Class
public class Translation extends Exercise {

    protected Word answer;
    private boolean firstTry;

    /**
     * Parameterized Constructor
     * @param word Word word
     */
    public Translation(Word word) {
        firstTry = true;
        this.answer = word;
    }

    public Word getWord(){
        return answer;
    }

    public String getType(){
        return "translation";
    }

    public boolean getFirstTry(){
        return firstTry;
    }

    public void tried(){
        firstTry = false;
    }


    /**
     * Checks if user's answer is right
     * @param useranswer String of the user's answer
     * @return Boolean, true if right, false if wrong
     */
    public boolean isCorrect(String useranswer){
        return useranswer.trim().equalsIgnoreCase(answer.getMeaning());
    }

    public String toString(){
        return "The spanish translation for " + answer.getMeaning() + " is:";
    }
}
