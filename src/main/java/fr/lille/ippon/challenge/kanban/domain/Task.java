package fr.lille.ippon.challenge.kanban.domain;

import java.io.Serializable;

public class Task implements Serializable {

    private int id;

    private String title;

    private State state;

    public enum State {
        TO_DO, DOING, DONE
    }

    public Task() {
    }

    public Task(String title, State state, int id) {
        this.title = title;
        this.state = state;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
