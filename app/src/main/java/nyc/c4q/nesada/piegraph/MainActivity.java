package nyc.c4q.nesada.piegraph;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    PieChart pieChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pieChart = (PieChart)findViewById(R.id.piegraph);
        final int[] MY_COLORS = {getResources().getColor(R.color.colorPrimary), getResources().getColor(R.color.colorAccent), getResources().getColor(R.color.colorPrimaryDark),
                getResources().getColor(R.color.colorA), getResources().getColor(R.color.colorB), getResources().getColor(R.color.colorC),getResources().getColor(R.color.colorD), getResources().getColor(R.color.colorAccent)};

        List<Integer> colors = new ArrayList<>();
        for(int c: MY_COLORS) colors.add(c);


        List<PieEntry> pieEntries = new ArrayList<>();
        pieEntries.add(new PieEntry(44f,0));
        pieEntries.add(new PieEntry(22f,1));
        pieEntries.add(new PieEntry(66f,2));
        pieEntries.add(new PieEntry(85f,3));
        pieEntries.add(new PieEntry(34f,4));
        pieEntries.add(new PieEntry(15f,5));
        pieEntries.add(new PieEntry(3f,6));
        pieEntries.add(new PieEntry(76f,7));
        PieDataSet pieDataSet = new PieDataSet(pieEntries, "Dates");
        pieDataSet.setColors(colors);
        PieData data = new PieData(pieDataSet);
        pieChart.setData(data);
        pieChart.invalidate();

    }
}
