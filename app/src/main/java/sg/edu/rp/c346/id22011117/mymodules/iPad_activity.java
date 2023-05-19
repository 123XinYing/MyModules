package sg.edu.rp.c346.id22011117.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class iPad_activity extends AppCompatActivity {

    TextView tvCode2;
    TextView tvName2;
    TextView tvYear2;
    TextView tvSem2;
    TextView tvCredit2;
    TextView tvVenue2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ipad);

        Intent intentReceived = getIntent();
        tvCode2 = findViewById(R.id.textViewCode2);
        String moduleCode = intentReceived.getStringExtra("ModuleCode");
        tvCode2.setText("Module Code: " + moduleCode);

        tvName2 = findViewById(R.id.textViewName2);
        String moduleName = intentReceived.getStringExtra("ModuleName");
        tvName2.setText("Module Name: " + moduleName);

        tvYear2 = findViewById(R.id.textViewYear2);
        int moduleYear  = intentReceived.getIntExtra("AcademicYear",0);
        tvYear2.setText("Academic Year: " + moduleYear);

        tvSem2 = findViewById(R.id.textViewSem2);
        int moduleSem  = intentReceived.getIntExtra("Semester",0);
        tvSem2.setText("Semester: " + moduleSem);

        tvCredit2 = findViewById(R.id.textViewCredit2);
        int moduleCredit  = intentReceived.getIntExtra("ModuleCredit",0);
        tvCredit2.setText("Module Credit: " + moduleCredit);

        tvVenue2 = findViewById(R.id.textViewVenue2);
        String venue = intentReceived.getStringExtra("Venue");
        tvVenue2.setText("Venue: " + venue);
    }
}