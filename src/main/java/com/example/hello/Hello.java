package com.example.hello;

public class Hello {

    private  long id;
    private  String content;
    private  String name;

    public Hello(long id, String content, String name) {
        this.id = id;
        this.content = content;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
		return name;
	}

	public String getContent() {
        return content;
    }
}