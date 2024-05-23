package com.revolt;

public class History {

    public String date;
    public String difficulty;
    public String time;
    public String topic;
    public int score;
    public String id;
//    public int takeNo;

    public History(String date, String difficulty, String time, String topic, int score, String id){
        this.date = date;
        this.difficulty = difficulty;
        this.time = time;
        this.topic = topic;
        this.score = score;
        this.id = id;
//        this.takeNo = takeNo;
    }

    public int getScore() {
        return score;
    }
    public String getDate() {
        return date;
    }
    public String getDifficulty() {
        return difficulty;
    }
    public String getTime() {
        return time;
    }
    public String getTopic() {
        return topic;
    }

    public String getId() {
        return id;
    }

//    public int getTakeNo() {
//        return takeNo;
//    }
}