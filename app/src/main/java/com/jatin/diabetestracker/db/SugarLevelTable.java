package com.jatin.diabetestracker.db;

/**
 * Created by Jatin on 05-08-2016.
 */
public class SugarLevelTable extends DbTable {

    public static final String TABLE_NAME = "sugar_level";

    public interface Columns {
        String ID = "id";
        String GLUCOSE_LEVEL = "glucose_level";
        String DATE = "date";
        String NOTE = "note";
    }

    public static final String TABLE_CREATE_CMD =
            "CREATE TABLE IF NOT EXISTS " + TABLE_NAME +
                    LBR
                    + Columns.ID + TYPE_INT_PK + " AUTOINCREMENT " + COMMA
                    + Columns.GLUCOSE_LEVEL + TYPE_REAL + COMMA
                    + Columns.DATE + TYPE_TEXT + COMMA
                    + Columns.NOTE + TYPE_TEXT
                    + RBR + ";";
}
