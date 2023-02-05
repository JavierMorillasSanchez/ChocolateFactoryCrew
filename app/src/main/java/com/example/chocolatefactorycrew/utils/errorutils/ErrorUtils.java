package com.example.chocolatefactorycrew.utils.errorutils;

import android.content.Context;
import android.widget.Toast;

import com.example.chocolatefactorycrew.R;

public interface ErrorUtils {

    static void genericErrorToast(Context context){
        Toast.makeText(context, R.string.generic_error_text, Toast.LENGTH_LONG).show();
    }

}
