package com.example.vika.myprogres.Repository;

import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.example.vika.myprogres.Dao.ProfileDao;
import com.example.vika.myprogres.models.ProfileModel;

import java.util.List;

public class ProfileRepository {


    private ProfileDao profileDao;
    private LiveData<List<ProfileModel>> allProfile;


    public ProfileRepository(ProfileDao profileDao, LiveData<List<ProfileModel>> allProfile) {
        this.profileDao = profileDao;
        this.allProfile = allProfile;
    }

    public void insert(ProfileModel profileModel) {
        new ProfileRepository.InsertProfileAsyncTask(profileDao).execute(profileModel);

    }

    public void update(ProfileModel profileModel) {
        new ProfileRepository.UpdateProfileAsyncTask(profileDao).execute(profileModel);
    }

    public void delete(ProfileModel profileModel) {
        new ProfileRepository.DeleteProfileAsyncTask(profileDao).execute(profileModel);
    }

    public void deleteAllTasks() {
        new DeleteAllProfileAsyncTask(profileDao).execute();

    }

    public LiveData<List<ProfileModel>> getAllProfile() {
        return allProfile;
    }

    private static class InsertProfileAsyncTask extends AsyncTask<ProfileModel, Void, Void> {
        private ProfileDao profileDao;

        public InsertProfileAsyncTask(ProfileDao profileDao) {
            this.profileDao = profileDao;
        }

        @Override
        protected Void doInBackground(ProfileModel... profileModels) {
            profileDao.insert(profileModels[0]);
            return null;
        }
    }


    private static class UpdateProfileAsyncTask extends AsyncTask<ProfileModel, Void, Void> {
        private ProfileDao profileDao;

        public UpdateProfileAsyncTask(ProfileDao profileDao) {
            this.profileDao = profileDao;
        }

        @Override
        protected Void doInBackground(ProfileModel... profileModels) {
            profileDao.update(profileModels[0]);
            return null;
        }
    }

    private static class DeleteProfileAsyncTask extends AsyncTask<ProfileModel, Void, Void> {
        private ProfileDao profileDao;

        public DeleteProfileAsyncTask(ProfileDao profileDao) {
            this.profileDao = profileDao;
        }

        @Override
        protected Void doInBackground(ProfileModel... profileModels) {
            profileDao.delete(profileModels[0]);
            return null;
        }
    }

    private static class DeleteAllProfileAsyncTask extends AsyncTask<Void, Void, Void> {
        private ProfileDao profileDao;

        public DeleteAllProfileAsyncTask(ProfileDao profileDao) {
            this.profileDao = profileDao;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            profileDao.deleteAllProfile();
            return null;
        }
    }


}
