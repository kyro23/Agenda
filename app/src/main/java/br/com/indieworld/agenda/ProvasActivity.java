package br.com.indieworld.agenda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

import br.com.indieworld.agenda.model.Prova;

public class ProvasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provas);

        List<String> topicosPort = Arrays.asList("Sujeito", "Objeto direto", "Objeto Indireto");
        Prova provaPortugues = new Prova("Portuges", "23/09/2017", topicosPort);

        List<String> topicosMat = Arrays.asList("Equações de 2 grau", "Trigonometria");
        Prova provaMatematica = new Prova("Matematica", "23/09/2017", topicosMat);

        List<Prova> provas = Arrays.asList(provaPortugues, provaMatematica);

        ArrayAdapter<Prova> adapter = new ArrayAdapter<Prova>(this, android.R.layout.simple_list_item_1, provas);

        ListView lista = (ListView) findViewById(R.id.provas_lista);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Prova prova = (Prova) adapterView.getItemAtPosition(i);
                Toast.makeText(ProvasActivity.this, "Clicou na prova de "+prova, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
