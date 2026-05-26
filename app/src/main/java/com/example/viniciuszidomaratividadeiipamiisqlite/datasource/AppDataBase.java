package com.example.viniciuszidomaratividadeiipamiisqlite.datasource;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.viniciuszidomaratividadeiipamiisqlite.api.ApiUtil;
import com.example.viniciuszidomaratividadeiipamiisqlite.datamodel.ClienteDataModel;
import com.example.viniciuszidomaratividadeiipamiisqlite.datamodel.UsuarioDataModel;

public class AppDataBase extends SQLiteOpenHelper {
    public static final String NAME = "atividade_vinicius_zidomar.sqlite";
    public static int version = 1;

    SQLiteDatabase db;
    public AppDataBase(Context context) {
        super(context, NAME,null, version);
        db   = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.i(ApiUtil.TAG, "Criando Tabela Cliente"+ ClienteDataModel.TABELA);
        db.execSQL(ClienteDataModel.criarTabela());
        Log.i(ApiUtil.TAG, "Criando Tabela Usuario"+ UsuarioDataModel.TABELA);
        db.execSQL(UsuarioDataModel.criarTabela());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
