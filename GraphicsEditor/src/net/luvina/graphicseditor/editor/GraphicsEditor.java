package net.luvina.graphicseditor.editor;

import net.luvina.graphicseditor.file.BMP;
import net.luvina.graphicseditor.file.GIF;
import net.luvina.graphicseditor.file.JPG;
import net.luvina.graphicseditor.file.PNG;
import net.luvina.graphicseditor.services.iFile;

public class GraphicsEditor {
	private iFile file;

	public void openFile(String fileName) throws Exception {
		String extension = fileName.substring(fileName.length() - 3);
		switch (extension) {
		case "bmp":
			file = new BMP();
			break;
		case "gif":
			file = new GIF();
			break;
		case "png":
			file = new PNG();
			break;
		case "jpg":
			file = new JPG();
			break;
		default:
			throw (new Exception("I dont know this file"));
		}
		file.openFile(fileName);
	}
	
	public void parseFile() {
		file.parseFile();
	}

	public void saveFile() {
		file.saveFile();
	}
}
