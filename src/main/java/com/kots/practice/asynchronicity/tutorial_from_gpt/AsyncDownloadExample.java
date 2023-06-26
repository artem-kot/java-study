package com.kots.practice.asynchronicity.tutorial_from_gpt;

/*
tutor: Imagine you have a Java program where you need to perform a time-consuming task, such as downloading a large file from the internet. However, you don't want the program to freeze or wait for the download to complete before continuing with other tasks. Instead, you want to make the download process asynchronous, allowing your program to perform other operations while the download is in progress.
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AsyncDownloadExample {
    public void downloadFileAsync(String url) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        System.out.println("Task: download file from " + url);
        Runnable downloadTask = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.print(".");
            }
            System.out.println();
        };
        System.out.println("Processing");

        executor.execute(downloadTask);
        executor.shutdown();
    }
}
