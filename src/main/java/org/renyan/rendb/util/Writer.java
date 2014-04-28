package org.renyan.rendb.util;

import org.iq80.leveldb.DB;
import org.iq80.leveldb.WriteBatch;

import java.nio.charset.Charset;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by weirenyan on 14-4-20.
 */
public class Writer {
    private DB db;
    private WriteBatch batch;
    private ReentrantLock mutex;

    private Charset UTF8 = Charset.forName("utf-8");


    public void begin() {
        mutex.tryLock();
        batch = db.createWriteBatch();
    }

    public String get(String key) {

        db.get(key.getBytes(UTF8));

        return null;
    }

    public void commit() {
        db.write(batch);
        batch = null;
        mutex.unlock();
    }

    public void rollback() {

    }

    public void put(byte[] key, byte[] val) {
        batch.put(key, val);

    }

    public void delete(byte[] key) {
        batch.delete(key);
    }
}
