package com.example.wasabiapp;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.util.Log;

import androidx.annotation.Nullable;

public class MyDataBaseBooking extends SQLiteOpenHelper {

    public static final int DB_VERSION =1;
    public static final String DB_NAME ="bookings.sqlite";
    public static final String TBL_NAME ="Warranty";
    public static final String COL_W_ID ="W_Id";
    public static final String COL_W_NAME ="W_Name";
    public static final String COL_W_DAY ="W_Day";
    public static final String COL_W_HOUR ="W_Hour";
    public static final String COL_W_DES ="W_Des";
    public static final String COL_W_PHOTO ="W_Photo";



    public MyDataBaseBooking(@Nullable Context context) {
        super(context,DB_NAME,null,DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String sql = "CREATE TABLE IF NOT EXISTS "+ TBL_NAME + "(" + COL_W_ID+ " INTEGER PRIMARY KEY AUTOINCREMENT, "+
                COL_W_NAME+ " VARCHAR(100), "+ COL_W_DAY+ " VARCHAR(100), "+ COL_W_HOUR+ " VARCHAR(100), "+ COL_W_DES+ " VARCHAR(200), "+ COL_W_PHOTO+ " BLOB)";
        sqLiteDatabase.execSQL(sql);


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+ TBL_NAME);
        onCreate(sqLiteDatabase);

    }
    public void  querryExec(String sql){

        SQLiteDatabase db = getWritableDatabase();
        db.execSQL(sql);
    }
    public Cursor getData(String sql){

        SQLiteDatabase db = getReadableDatabase();
        return db.rawQuery(sql,null);
    }
    public boolean insertData(String name , String day, String hour, String des, byte[] photo){
        try{

            SQLiteDatabase db = getWritableDatabase();
            String sql = "INSERT INTO "+ TBL_NAME+" VALUES(null, ?, ?, ?, ?, ?)";
            SQLiteStatement statement = db.compileStatement(sql);
            statement.bindString(1,name);
            statement.bindString(2,day);
            statement.bindString(3,hour);
            statement.bindString(4,des);
            statement.bindBlob(5,photo);

            statement.executeInsert();
            return true;
        }catch (Exception ex){
            Log.e("Error: ",ex.getMessage().toString());
            return false;
        }



    }
}
