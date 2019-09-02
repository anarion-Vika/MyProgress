package com.example.vika.myprogres.Repository;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.example.vika.myprogres.Dao.TaskDao;
import com.example.vika.myprogres.ProgressDatabase;
import com.example.vika.myprogres.models.TaskModel;

import java.util.List;

public class TaskRepository {
    private TaskDao taskDao;
    private LiveData<List<TaskModel>> allTask;

    public TaskRepository(Application application) {
        ProgressDatabase progressDatabase = ProgressDatabase.getInstance(application);
        taskDao = progressDatabase.taskDao();
        allTask = taskDao.getAllTask();
    }

    public void insert(TaskModel taskModel) {
        new InsertTaskAsyncTask(taskDao).execute(taskModel);

    }

    public void update(TaskModel taskModel) {
        new UpdateTaskAsyncTask(taskDao).execute(taskModel);
    }

    public void delete(TaskModel taskModel) {
        new DeleteTaskAsyncTask(taskDao).execute(taskModel);
    }

    public void deleteAllTasks() {
        new DeleteAllTaskAsyncTask(taskDao).execute();

    }

    public LiveData<List<TaskModel>> getAllTask() {
        return allTask;
    }

    private static class InsertTaskAsyncTask extends AsyncTask<TaskModel, Void, Void> {
        private TaskDao taskDao;

        private InsertTaskAsyncTask(TaskDao taskDao) {
            this.taskDao = taskDao;
        }

        @Override
        protected Void doInBackground(TaskModel... taskModels) {
            taskDao.insert(taskModels[0]);
            return null;
        }
    }


    private static class UpdateTaskAsyncTask extends AsyncTask<TaskModel, Void, Void> {
        private TaskDao taskDao;

        private UpdateTaskAsyncTask(TaskDao taskDao) {
            this.taskDao = taskDao;
        }

        @Override
        protected Void doInBackground(TaskModel... taskModels) {
            taskDao.update(taskModels[0]);
            return null;
        }
    }

    private static class DeleteTaskAsyncTask extends AsyncTask<TaskModel, Void, Void> {
        private TaskDao taskDao;

        private DeleteTaskAsyncTask(TaskDao taskDao) {
            this.taskDao = taskDao;
        }

        @Override
        protected Void doInBackground(TaskModel... taskModels) {
            taskDao.delete(taskModels[0]);
            return null;
        }
    }

    private static class DeleteAllTaskAsyncTask extends AsyncTask<Void, Void, Void> {
        private TaskDao taskDao;

        public DeleteAllTaskAsyncTask(TaskDao taskDao) {
            this.taskDao = taskDao;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            taskDao.deleteAllTask();
            return null;
        }
    }


}
