package com.zjazn.dm._3_23种设计模式._9_外观模式;

import com.zjazn.dm._3_23种设计模式._9_外观模式._服务模块.*;

/**
 * 外观类
 */
public class HomeTheaterFacade {
    //定义各个模块系统对象
    private TheaterLight theaterLight;
    private Popcorn popcorn;
    private Stereo stereo;
    private Projector projector;
    private Screen screen;
    private DVDPlayer dVDPlayer;

    public HomeTheaterFacade() {
        this.theaterLight  = new TheaterLight();
        this.popcorn  = new Popcorn();
        this.stereo  = new Stereo();
        this.projector  = new Projector();
        this.screen  = new Screen();
        this.dVDPlayer  = new DVDPlayer();
    }


    //操作分成 4 步,接口聚合
    public void ready() {
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dVDPlayer.on();
        theaterLight.dim();
    }

    public void play() {
        dVDPlayer.play();
    }

    public void pause() {
        dVDPlayer.pause();
    }

    public void end() {
        popcorn.off();
        theaterLight.bright();
        screen.up();
        projector.off();
        stereo.off();
        dVDPlayer.off();
    }
}
