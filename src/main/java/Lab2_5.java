public class Lab2_5 implements Task{
    private final int seconds;
    private volatile boolean stopped = true;
    private Thread thread;

    public Lab2_5(int seconds) {
        if (seconds < 0) throw new IllegalArgumentException("Должно быть >= 0");
        this.seconds = seconds;
    }

    @Override
    public void start() {
        if (!stopped) return;

        stopped = false;

        thread = new Thread(() -> {
            for (int i = seconds; i >= 0 && !stopped; i--) {
                System.out.println("Осталось: " + i + " сек.");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ignored) {
                }
            }
            stopped = true;
        });
        thread.start();
    }

    @Override
    public void stop() {
        stopped = true;
        if (thread != null) {
            thread.interrupt();
        }
    }

    public static void main(String[] args) throws Exception {
        Task t = new Lab2_5(5);
        t.start();
        Thread.sleep(2500);
        t.stop();
    }
}

