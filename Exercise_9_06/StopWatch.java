package Exercise_9_06;

public class StopWatch {
    private long startTime;
    private long endTime;

    StopWatch(){
        startTime = System.currentTimeMillis();
    }
    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;

    }
    public void start(){
        startTime = System.currentTimeMillis();
        System.out.println(startTime);
    }
    public void end(){
        endTime = System.currentTimeMillis();
        System.out.println(endTime);
    }

    public long getElapsedTime(){
        return getEndTime() - getStartTime();
    }

}
