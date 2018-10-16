package com.adc.da.main.config;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
@EnableAsync
public class TaskExecutePool implements AsyncConfigurer {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Value("${core.pool.size}")
	private int corePoolSize;

	@Value("${max.pool.size}")
	private int maxPoolSize;

	@Value("${keep.alive.seconds}")
	private int keepAliveSeconds;

	@Value("${queue.capacity}")
	private int queueCapacity;

	@Bean
	public Executor myTaskAsyncPool() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(corePoolSize);
		executor.setMaxPoolSize(maxPoolSize);
		executor.setQueueCapacity(queueCapacity);
		executor.setKeepAliveSeconds(keepAliveSeconds);
		executor.setThreadNamePrefix("MyExecutor-");

		// rejection-policy：当pool已经达到max size的时候，如何处理新任务
		// CALLER_RUNS：不在新线程中执行任务，而是由调用者所在的线程来执行
		executor.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardPolicy());
		executor.initialize();
		return executor;
	}

	@Override
	public Executor getAsyncExecutor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
		// // 异步任务中异常处理
		// return new AsyncUncaughtExceptionHandler() {
		//
		// @Override
		// public void handleUncaughtException(Throwable arg0, Method arg1,
		// Object... arg2) {
		// logger.error("==========================" + arg0.getMessage() +
		// "=======================", arg0);
		// logger.error("exception method:" + arg1.getName());
		// }
		// };
		// TODO Auto-generated method stub
		return null;
	}
}