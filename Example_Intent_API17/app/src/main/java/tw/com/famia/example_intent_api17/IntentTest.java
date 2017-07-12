package tw.com.famia.example_intent_api17;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Contacts;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class IntentTest extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        Button buttonTel = (Button) findViewById(R.id.ButtonTel);
        buttonTel.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                Uri uri=Uri.parse("tel:119");
                Intent i = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(i);
            }
        });

        Button buttonPeople = (Button) findViewById(R.id.ButtonPeople);
        buttonPeople.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW, Contacts.People.CONTENT_URI);
                startActivity(i);
            }
        });


        Button buttonSms = (Button) findViewById(R.id.ButtonSms);
        buttonSms.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                Intent it = new Intent(Intent.ACTION_VIEW);
                it.putExtra("sms_body", "The SMS text");
                it.setType("vnd.android-dir/mms-sms");
                startActivity(it);
            }
        });

        Button buttonEmail = (Button) findViewById(R.id.ButtonEmail);
        buttonEmail.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                Uri uri=Uri.parse("mailto:03130000@me.mcu.edu.tw");
                Intent i=new Intent(Intent.ACTION_SENDTO,uri);
                startActivity(i);
            }
        });

        Button buttonCamera = (Button) findViewById(R.id.ButtonCamera);
        buttonCamera.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(i);
            }
        });

        Button buttonImage = (Button) findViewById(R.id.ButtonImage);
        buttonImage.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_GET_CONTENT);
                i.addCategory(Intent.CATEGORY_OPENABLE);
                i.setType("image/*");
                startActivityForResult(i, 0);
            }
        });

        Button buttonUrl = (Button) findViewById(R.id.ButtonUrl);
        buttonUrl.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                Uri uri=Uri.parse("http://www.google.com.tw/");
                Intent i=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(i);
            }
        });

        Button buttonGMap = (Button) findViewById(R.id.ButtonGMap);
        buttonGMap.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                Uri uri = Uri.parse("geo:24.984512, 121.342412");
                Intent i = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(i);
            }
        });

        Button buttonRoutePlan = (Button) findViewById(R.id.ButtonRoutePlan);
        buttonRoutePlan.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {

                String a ="https://www.google.com/maps/dir/%E5%8F%B0%E7%81%A3%E5%8F%B0%E5%8C%97%E5%B8%82%E4%B8%AD%E6%AD%A3%E5%8D%80%E5%85%AC%E5%9C%92%E8%B7%AF%E5%8F%B0%E5%8C%97%E8%BB%8A%E7%AB%99/%E5%8F%B0%E7%81%A3%E6%A1%83%E5%9C%92%E5%B8%82%E6%A1%83%E5%9C%92%E5%8D%80%E4%B8%AD%E6%AD%A3%E8%B7%AF%E6%A1%83%E5%9C%92%E7%81%AB%E8%BB%8A%E7%AB%99/@25.0050079,121.3452262,12z/data=!3m1!4b1!4m13!4m12!1m5!1m1!1s0x3442a9725c44de29:0x4e473a22539591ac!2m2!1d121.5169627!2d25.0475643!1m5!1m1!1s0x34681ee34594ac3f:0x8cac39b16aa24a7b!2m2!1d121.313545!2d24.989206?hl=zh-tw";

                Uri uri = Uri.parse(a);
                Intent i = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(i);

            }
        });

        Button buttonMarket = (Button) findViewById(R.id.ButtonMarket);
        buttonMarket.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                // 尋找某個應用程式
                Uri uri = Uri.parse("market://search?q=play");
                Intent it = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(it);
            }
        });

    }
}
