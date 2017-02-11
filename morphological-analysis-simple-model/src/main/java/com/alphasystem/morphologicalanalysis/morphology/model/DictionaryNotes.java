package com.alphasystem.morphologicalanalysis.morphology.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.InputStream;
import java.nio.file.Path;

import static com.alphasystem.util.AppUtil.isInstanceOf;
import static java.util.Objects.hash;

/**
 * @author sali
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DictionaryNotes implements Comparable<DictionaryNotes> {

    protected final RootLetters rootLetters;
    protected String id;
    protected String fileName;
    protected Path filePath;
    protected InputStream inputStream;

    public DictionaryNotes(final RootLetters rootLetters) {
        if (rootLetters == null || rootLetters.isEmpty()) {
            throw new RuntimeException("RootLetters cannot be null.");
        }
        this.rootLetters = rootLetters;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RootLetters getRootLetters() {
        return rootLetters;
    }

    public boolean isEmpty() {
        return rootLetters == null || rootLetters.isEmpty();
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public Path getFilePath() {
        return filePath;
    }

    public void setFilePath(Path filePath) {
        this.filePath = filePath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getName() {
        return rootLetters.getName();
    }

    @Override
    public int hashCode() {
        return hash(getName());
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = super.equals(obj);
        if (isInstanceOf(DictionaryNotes.class, obj)) {
            DictionaryNotes other = (DictionaryNotes) obj;
            result = getName().equals(other.getName());
        }
        return result;
    }

    @Override
    public int compareTo(DictionaryNotes o) {
        return (o == null) ? 1 : getName().compareTo(o.getName());
    }

    @Override
    public String toString() {
        return getName();
    }

}
