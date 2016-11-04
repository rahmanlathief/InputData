package id.rahmanlathief.inputdata;

import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by rahmanlathief on 04/11/16.
 */

public class DbHandler  extends SQLiteOpenHelper{

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "db_fakultas";
    private static final String SELECT_TABLE= "tb_mhs";
    private static final String FIELD_NIM= "nim";
    private static final String FIELD_NAMA= "nama";
    private static final String FIELD_KOTA= "kota";




    public DbHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String create_tb = "CREATE TABLE "+SELECT_TABLE+" ("+
                                            FIELD_NIM+" integer primary key,"+
                                            FIELD_NAMA+" text, "+
                                            FIELD_KOTA+" text);";
        sqLiteDatabase.execSQL(create_tb);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE if exist "+SELECT_TABLE);
        onCreate(sqLiteDatabase);
    }

    public void addMahasiswa(Mahasiswa mhs) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues cv = new ContentValues();
        cv.put(FIELD_NIM, mhs.getNim());
        cv.put(FIELD_NAMA, mhs.getNama());
        cv.put(FIELD_KOTA, mhs.getKota());

        db.insert(SELECT_TABLE, null, cv);
        db.close();
    }
}
