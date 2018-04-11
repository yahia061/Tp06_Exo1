package com.example.yaya.tp6;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private ArrayList<HashMap<String, String>> list;
    public static final String FIRST_COLUMN = "First";
    public static final String SECOND_COLUMN = "Second";
    public static final String THIRD_COLUMN = "Third";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.listView1);
        populateList();
        ListViewAdapter adapter = new ListViewAdapter(this, list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView t1 = (TextView) view.findViewById(R.id.textFirst);
                if (t1.getText().toString().equals("Compilation")) {
                    Toast.makeText(MainActivity.this, "Description  : Ça permet de voir en détail le fonctionnement d'un langage de programmation, Y compris dans des aspects obscurs et peu étudiés.\n" +
                            "Pour écrire du bon code, il faut avoir une idée de la façon dont il est traduit. L'étude de la compilation le permet.", Toast.LENGTH_LONG).show();

                } else if (t1.getText().toString().equals("Programmations Linéaires")) {
                    Toast.makeText(MainActivity.this, "Description :Introduction â la programmation lin´eaire Un outil qui permet de : • modéliser • résoudre toute une classe de problémes d’optimisation. Existence de solveurs eﬃcace pour la PL", Toast.LENGTH_LONG).show();

                } else if (t1.getText().toString().equals("Programmations Logiques")) {
                    Toast.makeText(MainActivity.this, "Description : une forme de programmation qui définit les applications à l'aide d'un ensemble de faits élémentaires les concernant et de règles de logique leur associant des conséquences plus ou moins directes. Ces faits et ces règles sont exploités par un démonstrateur de théorème ou moteur d'inférence, en réaction à une question ou requête.", Toast.LENGTH_LONG).show();

                } else if (t1.getText().toString().equals("Système d exploitation 2")) {
                    Toast.makeText(MainActivity.this, "Description  : Le système d'exploitation dirige l'utilisation de la mémoire. Il retient la liste des emplacements de mémoire utilisés, et par qui, ainsi que la liste des emplacements libres10. Le système d'exploitation réserve un emplacement de mémoire lorsqu'un processus le demande, et le libère lorsqu'il n'est plus utilisé, par exemple lorsque le processus s'est arrêté", Toast.LENGTH_LONG).show();

                } else if (t1.getText().toString().equals("Génie Logiciel-2")) {
                    Toast.makeText(MainActivity.this, "Description : une science de génie industriel qui étudie les méthodes de travail et les bonnes pratiques des ingénieurs qui développent des logiciels. Le génie logiciel s'intéresse en particulier aux procédures systématiques qui permettent d'arriver à ce que des logiciels de grande taille correspondent aux attentes du client, soient fiables, aient un coût d'entretien réduit et de bonnes performances tout en respectant les délais et les coûts de construction.", Toast.LENGTH_LONG).show();

                } else if (t1.getText().toString().equals("IHM")) {
                    Toast.makeText(MainActivity.this, "description : ", Toast.LENGTH_LONG).show();

                } else if (t1.getText().toString().equals("Intelligences Artificielles")) {
                    Toast.makeText(MainActivity.this, "Description :« l'ensemble de théories et de techniques mises en œuvre en vue de réaliser des machines capables de simuler l'intelligence »1. Elle correspond donc à un ensemble de concepts et de technologies plus qu'à une discipline autonome constituée. ", Toast.LENGTH_LONG).show();

                } else if (t1.getText().toString().equals("Anglais")) {
                    Toast.makeText(MainActivity.this, "Description :Est-ce une langue pour traiter avec les gens ", Toast.LENGTH_LONG).show();

                }


            }
        });


    }


    private void populateList() {

        list = new ArrayList<HashMap<String, String>>();

        HashMap<String, String> hashmap = new HashMap<String, String>();
        hashmap.put(FIRST_COLUMN, "nom du module");
        hashmap.put(SECOND_COLUMN, "charge horaire(H)");
        hashmap.put(THIRD_COLUMN, "coefficient");

        list.add(hashmap);

        HashMap<String, String> hashmap2 = new HashMap<String, String>();
        hashmap2.put(FIRST_COLUMN, "Compilation");
        hashmap2.put(SECOND_COLUMN, "4:30 h");
        hashmap2.put(THIRD_COLUMN, "02");

        list.add(hashmap2);

        HashMap<String, String> hashmap3 = new HashMap<String, String>();
        hashmap3.put(FIRST_COLUMN, "Programmations Logiques");
        hashmap3.put(SECOND_COLUMN, "03 h");
        hashmap3.put(THIRD_COLUMN, "02");

        list.add(hashmap3);

        HashMap<String, String> hashmap4 = new HashMap<String, String>();
        hashmap4.put(FIRST_COLUMN, "Système d exploitation 2");
        hashmap4.put(SECOND_COLUMN, "4:30 h");
        hashmap4.put(THIRD_COLUMN, "02");

        list.add(hashmap4);

        HashMap<String, String> hashmap5 = new HashMap<String, String>();
        hashmap5.put(FIRST_COLUMN, "Génie Logiciel-2");
        hashmap5.put(SECOND_COLUMN, "4:30 h");
        hashmap5.put(THIRD_COLUMN, "02");

        list.add(hashmap5);

        HashMap<String, String> hashmap6 = new HashMap<String, String>();
        hashmap6.put(FIRST_COLUMN, "IHM");
        hashmap6.put(SECOND_COLUMN, "03 h");
        hashmap6.put(THIRD_COLUMN, "02");

        list.add(hashmap6);

        HashMap<String, String> hashmap7 = new HashMap<String, String>();
        hashmap7.put(FIRST_COLUMN, "Intelligences Artificielles");
        hashmap7.put(SECOND_COLUMN, "03 h");
        hashmap7.put(THIRD_COLUMN, "02");

        list.add(hashmap7);

        HashMap<String, String> hashmap8 = new HashMap<String, String>();
        hashmap8.put(FIRST_COLUMN, "Programmations Linéaires");
        hashmap8.put(SECOND_COLUMN, "03 h");
        hashmap8.put(THIRD_COLUMN, "02");

        list.add(hashmap8);

        HashMap<String, String> hashmap9 = new HashMap<String, String>();
        hashmap9.put(FIRST_COLUMN, "Anglais");
        hashmap9.put(SECOND_COLUMN, "1:30 h");
        hashmap9.put(THIRD_COLUMN, "01");

        list.add(hashmap9);

    }

}
