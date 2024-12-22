package hust.soict.dsai.aims.screen.customer.controller;

import java.io.IOException;

import javax.swing.JFrame;

import hust.soict.dsai.aims.cart.Cart;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class CartScreen extends JFrame{
    private Cart cart;
    
    public CartScreen(Cart cart) {
        super ();
        
        this. cart = cart;
        
        JFXPanel fxPanel = new JFXPanel( ) ;
        this.add(fxPanel);
        
        this.setTitle("Cart");
        this. setVisible(true);
        Platform. runLater(new Runnable() {
            @Override
            public void run() {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("C:/Users/DELL/Downloads/eclipse/LAB05/AimsProject/src/hust/soict/dsai/aims/screen/customer/view/Cart.fxml"));
                    CartController controller = new CartController(cart);
                    loader. setController(controller);
                    Parent root = loader. load() ;
                    fxPanel.setScene(new Scene(root));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}