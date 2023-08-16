package com.bitcoin.bitcointechmedia_ide.app;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPrefs {
    public static final String WA_TREE_URI = "wa_tree_uri";
    private static SharedPreferences mPreferences;

    private static SharedPreferences getInstance(Context context) {
        if (mPreferences == null) {
            mPreferences = context.getApplicationContext().getSharedPreferences("wa_data", 0);
        }
        return mPreferences;
    }

    public static void setWATree(Context context, String str) {
        getInstance(context).edit().putString(WA_TREE_URI, str).apply();
    }

    public static String getWATree(Context context) {
        return getInstance(context).getString(WA_TREE_URI, "");
    }
}
