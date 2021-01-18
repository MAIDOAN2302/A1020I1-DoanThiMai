package _04_OOP.bai_tap;

public class StopWatch {
    private long startTime, endTime;

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {

        return endTime;
    }

    public StopWatch() {
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsed() {
        return (this.endTime - this.startTime);
    }
}

