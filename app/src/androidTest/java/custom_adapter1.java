import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.python_language_app.R;

import java.util.List;

public class custom_adapter1 extends ArrayAdapter<String> {
    private Context context;
    private List<String>values;

    public custom_adapter1(@NonNull Context context, int resource) {
        super(context, R.layout.list_oop, (List<String>) null);
        this.context=context;
        this.values=values;
    }
    @Override
    public View getView(int position , View convertView , ViewGroup parent){
        LayoutInflater inflater= LayoutInflater.from(context);
        View listItemView= inflater.inflate(R.layout.list_oop,parent,false);
        TextView textView = listItemView.findViewById(R.id.text_oop1);
        textView.setText(values.get(position));
        return listItemView;


    }
}
