package com.example.consumer.entity;


import java.io.Serializable;


public class books implements Serializable {


    String bookname;

    String bookclass;

    String bookhref;
    String bookimg;

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBookclass() {
        return bookclass;
    }

    public void setBookclass(String bookclass) {
        this.bookclass = bookclass;
    }

    public String getBookhref() {
        return bookhref;
    }

    public void setBookhref(String bookhref) {
        this.bookhref = bookhref;
    }

    public String getBookimg() {
        return bookimg;
    }

    public void setBookimg(String bookimg) {
        this.bookimg = bookimg;
    }

    public books(String bookname) {
        this.bookname = bookname;
    }

    public books(String bookname, String bookclass, String bookhref, String bookimg) {
        this.bookname = bookname;
        this.bookclass = bookclass;
        this.bookhref = bookhref;
        this.bookimg = bookimg;
    }

    public books() {
    }
}
