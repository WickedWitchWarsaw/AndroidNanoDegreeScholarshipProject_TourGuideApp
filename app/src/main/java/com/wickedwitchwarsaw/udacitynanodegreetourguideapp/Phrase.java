package com.wickedwitchwarsaw.udacitynanodegreetourguideapp;

/**
 * Created by ZuZ on 14/06/2017.
 */
public class Phrase {

    //Used for PhraseActivity
    private String translationPolish;
    private String translationEnglish;

    //Constructor in PhraseActivity
    public Phrase(String translationPolish, String translationEnglish) {
        this.translationPolish = translationPolish;
        this.translationEnglish = translationEnglish;
    }

    public String getTranslationPolish() {
        return translationPolish;
    }

    public String getTranslationEnglish() {
        return translationEnglish;
    }

}
