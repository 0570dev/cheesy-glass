package com.example.cheesy;

public class Quote {
    private String text;
    private String attribution;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAttribution() {
        return attribution;
    }

    public void setAttribution(String attribution) {
        this.attribution = attribution;
    }

    public static Quote q(String text, String attribution) {
        Quote q = new Quote();
        q.setAttribution(attribution);
        q.setText(text);
        return q;
    }
}
