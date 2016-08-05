package com.jatin.diabetestracker;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.jatin.diabetestracker.db.SugarLevelTable;

/**
 * Created by JATIN on 05-08-2016.
 */
public class MyDbOpener extends SQLiteOpenHelper {

    public static final String DB_NAME = "diabetes_tracker";
    public static final int DB_VERSION  = 1;

    private static MyDbOpener myDbOpener = null;

    private MyDbOpener(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    public static SQLiteDatabase openReadableDatabase(Context c) {
        if (myDbOpener == null) {
            myDbOpener = new MyDbOpener(c);
        }
        return myDbOpener.getReadableDatabase();
    }

    public static SQLiteDatabase openWritableDatabase(Context c) {
        if (myDbOpener == null) {
            myDbOpener = new MyDbOpener(c);
        }
        return myDbOpener.getWritableDatabase();
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SugarLevelTable.TABLE_CREATE_CMD);
    }
}