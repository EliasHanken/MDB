package me.streafe.MDB;

import me.streafe.MDB.MongoDB.MDB;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private static Main instance;
    public MDB MongoDB;

    public void onEnable(){
        this.instance = this;
        this.MongoDB = new MDB();
    }

    public static Main getInstance(){
        return instance;
    }

}
