/*
* File: Writefile.java
* Author: Vámosi László Ádám
* Copyright: 2025, Vámosi László Ádám
* Group: II-N
* Date: 2025-10-21
* GitHub: https://github.com/vamosilaszloadam/
* Licenc: MIT
*/

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class Writefile implements Writable {
    @Override
    public void writeContent(String content) {
        try {
            tryWriteContent(content);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
    public void tryWriteContent(String content) throws IOException {
        FileWriter writer = new FileWriter("adat.txt", Charset.forName("utf-8"));
        writer.write(content);
        System.out.println("Tartalom: ");
        System.out.println(content);
        writer.close();
    }

}
