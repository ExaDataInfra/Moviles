import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.opciones, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int idMenu = item.getItemId();

        if(idMenu == R.id.op1){
            System.out.println("Presionó la opción 1");
        }
        if(idMenu == R.id.op2){
            System.out.println("Presionó la opción 2");
        }
        if(idMenu == R.id.op3){
            System.out.println("Presionó la opción 3");
        }
        return super.onOptionsItemSelected(item);

    }
}
