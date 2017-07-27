package designpatterns.observer;

/**
 * 观察者模式，主题接口，可观察者
 * Created by chenBing on 2017/7/27.
 */
public interface Subject {
    /**
     * 注册观察者
     *
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     *
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 状态更新时通知所有观察者
     */
    void notifyObservers();

}
