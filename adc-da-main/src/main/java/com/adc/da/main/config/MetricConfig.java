package com.adc.da.main.config;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.codahale.metrics.ConsoleReporter;
import com.codahale.metrics.CsvReporter;
import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.Timer;

@Configuration
public class MetricConfig {

    @Bean
    public MetricRegistry metrics() {
        return new MetricRegistry();
    }

    /**
     * Reporter 数据的展现位置
     *
     * @param metrics
     * @return
     */
    @Bean
    public ConsoleReporter consoleReporter(MetricRegistry metrics) {
        return ConsoleReporter.forRegistry(metrics)
                .convertRatesTo(TimeUnit.SECONDS)
                .convertDurationsTo(TimeUnit.MILLISECONDS)
                .build();
    }

    @Bean
    public CsvReporter csvReporter(MetricRegistry metrics) {
        return CsvReporter.forRegistry(metrics)
                .convertRatesTo(TimeUnit.SECONDS)
                .convertDurationsTo(TimeUnit.MILLISECONDS)
                .build(new File("D:\\data"));
    }

//    @Bean
//    public Slf4jReporter slf4jReporter(MetricRegistry metrics) {
//        return Slf4jReporter.forRegistry(metrics)
//                .outputTo(LoggerFactory.getLogger("demo.metrics"))
//                .convertRatesTo(TimeUnit.SECONDS)
//                .convertDurationsTo(TimeUnit.MILLISECONDS)
//                .build();
//    }
//
//    @Bean
//    public JmxReporter jmxReporter(MetricRegistry metrics) {
//        return JmxReporter.forRegistry(metrics).build();
//    }

    /**
     * 计时器
     *
     * @param metrics
     * @return
     */
//    @Bean
//    public Timer responses(MetricRegistry metrics) {
//        return metrics.timer("executeTime");
//    }
}
