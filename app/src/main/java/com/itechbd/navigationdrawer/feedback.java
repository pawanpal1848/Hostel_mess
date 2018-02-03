package com.itechbd.navigationdrawer;

import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class feedback  extends AppCompatActivity {

    EditText mailMessage;
    private TextView mailTo;
    private TextView mailSubject;
    Button sendEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_settings);

        mailTo = (TextView) findViewById(R.id.editText1);
        mailSubject = (TextView)findViewById(R.id.editText2);
        mailMessage = (EditText)findViewById(R.id.editText3);

        sendEmail = (Button)findViewById(R.id.sendMail);
        sendEmail.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                //Get and Set editText value in String.
                String to = mailTo.getText().toString();
                String subject = mailSubject.getText().toString();
                String message = mailMessage.getText().toString();

                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{ to});
                email.putExtra(Intent.EXTRA_SUBJECT, subject);
                email.putExtra(Intent.EXTRA_TEXT, message);

                //This will show prompts of email intent
                email.setType("message/rfc822");
                startActivity(Intent.createChooser(email, "Choose an Email sender :"));
            }

        });
    }

}
