package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import com.example.myapp.databinding.DialogExampleBinding

class CustomDialog(context: Context) {

    private val dialogBinding: DialogExampleBinding =
        DialogExampleBinding.inflate(LayoutInflater.from(context))

    private val dialog: AlertDialog = AlertDialog.Builder(context)
        .setView(dialogBinding.root)
        .create()

    init {
        dialogBinding.dialogTitle.text = "Custom Dialog"
        dialogBinding.dialogButton.setOnClickListener {
            dialog.dismiss()
        }
    }

    fun show() {
        dialog.show()
    }
}
