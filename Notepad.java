import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Notepad extends Frame implements ActionListener {
    TextArea textArea;
    MenuBar menuBar;
    Menu fileMenu;
    MenuItem newMenuItem, openMenuItem, saveMenuItem, exitMenuItem;

    public Notepad() {
        setTitle("Notepad");
        setSize(500, 500);
        setLocationRelativeTo(null);

        textArea = new TextArea();
        add(textArea);

        menuBar = new MenuBar();
        fileMenu = new Menu("File");

        newMenuItem = new MenuItem("New");
        newMenuItem.addActionListener(this);
        fileMenu.add(newMenuItem);

        openMenuItem = new MenuItem("Open");
        openMenuItem.addActionListener(this);
        fileMenu.add(openMenuItem);

        saveMenuItem = new MenuItem("Save");
        saveMenuItem.addActionListener(this);
        fileMenu.add(saveMenuItem);

        exitMenuItem = new MenuItem("Exit");
        exitMenuItem.addActionListener(this);
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);
        setMenuBar(menuBar);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newMenuItem) {
            textArea.setText("");
        } else if (e.getSource() == openMenuItem) {
            FileDialog fileDialog = new FileDialog(this, "Open", FileDialog.LOAD);
            fileDialog.setVisible(true);

            if (fileDialog.getFile() != null) {
                String fileName = fileDialog.getDirectory() + fileDialog.getFile();
                /* try {
                    
                    BufferedReader reader = new BufferedReader(new FileReader("D:\\adv java\\abc.txt"));
                    String line = null;
                    while ((line = reader.readLine()) != null) {
                        textArea.append(line + "\n");
                    }
                    reader.close();
                } catch (IOException ex) {
                    System.out.println("Error reading file: " + fileName);
                } */
            }
        } else if (e.getSource() == saveMenuItem) {
            FileDialog fileDialog = new FileDialog(this, "Save", FileDialog.SAVE);
            fileDialog.setVisible(true);

            if (fileDialog.getFile() != null) {
                String fileName = fileDialog.getDirectory() + fileDialog.getFile();
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
                    writer.write(textArea.getText());
                    writer.close();
                } catch (IOException ex) {
                    System.out.println("Error writing file: " + fileName);
                }
            }
        } else if (e.getSource() == exitMenuItem) {
            dispose();
        }
    }

    public static void main(String[] args) throws Exception {
        Notepad notepad = new Notepad();
        notepad.setVisible(true);
    }
}