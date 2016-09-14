/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
/**
 *
 * @author manish
 */
public class OpenBrowser {
    
    public static void openLink(String url) throws URISyntaxException, IOException
    {
        URI uri = new URI(url);
        if(Desktop.isDesktopSupported())
        {
            Desktop.getDesktop().browse(uri);
            
        }
       
    }
    /* Example:
    public static void main(String []args) throws URISyntaxException, IOException
    {
        int i = OpenBrowser.openLink("http://www.google.com");
    }
    */
}
