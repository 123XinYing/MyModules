package sg.edu.rp.c346.id22011117.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class android_activity extends AppCompatActivity {
    TextView tvCode;
    TextView tvName;
    TextView tvYear;
    TextView tvSem;
    TextView tvCredit;
    TextView tvVenue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android);

        Intent intentReceived = getIntent();
        tvCode = findViewById(R.id.textViewCode);
        String moduleCode = intentReceived.getStringExtra("ModuleCode");
        tvCode.setText("Module Code: " + moduleCode);

        tvName = findViewById(R.id.textViewName);
        String moduleName = intentReceived.getStringExtra("ModuleName");
        tvName.setText("Module Name: " + moduleName);

        tvYear = findViewById(R.id.textViewYear);
        int moduleYear  = intentReceived.getIntExtra("AcademicYear",0);
        tvYear.setText("Academic Year: " + moduleYear);

        tvSem = findViewById(R.id.textViewSem);
        int moduleSem  = intentReceived.getIntExtra("Semester",0);
        tvSem.setText("Semester: " + moduleSem);

        tvCredit = findViewById(R.id.textViewCredit);
        int moduleCredit  = intentReceived.getIntExtra("ModuleCredit",0);
        tvCredit.setText("Module Credit: " + moduleCredit);

        tvVenue = findViewById(R.id.textViewVenue);
        String venue = intentReceived.getStringExtra("Venue");
        tvVenue.setText("Venue: " + venue);
    }
}