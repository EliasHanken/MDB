package me.streafe.MDB.MongoDB;

import com.mongodb.*;
import me.streafe.MDB.Main;
import org.bukkit.entity.Player;

import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

public class MDB{

    private MongoClient mongoClient;
    private DB database;

    private Main main;

    public MDB(){
        try {
            this.mongoClient = new MongoClient(new MongoClientURI(Main.getInstance().getConfig().getString("mongodb.uri")));
            this.database = this.mongoClient.getDB(Main.getInstance().getConfig().getString("mongodb.database"));
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    public DBCollection getCollection(String collection) {
        return this.database.getCollection(collection);
    }

    public DB getDatabase(){
        return this.database;
    }

    public void createPlayer(Player player){
        DBObject object = new BasicDBObject("uuid",player.getUniqueId().toString())
                .append("name",player.getName())
                .append("duelKills",0);
    }

    public void addFriend(Player player){
        List<String> v = Arrays.asList();
    }
}
