package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Utils {

    Properties properties = new Properties();

   public String lerArquiProperties(String propriedadeDesejada) throws IOException, NullPointerException {
       InputStream in = this.getClass().getResourceAsStream("/application.properties");
       this.properties.load(in);
       return properties.getProperty(propriedadeDesejada);
   }

    public String removerChaves(String msg){
        String padronizar = "[^\\w- -:]";
        return msg.replaceAll(padronizar, "");
    }
}
