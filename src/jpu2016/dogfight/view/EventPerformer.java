package jpu2016.dogfight.view;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.controller.Order;
import jpu2016.dogfight.controller.UserOrder;

import java.awt.event.KeyEvent;

import javafx.scene.input.KeyCode;

public class EventPerformer {

    private IOrderPerformer orderPerformer;

    public EventPerformer(IOrderPerformer orderPerformer) {
        this.orderPerformer = orderPerformer;

    }

    public void enventPerform(KeyEvent k) {
        switch (k.getKeyCode()) {
            // Player 1
            case KeyEvent.VK_Z: this.orderPerformer.orderPerform(new UserOrder(1, Order.UP));
                break; 
            case KeyEvent.VK_D: this.orderPerformer.orderPerform(new UserOrder(1, Order.RIGHT));
                break;
            case KeyEvent.VK_S: this.orderPerformer.orderPerform(new UserOrder(1, Order.DOWN));
                break;
            case KeyEvent.VK_Q: this.orderPerformer.orderPerform(new UserOrder(1, Order.LEFT));
                break;
            // Player 2
            case KeyEvent.VK_KP_UP: this.orderPerformer.orderPerform(new UserOrder(2, Order.UP));
                break;
            case KeyEvent.VK_KP_RIGHT: this.orderPerformer.orderPerform(new UserOrder(2, Order.RIGHT));
                break;
            case KeyEvent.VK_KP_DOWN: this.orderPerformer.orderPerform(new UserOrder(2, Order.DOWN));
                break;
            case KeyEvent.VK_KP_LEFT: this.orderPerformer.orderPerform(new UserOrder(2, Order.LEFT));
                break;
        }

    }

    private UserOrder keyCodeToUserOrder(int keyCode) {
        return null;
    }
}
