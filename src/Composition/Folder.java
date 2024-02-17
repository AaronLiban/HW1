package Composition;

import java.util.Collections;
import java.util.ArrayList;

public class Folder {
    private String name;
    private ArrayList<Folder> subFolders = new ArrayList<>();
    private ArrayList<File> files = new ArrayList<>();

    public Folder() {

    }
    public Folder(String name, ArrayList<Folder> subFolders, ArrayList<File> files) {
        this.name = name;
        this.subFolders = subFolders;
        this.files = files;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Folder> getSubFolders() {
        return subFolders;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubFolders(ArrayList<Folder> subFolders) {
        this.subFolders = subFolders;
    }

    public void setFiles(ArrayList<File> files) {
        this.files = files;
    }

    public void addSubFolder(Folder folder) {
        subFolders.add(folder);
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void removeSubFolder(Folder folder) {
        subFolders.remove(folder);
    }

    public void removeFile(File file) {
        files.remove(file);
    }

    @Override
    public String toString() {
        String name = getName();
        String subFolders = "";
        for (Folder elements : getSubFolders()) {
            //subFolders += "   ";
            subFolders += elements.toString();
        }
        String files = "";
        for (File elements : getFiles()) {
            files += elements.toString();
            files += "\n   ";
        }
        return name + "\n   " +
                subFolders + "" +
                files;
    }

    public static String print(Folder folder) {
        int indent = 0;
        StringBuilder sb = new StringBuilder();
        printStructure(folder, indent, sb);
        return sb.toString();
    }

    private static void printStructure(Folder folder, int indent, StringBuilder sb) {
        sb.append(printIndent(indent));
        sb.append(folder.getName());
        sb.append("\n");
        for (Folder elements : folder.getSubFolders()) {
            printStructure(elements, indent + 1, sb);
        }
        for (File file : folder.getFiles()){
            printFile(file, indent + 1, sb);
        }
    }

    private static void printFile(File file, int indent, StringBuilder sb) {
        sb.append(printIndent(indent));
        sb.append(file.getName());
        sb.append("\n");
    }
    private static String printIndent(int indent) {
        StringBuilder sb = new StringBuilder();
        for (int i = indent; i > 0; i--) {
            sb.append("   ");
        }
        return sb.toString();
    }
}

