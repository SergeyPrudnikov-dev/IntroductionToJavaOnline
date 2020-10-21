package by.jonline.practice05.oop.task1.file;

import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
//вывести на консоль содержимое, дополнить, удалить.

public class Directory implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private Path path;
    private String pathString;

    public Directory(String pathString) throws IOException {
        super();
        this.pathString = pathString;
        path = Files.createDirectory(Paths.get(pathString));
    }

    public Directory() {
    }

    public Path getPath() {
        return path;
    }

    public void setPath(Path path) {
        this.path = path;
    }

    public String getPathString() {
        return pathString;
    }

    public void setPathString(String pathString) {
        this.pathString = pathString;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        Directory other = (Directory) obj;
        if (path == null) {
            if (other.path != null)
                return false;
        } else if (!path.equals(other.path)) {
            return false;
        }
        if (pathString == null) {
            if (other.pathString != null)
                return false;
        } else if (!pathString.equals(other.pathString)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((path == null) ? 0 : path.hashCode());
        result = prime * result + ((pathString == null) ? 0 : pathString.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Directory [path=" + path + ", pathString=" + pathString + "]";
    }
}
