package dinahelp.negocio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Guilherme Taffarel Bergamin
 * @author Akanbi Strossi de Jesus
 * @author Felipe Bochehin
 */
public class AjudaTextualNegocio {

    private File arquivoTexto;

    public void geraArquivoAjudaTextual(String caminho, String nomeArquivo, String texto) {
        try {
            arquivoTexto = new File(caminho + "\\" + nomeArquivo);
            FileWriter fw = new FileWriter(arquivoTexto);
            PrintWriter pw = new PrintWriter(fw);
            pw.write(texto);
            fw.close();
        } catch (IOException e) {
        }
    }

    public String carregarArquivoAjudaTextual(String caminho) {
        try {
            arquivoTexto = new File(caminho);
            BufferedReader buffer = new BufferedReader(new FileReader(arquivoTexto));
            String str = "";

            while (buffer.ready()) {
                str = str + buffer.readLine() + "\n\r";

            }
            return str;
        } catch (IOException e) {
        }
        return "";
    }
}
