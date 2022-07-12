package com.gg;

public class Category {
    private String cname;
    private Book java;
    public String getCname() {
        return cname;
    }

    public Category(String cname, Book java) {
        this.cname = cname;
        this.java = java;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Book getJava() {
        return java;
    }

    public void setJava(Book java) {
        this.java = java;
    }
}
