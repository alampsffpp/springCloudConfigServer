package com.msxf.common;

import java.util.concurrent.Executors;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.RateLimiter;

public class RateLimiterTest {
    public static void main(String[] args) {
        testRateLimiter();
    }

    public static void testRateLimiter() {   
        ListeningExecutorService executorService = MoreExecutors
                .listeningDecorator(Executors.newFixedThreadPool(5));
        RateLimiter limiter = RateLimiter.create(4); // 每秒不超过4个任务被提交

        int num = 0 ;
        for (;;) {
            limiter.acquire(); // 请求RateLimiter, 超过permits会被阻塞
            num ++ ;
            executorService.submit(new Task("is "+ num));
        }
    }
}

class Task implements Runnable{
    String str;
    public Task(String str){
        this.str = str;
    }
    @Override
    public void run() {
        System.out.println("Task call execute.." + str);
    }

}