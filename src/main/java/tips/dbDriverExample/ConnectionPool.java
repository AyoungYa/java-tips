package JavaTips.dbDriverExample;

import java.sql.Connection;
import java.util.LinkedList;

/**
 * <p>Description: </p>
 * <p>@author: Created by yangzeying</p>.
 * <p>@Date: 2019-06-08.</p>
 */
public class ConnectionPool {
    private LinkedList<Connection> pool = new LinkedList<Connection>();

    public ConnectionPool(int initSize) {
        if (initSize > 0) {
            for (int i = 0; i < initSize; i++) {
                pool.addLast(ConnectionDriver.createConnection());
            }
        }
    }

    public void releaseConnection(Connection connection) {
        if (connection != null) {
            synchronized (pool) {
                pool.addLast(connection);
                pool.notifyAll();
            }
        }
    }


    public Connection fetchConnection(long millis) throws InterruptedException {
        synchronized (pool) {
            if (millis <= 0) {
                while (pool.isEmpty()) {
                    wait(0);
                }
                return pool.removeFirst();
            }
        }
        return null;
    }
}
