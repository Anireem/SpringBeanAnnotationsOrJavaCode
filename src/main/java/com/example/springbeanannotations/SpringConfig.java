package com.example.springbeanannotations;

import com.example.springbeanannotations.components.ClassicMusic;
import com.example.springbeanannotations.components.Computer;
import com.example.springbeanannotations.components.MusicPlayer;
import com.example.springbeanannotations.components.RockMusic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.example.springbeanannotations.components")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    /**
     * @Bean используется когда не используем @ComponentScan, @Component, @Autowired
     * В этом случае описываем создание бинов вручную
     * Ниже приведен  закомментированный пример описания создания бинов вручную
     * https://www.youtube.com/watch?v=stuAmyyootQ&list=PLAma_mKffTOR5o0WNHnY0mTjKxnCgSXrZ&index=13
     */

//    @Bean
//    public ClassicMusic classicMusic() {
//        return new ClassicMusic();
//    }
//
//    @Bean
//    public RockMusic rockMusic() {
//        return new RockMusic();
//    }
//
//    @Bean
//    MusicPlayer musicPlayer() {
//        return new MusicPlayer(rockMusic());
//    }
//
//    @Bean
//    Computer computer() {
//        return new Computer(musicPlayer());
//    }

}
