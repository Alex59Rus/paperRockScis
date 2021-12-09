package com.company;

public class Field {
    private String playerFigure;
    private String botFigure;

    public void setPlayerFigure(String f1) {
        this.playerFigure = f1;
    }

    public void setBotFigure(String f2) {
        this.botFigure = f2;
    }

    public String getPlayerFigure () {
        return playerFigure;
    }
    public String getBotFigure () {
        return botFigure;
    }
    @Override
    public String toString() {
        return playerFigure + " " + botFigure;
    }
}