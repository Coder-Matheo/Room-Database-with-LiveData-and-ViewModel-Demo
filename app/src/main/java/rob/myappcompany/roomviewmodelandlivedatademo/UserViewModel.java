package rob.myappcompany.roomviewmodelandlivedatademo;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class UserViewModel extends AndroidViewModel {

    MyRoomDatabase myRoomDatabase;

    public UserViewModel(@NonNull Application application) {
        super(application);

        myRoomDatabase = MyRoomDatabase.getInstance(application.getApplicationContext());

    }

    public LiveData<List<User>> getAllUsers(){
        return myRoomDatabase.userDao().findAllUsers();
    }
}
