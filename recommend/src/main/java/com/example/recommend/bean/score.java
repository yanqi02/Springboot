package com.example.recommend.bean;

public class score implements Comparable<score>{
    private  String username;
    private double score;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }


    public score(String username, double score) {
        this.username = username;
        this.score = score;
    }
    @Override
    public int compareTo(score o) {
        return (int) (this.getScore()-o.score);//升序
    }

}
