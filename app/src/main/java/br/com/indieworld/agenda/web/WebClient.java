package br.com.indieworld.agenda.web;

import android.support.annotation.Nullable;

import java.io.IOException;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * Created by Junior on 17/09/2017.
 */

public class WebClient {

    public String post(String json){
        String endereco = "https://www.caelum.com.br/mobile";
        return realizaConexao(json, endereco);

    }

    @Nullable
    private String realizaConexao(String json, String endereco) {
        try {
            URL url = new URL(endereco);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("content-type", "application/json");
            connection.setRequestProperty("Accept", "application/json");

            connection.setDoOutput(true);
            PrintStream output = new PrintStream(connection.getOutputStream());
            output.println(json);

            connection.connect();
            Scanner scanner = new Scanner(connection.getInputStream());
            String resposta = scanner.next();

            return resposta;
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
