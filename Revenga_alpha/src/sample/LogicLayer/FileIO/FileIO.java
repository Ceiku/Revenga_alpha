package sample.LogicLayer.FileIO;

/**
 * Created by Macbook on 11/06/15.
 */

import javafx.stage.FileChooser;

import java.io.File;

public class FileIO
{
    private String path;
    private FileChooser fileChooser;


	public FileIO()
	{
        fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("All Files", "*.*"),
                new FileChooser.ExtensionFilter("Text Files", "*.txt"),
                new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif"),
                new FileChooser.ExtensionFilter("Audio Files", "*.wav", "*.mp3", "*.aac"));
	}

    public String getPath() {
        return path;
    }


    public boolean open() {
        File file = fileChooser.showOpenDialog(null);
        if (file != null){
            path = file.getAbsolutePath();
            return true;
        }
        return false;
    }

    public static String selectFilePath(){
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("All Files", "*.*"),
                new FileChooser.ExtensionFilter("Text Files", "*.txt"),
                new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif"),
                new FileChooser.ExtensionFilter("Audio Files", "*.wav", "*.mp3", "*.aac"));

        File file = fileChooser.showOpenDialog(null);
        if (file != null)
            return file.getAbsolutePath();
        return null;
    }
}