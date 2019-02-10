package com.wangping.wzx.observer;

import com.wangping.wzx.observer.subject.WeathData;
import com.wangping.wzx.observer.view.ForecastDisplay;
import com.wangping.wzx.observer.view.StatisticsDisplay;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObserverApplication {

	public static void main(String[] args) {
		WeathData weathData = new WeathData();
		weathData.setTemp(10f);
		weathData.setHumidity(0.7f);
		weathData.setPressure(10);

		final ForecastDisplay forecastDisplay = new ForecastDisplay(weathData);
		final StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weathData);

		weathData.setMeasureMent(80,65,30.4f);
		weathData.setMeasureMent(60,15,29.2f);

		SpringApplication.run(ObserverApplication.class, args);
	}

}

