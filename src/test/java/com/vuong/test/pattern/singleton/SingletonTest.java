package com.vuong.test.pattern.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.vuong.pattern.singleton.*;

public class SingletonTest {

	private static final int THREAD_POOL = 50;

	public static void main(String... strings) {
		long start = System.nanoTime();
		run();
		
		long end = System.nanoTime();
		
		System.out.println("Performce" + (end - start));
	}

	private static void run() {
		ExecutorService executorService = Executors.newFixedThreadPool(THREAD_POOL);

		for (int i = 0; i < THREAD_POOL; i++) {
			executorService.execute(new Runnable() {

				@Override
				public void run() {
					Singleton7_Enum lazy = Singleton7_Enum.INSTANCE;
					System.out.println(lazy.hashCode());
				}
			});
		}

		executorService.shutdown();
		// Wait until all threads are finish
		while (!executorService.isTerminated()) {

		}
		System.out.println("\nFinished all threads");
	}
}
