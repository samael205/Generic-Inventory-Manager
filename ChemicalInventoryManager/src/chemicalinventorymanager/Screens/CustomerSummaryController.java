/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chemicalinventorymanager.Screens;

import chemicalinventorymanager.Customer;
import chemicalinventorymanager.DatabaseManager;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author BENTSI-ENCHILL_e
 */
public class CustomerSummaryController implements Initializable {
    Customer customer;
    
    @FXML
    Label customerNameLabel;
    
    @FXML
    Label customerIdLabel;
    
    @FXML
    Label customerGenderLabel;
    
    @FXML
    Label customerTotalDebtLabel;
    
    @FXML
    TableView customerDebtsTable;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            customer = DatabaseManager.getCustomerWithId("1");
        } catch (SQLException ex) {
            Logger.getLogger(CustomerSummaryController.class.getName()).log(Level.SEVERE, null, ex);
        }
        customerNameLabel.setText(customer.getfullName());
        customerIdLabel.setText(customer.getID());
        customerGenderLabel.setText(customer.getGender());
    }  
}
