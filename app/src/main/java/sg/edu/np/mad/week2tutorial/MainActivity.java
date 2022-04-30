package sg.edu.np.mad.week2tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // enter data into the class
    User user = new User("name", "description", 10, true);

    @Override // onCreate() belong to AppCompatActivity -> need to override it
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username = findViewById(R.id.textView); // find where the name is in the layout
        username.setText(user.name); // set the name to the new name input

        TextView description = findViewById(R.id.textView2); // find where desc is in the layout
        username.setText(user.description); // set the desc to the new desc input

        // The button on the left will show “Follow” if the variable followed is false, and vice versa.
        Button followed = findViewById(R.id.button); // find the correct button in the layout
        followed.setText(user.followed ? "unfollow": "follow"); // allow the button to switch between the 2 text
        // true = unfollow, false = follow, the '?' acts like a if loop
        // e.g. if followed = true, then return unfollow

        // When the left button is clicked, it will toggle the text between Follow and Unfollow.
        followed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user.followed = !user.followed; // if value is true, it will change to false
                Button followed = findViewById(R.id.button);
                followed.setText(user.followed ? "unfollow": "follow");
            }
        });


    }

}