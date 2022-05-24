package duyhoa61130318.cau1;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity {

    EditText nhapa;
    EditText nhapb;
    EditText nhaph;
    Button tinhChuvi, tinhDientich;
    TextView ketqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        nhapa = (EditText) findViewById ( R.id.nhapa );
        nhapb = (EditText) findViewById ( R.id.nhapb );
        nhaph = (EditText) findViewById ( R.id.nhaph );
        tinhChuvi = (Button) findViewById ( R.id.tinhChuVi );
        tinhDientich = (Button) findViewById ( R.id.tinhDienTich );
        ketqua = (TextView) findViewById ( R.id.ketqua );

        tinhChuvi.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt ( nhapa.getText ( ).toString ( ) );
                int b = Integer.parseInt ( nhapb.getText ( ).toString ( ) );
                int kqua = (a + b) * 2;
                ketqua.setText ( "Chu vi hinh binh hanh la: " + kqua );
            }
        } );


        tinhDientich.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt ( nhapa.getText ( ).toString ( ) );
                int h = Integer.parseInt ( nhaph.getText ( ).toString ( ) );
                int kqua = a * h;
                ketqua.setText ( "Dien tich hinh binh hanh la: " + kqua );

            }
        } );


        FloatingActionButton fab = (FloatingActionButton) findViewById ( R.id.fab );
        fab.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View view) {
                Snackbar.make ( view, "Replace with your own action", Snackbar.LENGTH_LONG )
                        .setAction ( "Action", null ).show ( );
            }
        } );
    }
}
