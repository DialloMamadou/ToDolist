package bastien.todolist;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

class SendTaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_task);


        Button btnPartage = (Button)findViewById(R.id.buttonPartager);
        btnPartage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String titre = getIntent().getStringExtra("titre");

                Intent intent = new Intent(Intent.ACTION_SEND);

                intent.putExtra(Intent.EXTRA_TEXT, titre);

                intent.setType("text/plain");

                startActivity(Intent.createChooser(intent, "Partager"));
            }
        });


    }
}
