package com.mattar.areen.dbase2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class Dal extends SQLiteAssetHelper {
    public Dal(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
    public Dal(Context context){
        super(context,"db2.db",null,1);
    }
    public void addData(String name,String city){
        SQLiteDatabase db=getWritableDatabase();
        String insertd="INSERT INTO table1(name,city)values(name,city)";
        SQLiteStatement statement=db.compileStatement(insertd);


        statement.bindString(1,name);
        statement.bindString(2,city);
        statement.execute();

    }
}
