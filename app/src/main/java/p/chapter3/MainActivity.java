package p.chapter3;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.BackgroundColorSpan;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Field;


public class MainActivity extends Activity {
    TextView textView;
    String[] strings;
    ListView listView;

    @TargetApi(Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        strings = new String[]{"a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5", "a1", "a2", "a3", "a4", "a5"};
//        textviewWidget();
//        AutoComplete();
        listView = (ListView) findViewById(R.id.listview1);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strings);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
        try {  //Bug 
            Field field = AbsListView.class.getDeclaredField("mFastScroller");
            field.setAccessible(true);
            Object object = field.get(listView);
            field = field.getType().getDeclaredField("mThumbDrawable");
            field.setAccessible(true);
            Drawable drawable=(Drawable)field.get(object);
            drawable=getResources().getDrawable(R.drawable.scroll_pic);
            Log.v("OK","1");
            field.set(object, drawable);
        } catch (Exception e) {
            Log.v("EXCPETION", e.getMessage());
        }

    }

    private void AutoComplete() {
        LinearLayout ll = new LinearLayout(this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        ll.setOrientation(LinearLayout.VERTICAL);
        ll.setLayoutParams(params);
        ll.setGravity(Gravity.TOP);
        AutoCompleteTextView act = new AutoCompleteTextView(this);
        act.setId(1);
        params.width = WindowManager.LayoutParams.MATCH_PARENT;
        params.height = WindowManager.LayoutParams.WRAP_CONTENT;
        params.setMargins(0, 10, 0, 0);
        act.setLayoutParams(params);
        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strings);
        act.setAdapter(arrayAdapter);
        act.setDropDownHeight(500);
        act.setThreshold(1);
        act.setCompletionHint("show the latest 5 history");
        act.setHint("enter the words you want to quarry");
        //AutoCompleteTextView 自身实现监听器，下面代码不用添加了
//        act.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View v, boolean hasFocus) {
//                if (hasFocus) {
//                    ((AutoCompleteTextView) v).showDropDown();
//                }
//            }
//        });


        ll.addView(act);
        setContentView(ll);
    }

    private void textviewWidget() {
//        textView = (TextView) findViewById(R.id.textview1);
//   通过设置CharSequence设置Textview图像
//        String html = "<body> <h1>This is a heading</h1>\n" +
//                "<h2>This is a heading</h2>\n" +
//                "<h3>This is a heading</h3>" +
//                "<img></img> </body>";
//        CharSequence charSequence = Html.fromHtml(html, new Html.ImageGetter() {
//            @Override
//            public Drawable getDrawable(String source) {
//                Drawable drawable = getResources().getDrawable(R.drawable.rabbit);
//                drawable.setBounds(0, 0, 100, 100);
//                return drawable;
//            }
//        }, null);
//        textView.setText(charSequence);

//   通过设置ImageSpan设置TextView图像
//        BitmapFactory.Options options = new BitmapFactory.Options();
//        options.inMutable=true;
//        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.rabbit,options);
//        bitmap.setHeight(200);
//        bitmap.setWidth(200);
//        ImageSpan imageSpan = new ImageSpan(this, bitmap);
//        SpannableString spannableString = new SpannableString("kkkiconkkk");
//        spannableString.setSpan(imageSpan, 3, 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
//        textView.setText(spannableString);

//   设置Textview点击开启activity
        String string1 = "apple<h1>Peach</h1><b>Banana</b><br>WatermelonAAABBBCCC";
        CharSequence charSequence = Html.fromHtml(string1);
        SpannableString spannableString = new SpannableString(charSequence);

        //设置为可点击的类型
        spannableString.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Intent intent = new Intent(MainActivity.this, MainActivity2Activity.class);
                startActivity(intent);
            }
        }, 21, 29, Spanned.SPAN_INCLUSIVE_INCLUSIVE);

        //设置背景色
        BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(Color.RED);
        spannableString.setSpan(backgroundColorSpan, 0, 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        //设置前景色
        CharacterStyle characterStyle = new CharacterStyle() {
            @Override
            public void updateDrawState(TextPaint tp) {
                tp.setColor(Color.BLUE);
            }
        };
        spannableString.setSpan(characterStyle, 5, 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        textView.setText(spannableString);

        textView.setMovementMethod(LinkMovementMethod.getInstance());

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
