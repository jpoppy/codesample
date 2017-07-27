package designpatterns.observer;

/**
 * 观察者，所有观察者实现此接口。
 * Created by chenBing on 2017/7/27.
 */
public interface Observer {

    void update(float temp, float humidity, float pressure);
}
