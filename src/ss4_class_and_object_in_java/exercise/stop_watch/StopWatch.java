package ss4_class_and_object_in_java.exercise.stop_watch;

import java.util.Date;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    public StopWatch() {
        this.startTime = new Date();
    }

     public Date getStartTime() {
        return this.startTime;
    }

     public Date getEndTime() {
        return this.endTime;
    }

    public void start() {
        this.startTime = new Date();
    }

    public void end() {
        this.endTime = new Date();
    }

    public long getElapsedTime() {
        return this.endTime.getTime() - startTime.getTime();
    }
}
