package com.example.thigk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListForm extends AppCompatActivity {
    private List<XE> listxe;
    private ListView lvwxe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_form);

        listxe=new ArrayList<>();
        lvwxe=(ListView)findViewById(R.id.listitem);
        listxe.add(new XE(R.drawable.bione,"Red Bull One","$ 350","$ 449"));
        listxe.add(new XE(R.drawable.bifourprivew,"Blue One","$ 840","$ 950"));

        XeAdapter adapter=new XeAdapter(R.layout.itemlist,ListForm.this,listxe);
        lvwxe.setAdapter(adapter);
    }
}