package net.luvina.graphicseditor.main;

import net.luvina.graphicseditor.editor.GraphicsEditor;

public class Main {
	public static void main(String[] args) {
		GraphicsEditor editor = new GraphicsEditor();
		try {
			editor.openFile("image.gif");
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		editor.parseFile();
		editor.saveFile();
	}
}
