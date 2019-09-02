package com.example.vika.myprogres;

import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.example.vika.myprogres.Dao.AreaDao;
import com.example.vika.myprogres.Dao.ProfileDao;
import com.example.vika.myprogres.Dao.TaskDao;
import com.example.vika.myprogres.models.AreaModel;
import com.example.vika.myprogres.models.ProfileModel;
import com.example.vika.myprogres.models.TaskModel;

@Database(entities = {AreaModel.class, TaskModel.class, ProfileModel.class}, version = 1)
public abstract class ProgressDatabase extends RoomDatabase {

    private static ProgressDatabase instance;

    public abstract AreaDao areaDao();

    public abstract TaskDao taskDao();

    public abstract ProfileDao profileDao();

    public static synchronized ProgressDatabase getInstance(Context context){

        if (instance == null){
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    ProgressDatabase.class, "progress_database")
                    .addCallback(callback)
                    .fallbackToDestructiveMigration()
                    .build();
        }

        return instance;
    }

    private static RoomDatabase.Callback  callback = new RoomDatabase.Callback(){
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            new PopulateDbAsyncTask(instance).execute();
        }
    };

    private static class PopulateDbAsyncTask extends AsyncTask<Void, Void, Void> {
        private TaskDao taskDao;
        private AreaDao areaDao;
       private PopulateDbAsyncTask(ProgressDatabase db){
           taskDao = db.taskDao();
           areaDao = db.areaDao();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            taskDao.insert(new TaskModel(1,"Закiнчити проект", "цiль", 0, null, null, null, null, null, 0));
            taskDao.insert(new TaskModel());


            areaDao.insert(new AreaModel(1, null, null, 0, 0));
            return null;
        }
    }

}
