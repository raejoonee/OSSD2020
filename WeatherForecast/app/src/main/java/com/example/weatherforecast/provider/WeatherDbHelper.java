package com.example.weatherforecast.provider;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.weatherforecast.provider.WeatherContract.WeatherColumns;

public class WeatherDbHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;

    static final String DATABASE_NAME = "weather_forecast.db";

    public WeatherDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        final String SQL_CREATE_WEATHER_TABLE = "CREATE TABLE " + WeatherColumns.TABLE_NAME + " (" +
                WeatherColumns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                WeatherColumns.COLUMN_DATE + " INTEGER NOT NULL, " +
                WeatherColumns.COLUMN_SHORT_DESC + " TEXT NOT NULL, " +
                WeatherColumns.COLUMN_MIN_TEMP + " REAL NOT NULL, " +
                WeatherColumns.COLUMN_MAX_TEMP + " REAL NOT NULL, " +

                " UNIQUE (" + WeatherColumns.COLUMN_DATE + ") ON CONFLICT REPLACE);";

        db.execSQL(SQL_CREATE_WEATHER_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + WeatherColumns.TABLE_NAME);
        onCreate(db);
    }
}