package Multithread.ExecutorService;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public abstract class WaitTimeMonitoringExecutorService implements ExecutorService {

    private final ExecutorService target;

    public WaitTimeMonitoringExecutorService(ExecutorService target) {
        this.target = target;
    }

    @Override
    public <T> Future<T> submit(Callable<T> task) {
        final long startTime = System.currentTimeMillis();
        return target.submit(() -> {
                    final long queueDuration = System.currentTimeMillis() - startTime;
//                    log.debug("Task {} spent {}ms in queue", task, queueDuration);
                    return task.call();
                }
        );
    }

    @Override
    public <T> Future<T> submit(Runnable task, T result) {
        return submit(() -> {
            task.run();
            return result;
        });
    }

    @Override
    public Future<?> submit(Runnable task) {
        return submit(new Callable<Void>() {
            @Override
            public Void call() throws Exception {
                task.run();
                return null;
            }
        });
    }

    //...

}