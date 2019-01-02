package demo.manager;

import javax.faces.event.ActionEvent;

import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.nav.RichButton;

public class PopupManager {
    private RichButton popup;
    private RichPopup popupDialog;

    public PopupManager() {
    }

    public void setPopup(RichButton popup) {
        this.popup = popup;
    }

    public RichButton getPopup() {
        return popup;
    }

    public void setPopupDialog(RichPopup popupDialog) {
        this.popupDialog = popupDialog;
    }

    public RichPopup getPopupDialog() {
        return popupDialog;
    }
    
    public void popupHide (ActionEvent actionEvent){     
        popupDialog.hide();
    }
}
