package p.chapter3;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends Activity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textview1);
        //   通过设置CharSequence设置Textview图像
        String html = "<body> <h1>This is a heading</h1>\n" +
                "<h2>This is a heading</h2>\n" +
                "<h3>This is a heading</h3>" +
                "<img></img> </body>";
        CharSequence charSequence = Html.fromHtml(html, new Html.ImageGetter() {
            @Override
            public Drawable getDrawable(String source) {
                Drawable drawable = getResources().getDrawable(R.drawable.rabbit);
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                return drawable;
            }
        }, null);
        textView.setText(charSequence);

//   通过设置ImageSpan设置TextView图像
//        Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.dog);
//        ImageSpan imageSpan=new ImageSpan(this,bitmap);
//        SpannableString spannableString=new SpannableString("kkkiconkkk");
//        spannableString.setSpan(imageSpan,3,7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
//        textView.setText(spannableString);

//设置Textview点击开启activity
        String string1 = "open acvitiy";
        SpannableString spannableString = new SpannableString(string1);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
