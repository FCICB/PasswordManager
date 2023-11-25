package fileHandling;

import org.jetbrains.annotations.Contract;

import java.util.regex.Pattern;

public class TextFileReader implements ReadableFile
{
    Pattern pattern;
    public boolean read(String path)
    {
        return false;
    }
    @Contract(pure = true)
    private String extractor(String path)
    {
        return null;
    }
}
