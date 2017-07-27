package disconf;

import org.springframework.stereotype.Service;

/**
 * Created by chenBing on 2017/7/24.
 */
@Service
public class JedisConfig {

    private String host;

    private int port;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
