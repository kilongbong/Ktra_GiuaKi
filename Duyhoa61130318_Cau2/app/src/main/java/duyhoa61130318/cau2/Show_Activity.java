package duyhoa61130318.cau2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Show_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        //
        Intent BT = getIntent();
        // Lấy ra tên BH   , ==> ten file là:  tenBH.txt
        String tenBai = BT.getStringExtra("tenBT");



    }
}