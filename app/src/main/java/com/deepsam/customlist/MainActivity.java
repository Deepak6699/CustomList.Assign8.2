package com.deepsam.customlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView= (ListView) findViewById(R.id.listcustom);

        String Name[]={"a","b","c","d","e","f","g"};
        String Number[]={"12","21","34","65","78","90","89"};
        myAdapter adapter=new myAdapter(Name,Number);
        listView.setAdapter(adapter);
    }


    class myAdapter extends BaseAdapter{
        String Name[]=null;
        String Number[]=null;
        myAdapter(String Name[],String Number[]){
            this.Name=Name;
            this.Number=Number;
        }

        @Override
        public int getCount() {
            return Name.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater inflater=LayoutInflater.from(MainActivity.this);
            View view=inflater.inflate(R.layout.activity_custom_list,null);

            TextView textView= (TextView) view.findViewById(R.id.textView);
            String item1=Name[position];
            textView.setText(item1);
            TextView textView1= (TextView) view.findViewById(R.id.textView2);
            String item2=Number[position];
            textView1.setText(item2);
            return view;
        }
    }
}
