package com.carolbarbosa.models;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Talk implements Serializable {

    private static final long serialVersionUID = 1L;

    private String title;
    private Integer priority;
    private Double duration;

    public Talk(String title, Double duration, Integer priority){
        this.title = title;
        this.duration = duration;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return this.title;
    }
}
