package com.wickedwitchwarsaw.udacitynanodegreetourguideapp;

/**
 * Created by ZuZ on 14/06/2017.
 */
public class Phrase {

    private String translationPolish;
    private String translationEnglish;

    public Phrase(String translationPolish, String translationEnglish) {
        this.translationPolish = translationPolish;
        this.translationEnglish = translationEnglish;
    }

    public String getTranslationPolish() {
        return translationPolish;
    }

    public void setTranslationPolish(String translationPolish) {
        this.translationPolish = translationPolish;
    }

    public String getTranslationEnglish() {
        return translationEnglish;
    }

    public void setTranslationEnglish(String translationEnglish) {
        this.translationEnglish = translationEnglish;
    }
}
