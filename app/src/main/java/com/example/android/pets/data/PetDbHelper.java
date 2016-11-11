package com.example.android.pets.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.android.pets.data.PetContract.PetEntry;

/**
 * Created by don on 11/11/16.
 */

public class PetDbHelper extends SQLiteOpenHelper {

    public  static final String DATABASE_NAME="shelter.db";
    public  static final int DATABASE_VERSION=1;


    public PetDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        //CREATE TABLE pets (_id INTEGER, name TEXT, breed TEXT, gender INTEGER, weight INTEGER);
          final String SQL_CREATE_DATABASE = "CREATE TABLE " + PetEntry.TABLE_NAME
                + " (" + PetEntry._ID + PetEntry._ID_TYPE + PetEntry.SEPERATOR
                + PetEntry.COLUMN_PET_NAME + PetEntry.COLUMN_PET_NAME_TYPE + PetEntry.SEPERATOR
                + PetEntry.COLUMN_PET_BREED + PetEntry.COLUMN_PET_BREED_TYPE + PetEntry.SEPERATOR
                + PetEntry.COLUMN_PET_GENDER + PetEntry.COLUMN_PET_GENDER_TYPE + PetEntry.SEPERATOR
                + PetEntry.COLUMN_PET_WEIGHT + PetEntry.COLUMN_PET_WEIGHT_TYPE + ");";


        db.execSQL(SQL_CREATE_DATABASE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
