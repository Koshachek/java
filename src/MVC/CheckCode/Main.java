package MVC.CheckCode;

import MVC.CheckCode.Controller.Controller;
import MVC.CheckCode.Model.Model;
import MVC.CheckCode.View.UserView;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        Controller controller = new Controller(model);
        UserView userView = new UserView(controller);
        SwingUtilities.invokeLater(()->{
            userView.init();
        });
    }
}
