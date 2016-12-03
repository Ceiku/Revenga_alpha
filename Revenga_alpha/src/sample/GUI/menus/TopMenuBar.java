package sample.GUI.menus;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

/**
 * Created by Daniel on 11/06/2016.
 */
public class TopMenuBar extends MenuBar {
    private String status;

    public TopMenuBar(){
        super();
        status = "";

        Menu file,edit,view, help;
        MenuItem open, save, exit, settings, dotplot;


        file = new Menu("File");
        edit = new Menu("Edit");
        view = new Menu("View");
        help = new Menu("Help");
        getMenus().addAll(file, edit, view, help);

        open = new MenuItem("Open");
        save = new MenuItem("Save");
        settings = new MenuItem("Settings");
        exit = new MenuItem("Exit");

        open.setOnAction(e -> status = "Open");

        file.getItems().addAll(open, save, settings, exit);

        view.getItems().addAll();


        dotplot = new MenuItem("DotPlot");


    }
}
