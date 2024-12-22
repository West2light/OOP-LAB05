package hust.soict.dsai.aims.screen.customer.controller;
import java.io.IOException;

import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.store.Store;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

public class ViewStoreController {
	private Store store;
	public ViewStoreController(Store store) {
		this.store = store;
	}

    @FXML
    private GridPane gridPane;

    @FXML
    public void initialize() {
    	final String ITEM_FXML_FILE_PATH = "/hust/soict/hedspi/aims/screen/customer/view/Item.fxml";
    	int column = 0;
    	int row = 1;
    	for (Media element : store.getItemsInStore()) {
			try {
				FXMLLoader fxmlLoader = new FXMLLoader();
				fxmlLoader.setLocation(getClass().getResource(ITEM_FXML_FILE_PATH));
				ItemController itemController = new ItemController();
				fxmlLoader.setController(itemController);
				AnchorPane anchorPane = new AnchorPane();
				anchorPane = fxmlLoader.load();
				itemController.setData(element);

				if (column == 3) {
					column = 0;
					row ++;
				}

				gridPane.add(anchorPane, column++, row);
				GridPane.setMargin(anchorPane, new Insets(20,10,10,10));
			} catch (IOException e) {
				e.printStackTrace();
			}
    	}
    }
    @FXML
    void btnViewCartPressed(ActionEvent event) {

    }

}