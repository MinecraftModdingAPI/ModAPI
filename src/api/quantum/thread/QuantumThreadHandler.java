package api.quantum.thread;

import api.quantum.enums.Side;
import api.quantum.meta.ThreadSafe;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * A handler that manages thread tasks.
 * @author PizzaCrust
 */
@ThreadSafe(Side.UNIVERSAL)
public class QuantumThreadHandler {
    /**
     * The executor service for QuantumThreadHandler
     */
    private ScheduledExecutorService quantumService;

    /**
     * Creates a new instance of QuantumThreadHandler
     */
    protected QuantumThreadHandler(){
        this.quantumService = Executors.newScheduledThreadPool(1);
    }

    /**
     * Gets the thread handler for Quantum
     * @return the thread handler
     */
    public static QuantumThreadHandler getThreadHandler(){
        return new QuantumThreadHandler();
    }

    /**
     * Schedules a repeating time runnable
     * @param runnable the runnable that will be repeated
     * @param initalDelay the inital delay before the task begins in milliseconds
     * @param period the period between executions in milliseconds
     */
    public void scheduleRepeatingTask(Runnable runnable, long initalDelay, long period){
        quantumService.scheduleAtFixedRate(runnable, initalDelay, period, TimeUnit.MILLISECONDS);
    }

    /**
     * Schedules a task with a delay
     * @param runnable the runnable that executes delayed
     * @param delay the delay before the runnable gets executed
     */
    public void delayTask(Runnable runnable, long delay){
        quantumService.scheduleWithFixedDelay(runnable, 0l, delay, TimeUnit.MILLISECONDS);
    }
}
