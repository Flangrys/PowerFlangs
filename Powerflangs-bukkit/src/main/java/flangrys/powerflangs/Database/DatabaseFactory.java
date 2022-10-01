package flangrys.powerflangs.Database;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

import java.net.UnknownHostException;

public class DatabaseFactory {

    public DatabaseFactory(String name) {
         _PowerflangsDB = _mongoCli.getDB(name);
    }

    private static MongoClient _mongoCli;
    private static DB _PowerflangsDB;

    static {
        try {
            _mongoCli = new MongoClient();

        } catch (UnknownHostException e) {
            e.printStackTrace(); //End Database Process and SEND REPORT
        }
    }

    public static DBCollection getCollection(String _collection) {
        //TODO: Implements CACHE
        return _PowerflangsDB.getCollection(_collection);
    }
}
