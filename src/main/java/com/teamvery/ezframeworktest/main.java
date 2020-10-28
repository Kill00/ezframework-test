package com.teamvery.ezframeworktest;

import org.bukkit.plugin.java.JavaPlugin;
import me.kingcjy.ezframework.EzFramework;

public final class main extends JavaPlugin {

    @Override
    public void onEnable() {
        EzFramework.run(this);
    }
}
