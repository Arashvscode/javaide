package com.duy.editor.compile;

import android.util.Log;

import com.duy.editor.EditContract;
import com.duy.editor.editor.MainActivity;

import java.util.List;

import javax.tools.Diagnostic;

/**
 * Created by duy on 19/07/2017.
 */

public class DiagnosticPresenter implements DiagnosticContract.Presenter {

    private static final String TAG = "DiagnosticPresenter";
    private DiagnosticContract.View view;
    private MainActivity mainActivity;
    private EditContract.Presenter mEditPresenter;

    public DiagnosticPresenter(DiagnosticContract.View view, EditContract.Presenter editPresenter) {
        this.view = view;
        this.mEditPresenter = editPresenter;
    }

    @Override
    public void click(Diagnostic diagnostic) {
        Log.d(TAG, "click() called with: diagnostic = [" + diagnostic + "]");

    }

    public void display(List<Diagnostic> diagnostics) {
        view.display(diagnostics);
    }
}
