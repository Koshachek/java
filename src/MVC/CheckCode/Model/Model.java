package MVC.CheckCode.Model;

import java.util.concurrent.TimeUnit;

public class Model {
    private int pin = 12345;

    public int getPin() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}