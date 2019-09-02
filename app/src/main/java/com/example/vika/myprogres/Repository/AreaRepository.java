package com.example.vika.myprogres.Repository;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.example.vika.myprogres.Dao.AreaDao;

import com.example.vika.myprogres.ProgressDatabase;
import com.example.vika.myprogres.models.AreaModel;


import java.util.List;

public class AreaRepository {


    private AreaDao areaDao;
    private LiveData<List<AreaModel>> allArea;


    public AreaRepository(AreaDao areaDao, LiveData<List<AreaModel>> allArea) {
        this.areaDao = areaDao;
        this.allArea = allArea;
    }

    public void insert(AreaModel areaModel) {
        new AreaRepository.InsertAreaAsyncTask(areaDao).execute(areaModel);

    }

    public void update(AreaModel areaModel) {
        new AreaRepository.UpdateAreaAsyncTask(areaDao).execute(areaModel);
    }

    public void delete(AreaModel areaModel) {
        new AreaRepository.DeleteAreaAsyncTask(areaDao).execute(areaModel);
    }

    public void deleteAllTasks() {
        new AreaRepository.DeleteAllAreaAsyncTask(areaDao).execute();

    }

    public LiveData<List<AreaModel>> getAllTask() {
        return allArea;
    }

    private static class InsertAreaAsyncTask extends AsyncTask<AreaModel, Void, Void> {
        private AreaDao areaDao;

        public InsertAreaAsyncTask(AreaDao areaDao) {
            this.areaDao = areaDao;
        }

        @Override
        protected Void doInBackground(AreaModel... areaModel) {
            areaDao.insert(areaModel[0]);
            return null;
        }
    }


    private static class UpdateAreaAsyncTask extends AsyncTask<AreaModel, Void, Void> {
        private AreaDao areaDao;

        public UpdateAreaAsyncTask(AreaDao areaDao) {
            this.areaDao = areaDao;
        }

        @Override
        protected Void doInBackground(AreaModel... areaModel) {
            areaDao.update(areaModel[0]);
            return null;
        }
    }

    private static class DeleteAreaAsyncTask extends AsyncTask<AreaModel, Void, Void> {
        private AreaDao areaDao;

        public DeleteAreaAsyncTask(AreaDao areaDao) {
            this.areaDao = areaDao;
        }

        @Override
        protected Void doInBackground(AreaModel... areaModel) {
            areaDao.delete(areaModel[0]);
            return null;
        }
    }

    private static class DeleteAllAreaAsyncTask extends AsyncTask<Void, Void, Void> {
        private AreaDao areaDao;

        public DeleteAllAreaAsyncTask(AreaDao areaDao) {
            this.areaDao = areaDao;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            areaDao.deleteAllAreas();
            return null;
        }
    }


}
