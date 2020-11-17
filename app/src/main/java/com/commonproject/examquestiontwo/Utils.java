package com.commonproject.examquestiontwo;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;

public class Utils {

    /**
     * Convierte el valor de sp a px para asegurarse de que el tamaño del texto permanezca sin cambios
     */
    public static int sp2px(Context context, float spValue) {
        final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (spValue * fontScale + 0.5f);
    }

}