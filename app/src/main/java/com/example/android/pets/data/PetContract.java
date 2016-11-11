package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * Created by don on 11/11/16.
 */

public final class PetContract {

    private PetContract() {}// dead constructor

    public static class PetEntry implements BaseColumns {

        //----------------------------------------------------
        public static final String TABLE_NAME="pets";
        //----------------------------------------------------
        public static final String _ID =BaseColumns._ID;
        public static final String _ID_TYPE=" INTEGER PRIMARY KEY AUTOINCREMENT";
        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_NAME_TYPE=" TEXT NOT NULL";
                //
        public static final String COLUMN_PET_BREED="breed";
        public static final String COLUMN_PET_BREED_TYPE=" TEXT";
        //
        public static final String COLUMN_PET_GENDER="gender";
        public static final String COLUMN_PET_GENDER_TYPE = " INTEGER NOT NULL";
        //
        public static final String COLUMN_PET_WEIGHT="weight";
        public static final String COLUMN_PET_WEIGHT_TYPE = " INTEGER NOT NULL DEFAULT 0";
        //----------------------------------------------------
        public static final int GENDER_MALE =1;
        public static final int GENDER_FEMALE =2;
        public static final int GENDER_UNKNOWN =0;
        public static final String SEPERATOR =" ,";









    }



}
