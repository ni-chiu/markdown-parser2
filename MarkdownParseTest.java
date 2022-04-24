
import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import org.junit.*;
public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    @Test
    public void getLinksTest() throws IOException{
        Path fileName = Path.of("C:/Users/jolme/OneDrive/Documents/GitHub/markdown-parser/test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> something = new ArrayList<>();
        something.add("https://something.com");
        something.add("some-thing.html");
        assertEquals(something, links);
        
    }

    @Test
    public void getLinksTest2() throws IOException{
        Path fileName = Path.of("C:/Users/jolme/OneDrive/Documents/GitHub/markdown-parser/test2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> something = new ArrayList<>();
        assertEquals(something, links);
       

        
    }

    @Test
    public void getLinksTest3() throws IOException{
        Path fileName = Path.of("C:/Users/jolme/OneDrive/Documents/GitHub/markdown-parser/test3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> something = new ArrayList<>();
        assertEquals(something, links);
        

        
    }

    @Test
    public void getLinksTest4() throws IOException{
        Path fileName = Path.of("C:/Users/jolme/OneDrive/Documents/GitHub/markdown-parser/test4.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> something = new ArrayList<>();
        something.add("https://google.com");
        something.add("google.html");
        something.add("abc.com");
        assertEquals(something, links);        
    }
    @Test
    public void getLinksTestfile2() throws IOException{
        Path fileName = Path.of("C:/Users/jolme/OneDrive/Documents/GitHub/markdown-parser/TestFiles/markdown-parser-main/test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> something = new ArrayList<>();
        something.add("https://something.com");
        something.add("some-page.html");
        assertEquals(something, links);     
    }  
    @Test
    public void getLinksTestfile3() throws IOException{
        Path fileName = Path.of("C:/Users/jolme/OneDrive/Documents/GitHub/markdown-parser/TestFiles/markdown-parser-main/test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> something = new ArrayList<>();
        assertEquals(something, links);        
    }  
    @Test
    public void getLinksTestfile4() throws IOException{
        Path fileName = Path.of("C:/Users/jolme/OneDrive/Documents/GitHub/markdown-parser/TestFiles/markdown-parser-main/test-file4.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> something = new ArrayList<>();
        assertEquals(something, links);        
    }  
    @Test
    public void getLinksTestfile5() throws IOException{
        Path fileName = Path.of("C:/Users/jolme/OneDrive/Documents/GitHub/markdown-parser/TestFiles/markdown-parser-main/test-file5.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> something = new ArrayList<>();
        assertEquals(something, links);        
    }  
    @Test
    public void getLinksTestfile6() throws IOException{
        Path fileName = Path.of("C:/Users/jolme/OneDrive/Documents/GitHub/markdown-parser/TestFiles/markdown-parser-main/test-file6.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> something = new ArrayList<>();
        assertEquals(something, links);        
    }
    @Test
    public void getLinksTestfile7() throws IOException{
        Path fileName = Path.of("C:/Users/jolme/OneDrive/Documents/GitHub/markdown-parser/TestFiles/markdown-parser-main/test-file7.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> something = new ArrayList<>();
        assertEquals(something, links);        
    }
    @Test
    public void getLinksTestfile8() throws IOException{
        Path fileName = Path.of("C:/Users/jolme/OneDrive/Documents/GitHub/markdown-parser/TestFiles/markdown-parser-main/test-file8.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> something = new ArrayList<>();
        something.add("a link on the first line");
        assertEquals(something, links);        
    }   
    if((markdown.substring(openBracket -1, openBracket).equals("!")))
            {
                
            }
            else if(!markdown.substring(closeBracket + 1, closeBracket+2).equals("("))
            {
                
            }
            else 
            {
                toReturn.add(markdown.substring(openParen + 1, closeParen));
            }   


    
}
