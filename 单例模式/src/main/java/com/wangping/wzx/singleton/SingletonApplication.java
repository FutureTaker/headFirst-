package com.wangping.wzx.singleton;

import com.wangping.wzx.singleton.singletonfactory.InitSingleton;
import com.wangping.wzx.singleton.singletonfactory.SynerSingleton;
import com.wangping.wzx.singleton.singletonfactory.ThreadUnsafeSingleton;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SingletonApplication {

	public static void main(String[] args) {

		final ThreadUnsafeSingleton instance = ThreadUnsafeSingleton.getInstance();
		final ThreadUnsafeSingleton instance1 = ThreadUnsafeSingleton.getInstance();
		log.info("instance : {}",instance);
		log.info("instance1 : {}",instance1);
		log.info("instance == instance1 ? {} ", instance == instance1);

		final InitSingleton initSingleton = InitSingleton.getInstance();
		final InitSingleton initSingleton1 = InitSingleton.getInstance();
		log.info("initSingleton : {}",initSingleton);
		log.info("initSingleton1 : {}",initSingleton1);
		log.info("initSingleton == initSingleton1 ? {} ", initSingleton == initSingleton1);

		final SynerSingleton synerSingleton = SynerSingleton.getInstance();
		final SynerSingleton synerSingleton1 = SynerSingleton.getInstance();
		log.info("synerSingleton : {}",synerSingleton);
		log.info("synerSingleton : {}",synerSingleton1);
		log.info("synerSingleton == synerSingleton ? {} ", synerSingleton == synerSingleton1);


		SpringApplication.run(SingletonApplication.class, args);
	}

}

