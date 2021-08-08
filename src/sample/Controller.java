package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public TextField txtField;
    public TextArea txtArea;
    public RadioButton btnInfo;
    public Label lblInfo;

    public void convert(ActionEvent actionEvent) {
        String txtCopy = txtField.getText().toLowerCase();
        StringBuilder risultato = new StringBuilder("");

        char[] array = txtCopy.toCharArray();

        for (int i = 0; i < array.length; i++) {
            switch (array[i]){
                case ' ':
                    risultato.append(' ');
                    break;
                case 'a':
                    risultato.append('\u16A8');
                    break;
                case 'b':
                    risultato.append('\u16D2');
                    break;
                case 'c':
                    risultato.append('\u16B3');
                    break;
                case 'd':
                    risultato.append('\u16DE');
                    break;
                case 'e':
                    risultato.append('\u16D6');
                    break;
                case 'f':
                    risultato.append('\u16A0');
                    break;
                case 'g':
                    risultato.append('\u16B7');
                    break;
                case 'h':
                    risultato.append('\u16BB');
                    break;
                case 'i':
                    risultato.append('\u16C1');
                    break;
                case 'j':
                    risultato.append('\u16E1');
                    break;
                case 'l':
                    risultato.append('\u16DA');
                    break;
                case 'm':
                    risultato.append('\u16D7');
                    break;
                case 'n':
                    risultato.append('\u16BE');
                    break;
                case 'o':
                    risultato.append('\u16DF');
                    break;
                case 'p':
                    risultato.append('\u16C8');
                    break;
                case 'r':
                    risultato.append('\u16B1');
                    break;
                case 's':
                    risultato.append('\u16CA');
                    break;
                case 't':
                    risultato.append('\u16CF');
                    break;
                case 'u':
                    risultato.append('\u16A2');
                    break;
                case 'x':
                    risultato.append('\u16C9');
                    break;
                case 'y':
                    risultato.append('\u16A3');
                    break;
                case 'w':
                    risultato.append('\u16B9');
                    break;
                default:
                    risultato.append('*');
                    break;
            }
        }

        System.out.println(risultato);

        String risultato2 = risultato.toString();

        txtArea.setText(risultato2);

        txtField.requestFocus();
        txtField.selectAll();
    }

    public void copia(ActionEvent actionEvent) {
        txtArea.requestFocus();
        txtArea.selectAll();
        txtArea.copy();
    }

    public void visualizzainfo(ActionEvent actionEvent) {
        if (btnInfo.isSelected())
            lblInfo.setVisible(true);
        else {
            lblInfo.setVisible(false);
            txtField.requestFocus();
        }
    }
}
