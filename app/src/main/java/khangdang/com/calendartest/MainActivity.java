package khangdang.com.calendartest;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;


import com.applandeo.materialcalendarview.CalendarView;
import com.applandeo.materialcalendarview.EventDay;
import com.applandeo.materialcalendarview.listeners.OnDayClickListener;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    CalendarView calendarView;
    List<EventDay> events = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calendarView = (CalendarView) findViewById(R.id.calendarView);
        calendarView.showCurrentMonthPage();
        calendarView.setOnDayClickListener(new OnDayClickListener() {
            @Override
            public void onDayClick(EventDay eventDay) {
                Calendar clickedDayCalendar = eventDay.getCalendar();
                //Toast.makeText(MainActivity.this, "Hey", Toast.LENGTH_LONG).show();

            }
        });


        Calendar calendar = Calendar.getInstance();
        events.add(new EventDay(calendar, R.drawable.background_color_circle_selector));
        calendarView.setEvents(events);
//or


    }


}
