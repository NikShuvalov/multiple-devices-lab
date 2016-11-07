package shuvalov.nikita.multipledeviceslab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);
        final TextView textView = (TextView)findViewById(R.id.user_prompt);
        final ImageView imageView = (ImageView)findViewById(R.id.icon);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(getText(R.string.answer_text));
                imageView.setImageResource(R.drawable.smiley);
            }
        });
    }
}
