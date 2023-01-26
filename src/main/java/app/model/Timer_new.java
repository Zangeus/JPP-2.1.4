package app.model;

import org.springframework.stereotype.Component;

@Component
public class Timer_new {

    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }
}
