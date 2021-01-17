package com.example.mydistrict;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView);

        listView.setOnItemClickListener(this);

        String d[] = new String[] {"Barguna", "Barisal", "Bhola", "Jhalokati", "Patuakhali", "Pirojpur",
                "Bandarban","Brahmanbaria","Chandpur", "Chittagong", "Comilla", "Cox Bazar", "Feni", "Khagrachari","Lakshmipur", "Noakhali", "Rangamati",
                "Dhaka" , "Faridpur",  "Gazipur", "Gopalganj", "Kishoreganj", "Madaripur", "Manikganj", "Munshiganj", "Narayanganj", "Narsingdi", "Rajbari", "Shariatpur", "Tangail",

                "Mymensingh", "Jamalpur", "Sherpur","Netrokona", "Bagerhat", "Chuadanga","Jessore", "Jhenaidah", "Khulna", "Kushtia", "Magura","Meherpur","Narail","Shatkhira",
                "Bogra","Jaipurhat", "Naogaon", "Natore", "Nawabganj", "Pabna", "Rajshahi", "Sirajganj",
                "Rangpur", "Nilphamari", " Dinajpur", "Panchagarh", "Gaibandha" ,"Kurigram", "Lalmonirhat","Thakurgaon",
                "Habiganj" , "Maulvibazar", "Sunamganj","Sylhet" };


        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,d);
        listView.setAdapter(arrayAdapter);


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String value = (String) listView.getItemAtPosition(position);

        if (value.equals("Barguna")) {
       Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse ("https://simple.wikipedia.org/wiki/Barguna_District"));
       startActivity(intent);
          }

          else if (value.equals(" Barisal")) {
              Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://simple.wikipedia.org/wiki/Barisal_District "));
              startActivity(intent);
          }

          else if (value.equals("Bhola")) {
              Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://simple.wikipedia.org/wiki/Bhola_District") );
              startActivity(intent);
          }

          else if (value.equals("Jhalokati")) {
         Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://simple.wikipedia.org/wiki/Jhalokati_District"));
            startActivity(intent);
          }

          else if (value.equals(" Patuakhali ")) {
              Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://simple.wikipedia.org/wiki/Patuakhali_District"));
              startActivity(intent);

          }
          else if (value.equals(" Pirojpur"));
        {
            Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://simple.wikipedia.org/wiki/Pirojpur_District"));
            startActivity(intent);
        }



         if (value.equals("Bandarban ")); {

            Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://simple.wikipedia.org/wiki/Bandarban_District "));
            startActivity(intent);
        }

        if (value.equals("Brahmanbaria"));
        {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://simple.wikipedia.org/wiki/Brahmanbaria_District"));
            startActivity(intent);

        } 


    }

   /* @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    } */
}