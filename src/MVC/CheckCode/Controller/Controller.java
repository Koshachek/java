package MVC.CheckCode.Controller;

import MVC.CheckCode.Model.Model;

public class Controller {
    private Model model;

    public Controller(Model model) {
        this.model = model;
    }

    public boolean checkPin(int pin) {
        return model.getPin() == pin;
    }
}
