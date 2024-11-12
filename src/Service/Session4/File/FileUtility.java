package Service.Session4.File;

import Service.Session4.File.Exceptions.CantOpenFileException;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.Arrays;
import java.util.List;

public class FileUtility {

    public boolean write(String path, List<String> content) throws CantOpenFileException {

        try {
            Files.write(Paths.get(path), content, StandardCharsets.UTF_8);
        } catch (UnsupportedEncodingException e) {
            throw new CantOpenFileException("cant open");
        } catch (SecurityException e) {
            throw new CantOpenFileException("SecurityException");
        } catch (FileAlreadyExistsException e) {
            throw new CantOpenFileException("FileAlreadyExistsException");
        } catch (EOFException e) {
            throw new CantOpenFileException("EOFException");
        } catch (DirectoryNotEmptyException e) {
            throw new CantOpenFileException("DirectoryNotEmptyException");
        } catch (FileNotFoundException e) {
            throw new CantOpenFileException("FileNotFoundException");
        } catch (AccessDeniedException e) {
            throw new CantOpenFileException("AccessDeniedException");
        } catch (NotDirectoryException e) {
            throw new CantOpenFileException("NotDirectoryException");
        } catch (NoSuchFileException e) {
            throw new CantOpenFileException("NoSuchFileException");
        } catch (FileSystemException e) {
            throw new CantOpenFileException("FileSystemException");
        } catch (IOException e) {
            throw new CantOpenFileException("IOException");
        }
        return false;
    }

    public boolean read(String path) throws CantOpenFileException {

        Path p = Paths.get(path);
        try {
            List<String> lines = Files.readAllLines(p);
            System.out.println(lines);
            return true;
        } catch (SecurityException e) {
            throw new CantOpenFileException("SecurityException");
        } catch (FileAlreadyExistsException e) {
            throw new CantOpenFileException("FileAlreadyExistsException");
        } catch (EOFException e) {
            throw new CantOpenFileException("EOFException");
        } catch (DirectoryNotEmptyException e) {
            throw new CantOpenFileException("DirectoryNotEmptyException");
        } catch (FileNotFoundException e) {
            throw new CantOpenFileException("FileNotFoundException");
        } catch (AccessDeniedException e) {
            throw new CantOpenFileException("AccessDeniedException");
        } catch (NotDirectoryException e) {
            throw new CantOpenFileException("NotDirectoryException");
        } catch (NoSuchFileException e) {
            throw new CantOpenFileException("NoSuchFileException");
        } catch (UnsupportedEncodingException e) {
            throw new CantOpenFileException("UnsupportedEncodingException");
        } catch (FileSystemException e) {
            throw new CantOpenFileException("FileSystemException");
        } catch (IOException e) {
            throw new CantOpenFileException("IOException");
        }
    }
}
