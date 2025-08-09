package com.wipro.thread;
class counterThread implements Runnable{
	private Counter counter;

    public void CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            counter.increment();
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
