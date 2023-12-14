package fileHandling;

import java.util.List;

public interface WritableFile
{
   public boolean writeFile(String path, List<String>passwordVault);
}
